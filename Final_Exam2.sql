DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;

 -- câu 1:a, Tạo table với các ràng buộc và kiểu dữ liệu
DROP TABLE IF EXISTS GiangVien;
CREATE TABLE GiangVien(
	magv TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    hoten VARCHAR(30) NOT NULL,
    luong DOUBLE NOT NULL
);

DROP TABLE IF EXISTS SinhVien;
CREATE TABLE SinhVien(
	masv TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    hoten VARCHAR(30) NOT NULL,
    namsinh DATE NOT NULL,
    quequan VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS DeTai;
CREATE TABLE DeTai(
	madt TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    tendt VARCHAR(30) NOT NULL UNIQUE KEY,
    kinhphi DOUBLE NOT NULL,
    NoiThucTap VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS HuongDan;
CREATE TABLE HuongDan (
	id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    masv TINYINT UNSIGNED NOT NULL,
    madt TINYINT UNSIGNED NOT NULL,
    magv TINYINT UNSIGNED NOT NULL,
    ketqua SMALLINT UNSIGNED NOT NULL,
    FOREIGN KEY (masv) REFERENCES SinhVien (masv) ON DELETE CASCADE,
    FOREIGN KEY (madt) REFERENCES DeTai (madt),
    FOREIGN KEY (magv) REFERENCES GiangVien (magv)
);

-- câu 1: b,Thêm ít nhất 3 bản ghi vào table

INSERT INTO GiangVien(hoten,luong) VALUES ('Nguyen Van A',10000000);
INSERT INTO GiangVien(hoten,luong) VALUES ('Nguyen Van B',10000555000);
INSERT INTO GiangVien(hoten,luong) VALUES ('Nguyen Van C',1000088888000);

INSERT INTO SinhVien(hoten,namsinh,quequan) VALUES ('SV1','1997-05-13','HANOI');
INSERT INTO SinhVien(hoten,namsinh,quequan) VALUES ('SV2','1998-10-10','HANAM');
INSERT INTO SinhVien(hoten,namsinh,quequan) VALUES ('SV3','1999-12-29','HATIEN');

INSERT INTO DeTai(tendt,kinhphi,NoiThucTap) VALUES ('CONG NGHE SINH HOC',1000,'VTI1');
INSERT INTO DeTai(tendt,kinhphi,NoiThucTap) VALUES ('DT2',1022200,'VTI2');
INSERT INTO DeTai(tendt,kinhphi,NoiThucTap) VALUES ('DT3',1044444400,'VTI3');

INSERT INTO HuongDan(masv,madt,magv,ketqua) VALUES (1,1,1,8);
INSERT INTO HuongDan(masv,madt,magv,ketqua) VALUES (2,2,2,9);
INSERT INTO HuongDan(masv,madt,magv,ketqua) VALUES (3,3,3,10);

-- câu 2: a) Lấy tất cả các sinh viên chưa có đề tài hướng dẫn

SELECT sv.masv AS Mã_SV, sv.hoten AS Tên, sv.namsinh AS Năm_Sinh, sv.quequan AS Quê_Quán FROM HuongDan hd
JOIN SinhVien sv ON sv.masv = hd.masv
GROUP BY hd.masv
HAVING COUNT(hd.madt) = 0;

-- câu 2: b) Lấy ra số sinh viên làm đề tài ‘CONG NGHE SINH HOC’

SELECT COUNT(hd.masv) AS Số_Lượng, dt.tendt AS Tên_Đề_Tài FROM HuongDan hd
JOIN DeTai dt ON hd.madt = dt.madt
GROUP BY hd.madt
HAVING dt.tendt = 'CONG NGHE SINH HOC';

-- câu 3:Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm:
--           mã số, họ tên và tên đề tài
--           ( Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")

CREATE VIEW SinhVienInfo AS
SELECT sv.masv AS Mã_SV, sv.hoten AS Họ_Tên, dt.tendt AS Tên_Đề_Tài 
FROM HuongDan hd
JOIN SinhVien sv ON hd.masv = sv.masv
JOIN DeTai dt ON hd.madt = dt.madt;

SELECT * FROM SinhVienInfo;


-- câu 4: Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900
--            thì hiện ra thông báo "năm sinh phải > 1900"

DROP TRIGGER IF EXISTS UpdateSV;
DELIMITER $$
CREATE TRIGGER UpdateSV
BEFORE UPDATE ON SinhVien
FOR EACH ROW
BEGIN
	IF NEW.namsinh <= 1900 THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'năm sinh phải > 1900';
	ELSE
		UPDATE SinhVien SET namsinh = NEW.namsinh WHERE namsinh > 1900;
	END IF;
END$$
DELIMITER ;
    
-- câu 5: Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông
--            tin trong table HuongDan liên quan tới sinh viên đó sẽ bị xóa đi

DROP TRIGGER IF EXISTS DeleteSV;
DELIMITER $$
CREATE TRIGGER DeleteSV
BEFORE DELETE ON SinhVien
FOR EACH ROW
BEGIN
	DELETE FROM SinhVien  WHERE (masv=OLD.masv);
END$$
DELIMITER ;

DELETE FROM SinhVien WHERE masv = 1;