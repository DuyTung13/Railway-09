DROP DATABASE IF EXISTS Facebook;
CREATE DATABASE Facebook;
USE Facebook;

-- câu 1:  Tạo table với các ràng buộc và kiểu dữ liệu ------
DROP TABLE IF EXISTS `National`;
CREATE TABLE  `National`(
	National_id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    National_Name VARCHAR(50) NOT NULL UNIQUE KEY,
    Language_Main VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS `Office`;
CREATE TABLE `Office` (
	Office_id SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Street_Address VARCHAR(50) NOT NULL UNIQUE KEY,
    National_id TINYINT UNSIGNED NOT NULL UNIQUE KEY,
    FOREIGN KEY (National_id) REFERENCES `National`(National_id)
);

DROP TABLE IF EXISTS `Staff`;
CREATE TABLE `Staff` (
	Staff_id MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    First_Name VARCHAR(20) NOT NULL ,
    Last_Name VARCHAR(20) NOT NULL ,
    Email VARCHAR(50) NOT NULL,
    Office_id SMALLINT UNSIGNED NOT NULL ,
    FOREIGN KEY (Office_id) REFERENCES `Office`(Office_id)
);

-- câu 2: Thêm 10 bản ghi vào các table ---------

INSERT INTO `National` (National_Name,Language_Main) VALUE ('Viet Nam','Tieng Viet');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('Anh','Tieng Anh');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('My','Tieng Anh');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('Thai Lan','Tieng Thai');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('Trung Quoc','Tieng Trung');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('Duc','Tieng Duc');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('Ha Lan','Tieng Anh');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('Lao','Tieng Lao');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('Han Quoc','Tieng Han');
INSERT INTO `National` (National_Name,Language_Main) VALUE ('Nhat Ban','Tieng Nhat');

INSERT INTO `Office` (Street_Address,National_id) VALUE ('Ha Noi','1');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('American','3');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('London','2');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('Bangkok','4');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('Bac Kinh','5');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('Berlin','6');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('Am-xtec-dam','7');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('Vieng Chan','8');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('Seoul','9');
INSERT INTO `Office` (Street_Address,National_id) VALUE ('Tokyo','10');

INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','A','a.nguyenvan@gmail.com.vn',1);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','B','b.nguyenvan@gmail.com.vn',2);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','C','c.nguyenvan@gmail.com.vn',3);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','D','d.nguyenvan@gmail.com.vn',4);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','E','e.nguyenvan@gmail.com.vn',5);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','F','f.nguyenvan@gmail.com.vn',6);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','G','g.nguyenvan@gmail.com.vn',7);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','H','h.nguyenvan@gmail.com.vn',8);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','K','k.nguyenvan@gmail.com.vn',9);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','I','i.nguyenvan@gmail.com.vn',10);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IA','ia.nguyenvan@gmail.com.vn',1);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IB','ib.nguyenvan@gmail.com.vn',2);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IC','ic.nguyenvan@gmail.com.vn',3);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','ID','id.nguyenvan@gmail.com.vn',4);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IE','ie.nguyenvan@gmail.com.vn',5);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IF','if.nguyenvan@gmail.com.vn',6);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IG','ig.nguyenvan@gmail.com.vn',7);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IH','ih.nguyenvan@gmail.com.vn',8);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IK','ik.nguyenvan@gmail.com.vn',9);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','II','ii.nguyenvan@gmail.com.vn',10);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IAA','iaa.nguyenvan@gmail.com.vn',1);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IBB','ibb.nguyenvan@gmail.com.vn',2);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','ICC','icc.nguyenvan@gmail.com.vn',3);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IDD','idd.nguyenvan@gmail.com.vn',4);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IEE','iee.nguyenvan@gmail.com.vn',5);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IFF','iff.nguyenvan@gmail.com.vn',6);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IGG','igg.nguyenvan@gmail.com.vn',7);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IHH','ihh.nguyenvan@gmail.com.vn',8);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','IKK','ikk.nguyenvan@gmail.com.vn',9);
INSERT INTO `Staff` (First_Name,Last_Name,Email,Office_id) VALUE ('Nguyen Van','III','iii.nguyenvan@gmail.com.vn',10);

-- câu 3: Bạn hãy lấy dữ liệu của tất cả nhân viên đang làm việc tại Vietnam ------

SELECT s.Staff_id, s.First_Name, s.Last_Name, s.Email FROM `Staff` s 
JOIN `Office` o ON s.Office_id = o.Office_id
JOIN `National` n ON o.National_id = n.National_id
WHERE n.National_Name= 'Viet Nam';

-- câu 4: Lấy ra ID, FullName, Email, National của mỗi nhân viên -----------

SELECT s.Staff_id, concat(s.First_Name, s.Last_Name) AS FullName, s.Email , n.National_Name FROM `Staff` s
JOIN `Office` o ON s.Office_id = o.Office_id
JOIN `National` n ON o.National_id = n.National_id
ORDER BY s.Staff_id ASC;

-- câu 5: Lấy ra tên nước mà nhân viên có Email: "daonq@viettel.com.vn" đang làm việc --------

SELECT n.National_Name FROM `Staff` s
JOIN `Office` o ON s.Office_id = o.Office_id
JOIN `National` n ON o.National_id = n.National_id
WHERE s.Email = 'daonq@viettel.com.vn';

-- câu 6: Bạn hãy tìm xem trên hệ thống có quốc gia nào có thông tin trên hệ thống nhưng không có nhân viên nào đang làm việc -------

SELECT n.National_Name , count(s.Staff_id) AS SL FROM `Staff` s
JOIN `Office` o ON s.Office_id = o.Office_id
JOIN `National` n ON o.National_id = n.National_id
GROUP BY Staff_id
HAVING  s.Staff_id = 0;

-- câu 7: Thống kê xem trên thế giới có bao nhiêu quốc gia mà FB đang hoạt động sử dụng tiếng Anh làm ngôn ngữ chính ------

SELECT n.National_Name FROM `National` n WHERE n.Language_Main = 'Tiếng Anh';

-- câu 8: Viết lệnh để lấy ra thông tin nhân viên có tên (First_Name) có 10 ký tự, bắt đầu bằng chữ N và kết thúc bằng chữ C ------

SELECT * , count(char_length(s.First_Name)) AS SL FROM `Staff` s WHERE s.First_Name LIKE 'N%c'
ORDER BY char_length(s.First_Name) DESC;

-- câu 9: Bạn hãy tìm trên hệ thống xem có nhân viên nào đang làm việc nhưng do nhập khi nhập liệu bị lỗi mà nhân viên đó vẫn chưa cho thông tin về trụ sở làm việc(Office)------



-- câu 10: Nhân viên có mã ID =9 hiện tại đã nghỉ việc, bạn hãy xóa thông tin của nhân viên này trên hệ thống -----

DELETE FROM `Staff`  WHERE Staff_id = 9;

-- câu 11: FB vì 1 lý do nào đó không còn muốn hoạt động tại Australia nữa, và Mark Zuckerberg muốn bạn xóa tất cả các thông tin trên hệ thống liên quan đến quốc gia này. Hãy tạo 1 Procedure có đầu vào là tên quốc gia cần xóa thông tin để làm việc này và gửi lại cho anh ấy --------



-- câu 12: Mark muốn biết xem hiện tại đang có bao nhiêu nhân viên trên toàn thế giới đang làm việc cho anh ấy, hãy viết cho anh ấy 1 Function để a ấy có thể lấy dữ liệu này 1 cách nhanh chóng---------



-- câu 13: Để thuận tiện cho việc quản trị Mark muốn số lượng nhân viên tại mỗi quốc gia chỉ tối đa 10.000 người. Bạn hãy tạo trigger cho table Staff chỉ cho phép insert mỗi quốc gia có tối đa 10.000 nhân viên giúp anh ấy (có thể cấu hình số lượng nhân viên nhỏ hơn vd 11 nhân viên để Test) ---------




-- câu 14:  Bạn hãy viết 1 Procedure để lấy ra tên trụ sở mà có số lượng nhân viên đang làm việc nhiều nhất----------

DROP PROCEDURE IF EXISTS SP_GetMaxStaffFromOffice;
DELIMITER $$j 
CREATE PROCEDURE SP_GetMaxStaffFromOffice()
BEGIN
WITH CTE_GetCountStaff_id AS (
	SELECT s.Office_id, count(s.Staff_id) AS SL FROM `Staff` s
	GROUP BY s.Office_id
)
SELECT o.Office_id , o.Street_Address,  o.National_id, count(s.Staff_id) AS SL  FROM `Staff` s
INNER JOIN `Office` o ON o.Office_id = s.Office_id
GROUP BY s.Office_id
HAVING count(s.Office_id) = (SELECT max(SL) FROM CTE_GetCountStaff_id);
END $$

CALL SP_GetMaxStaffFromOffice();

-- câu 15: Bạn hãy viết 1 Function để khi nhập vào thông tin Email của nhân viên thì sẽ trả ra thông tin đầy đủ của nhân viên đó-------



-- câu 16:  Bạn hãy viết 1 Trigger để khi thực hiện cập nhật thông tin về trụ sở làm việc của nhân viên đó thì hệ thống sẽ tự động lưu lại trụ sở cũ của nhân viên vào 1 bảng khác có tên Log_Office để Mark có thể xem lại khi cần thiết-----------



-- câu 17: FB đang vướng vào 1 đạo luật hạn chế hoạt động, FB chỉ có thể hoạt động tối đa trên 100 quốc gia trên thế giới, hãy tạo Trigger để ngăn người nhập liệu nhập vào quốc gia thứ 101 (bạn có thể sử dụng số nước nhỏ hơn để Test VD 11 nước)------



-- câu 18: Thống kê mỗi xem mỗi nước(National) đang có bao nhiêu nhân viên đang làm việc -----



-- câu 19: Viết Procedure để thống kê mỗi xem mỗi nước(National) đang có bao nhiêu nhân viên đang làm việc, với đầu vào là tên nước ---------



-- câu 20: Thống kê mỗi xem trong cùng 1 trụ sở (Office) đang có bao nhiêu employee đang làm việc --------



-- câu 21: Viết Procedure để thống kê mỗi xem trong cùng 1 trụ sở (Office) đang có bao nhiêu employee đang làm việc đầu vào là ID của trụ sở---------



-- câu 22: Viết Procedure để lấy ra tên quốc gia đang có nhiều nhân viên nhất ----------

DROP PROCEDURE IF EXISTS SP_GetMaxStaffFromNation;
DELIMITER $$
CREATE PROCEDURE SP_GetMaxStaffFromNation()
BEGIN
WITH CTE_GetCountStaff_id AS (
	SELECT s.Office_id, count(s.Staff_id) AS SL FROM `Staff` s
	GROUP BY s.Office_id
)
SELECT o.Office_id , o.Street_Address,  o.National_id, count(s.Staff_id) AS SL  FROM `Staff` s
INNER JOIN `Office` o ON o.Office_id = s.Office_id
GROUP BY s.Office_id
HAVING count(s.Office_id) = (SELECT max(SL) FROM CTE_GetCountStaff_id);
END $$

CALL SP_GetMaxStaffFromNation();


-- câu 23: Thống kê mỗi country có bao nhiêu employee đang làm việc ---------



-- câu 24: Bạn hãy cấu hình lại các bảng và ràng buộc giữ liệu sao cho khi xóa 1 trụ sở làm việc (Office) thì tất cả dữ liệu liên quan đến trụ sở này sẽ chuyển về Null ---------



-- câu 25: Bạn hãy cấu hình lại các bảng và ràng buộc giữ liệu sao cho khi xóa 1 trụ sở làm việc (Office) thì tất cả dữ liệu liên quan đến trụ sở này sẽ bị xóa hết -------------




