DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE Fresher;
USE Fresher;

-- cau1:tạo table với các ràng buộc và kiểu dữ liệu -----

DROP TABLE IF EXISTS `Trainee`;
CREATE TABLE `Trainee`(
	TraineeID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name VARCHAR(50) NOT NULL,
    Birth_Date DATE NOT NULL,
    Gender ENUM('Male','Female','Unknown') NOT NULL,
    ET_IQ INTEGER NOT NULL CHECK (ET_IQ BETWEEN 0 AND 20),
    ET_Gmath INTEGER NOT NULL CHECK (ET_Gmath BETWEEN 0 AND 20),
    ET_English INTEGER NOT NULL CHECK (ET_English BETWEEN 0 AND 50),
    Training_Class VARCHAR(20) NOT NULL,
    Evaluation_Notes VARCHAR(50) NOT NULL
    );
    
-- cau2: Thêm ít nhất 10 bản ghi---------

INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van A','1997-01-01','Male',20,20,50,'VTI001','DHTNMT');
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van B','2000-01-02','Male',19,19,40,'VTI002','DHTNMT');
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van C','2001-01-03','Female',18,18,30,'VTI003','DHBKHN');	
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van D','1995-01-04','Male',17,17,20,'VTI004','DHHN');	
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van E','1996-01-05','Female',16,16,10,'VTI005','HVTC');	
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van F','1998-01-06','Male',15,15,20,'VTI001','HVNV');	
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van G','1999-01-07','Female',14,14,30,'VTI002','HVNG');	
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van H','2002-01-08','Male',13,13,40,'VTI003','DHQGVN');	
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van I','1994-01-09','Female',12,12,50,'VTI004','DHNV');	
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van K','1993-01-10','Male',11,11,30,'VTI005','DHVH');	
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van K','1993-01-10','Unknown',11,11,30,'VTI005','DHVH');
INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van KC','1992-01-10','Unknown',11,11,30,'VTI001','DHVH2');		

-- cau3:Insert 1 bản ghi mà có điểm ET_IQ=30--------

INSERT INTO `Trainee` (Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes) VALUES ('Nguyen Van K','1997-01-10','Male',30,11,30,'VTI005','DHVH');	

-- cau4:Viết lệnh để lấy ra tất cả các thực tập sinh, sắp xếp theo ngày sinh,điểm ET_IQ>=12 ET_Gmath>=12 ET_English>=20--------

SELECT * FROM `Trainee` t WHERE t.ET_IQ>=12 AND t.ET_Gmath>=12 AND t.ET_English>=20
ORDER BY t.Birth_Date ASC;

-- cau5: Viết lệnh lấy thông tin có tên bắt đầu bằng N và kết thúc bằng C--------

SELECT * FROM `Trainee` t WHERE t.Full_Name LIKE 'N%c';

-- cau6 Viết lệnh lấy thông tin tên có ký tự thứ 2 là G ------------

SELECT * FROM `Trainee` t WHERE t.Full_Name LIKE '_g';

-- cau7:Viết lệnh lấy thông tin tên có 10 ký tự và cuối cùng là C ------

SELECT * , count(char_length(t.Full_Name)) AS SL FROM `Trainee` t WHERE t.Full_Name LIKE '%c'
ORDER BY char_length(t.Full_Name) DESC;

-- cau8:Viết lệnh lấy ra FullName trong lớp, lọc bỏ tên trùng nhau -----------

SELECT DISTINCT t.Full_Name FROM `Trainee` t;

-- cau9:Viết lệnh lấy ra FullName trong lớp và sắp xếp theo thứ tự A-Z ---------

SELECT t.Full_Name FROM `Trainee` t
ORDER BY t.Full_Name ASC;

-- cau10:Viết lệnh để thấy thông tin tên dài nhất ---------

SELECT t.Full_Name , char_length(t.Full_Name) AS length_of_fullname FROM `Trainee` t
ORDER BY char_length(t.Full_Name) DESC
LIMIT 1;

-- cau11:lấy ID, FullName và ngày sinh có tên dài nhất -------

SELECT t.TraineeID, t.Full_Name , t.Birth_Date, char_length(t.Full_Name) AS length_of_fullname FROM `Trainee` t
ORDER BY char_length(t.Full_Name) DESC
LIMIT 1;

-- cau12:Viết lệnh để lấy ra Tên, và điểm IQ, Gmath, English thực tập sinh có tên dài nhất ---------

SELECT t.ET_IQ, t.Full_Name , t.ET_Gmath, t.ET_English, char_length(t.Full_Name) AS length_of_fullname FROM `Trainee` t
ORDER BY char_length(t.Full_Name) DESC
LIMIT 1;

-- cau13:Lấy ra 5 thực tập sinh có tuổi nhỏ nhất -------

SELECT MIN(YEAR(CURDATE()) - YEAR(t.Birth_Date)) AS MinAge FROM `Trainee` t;

-- cau14:Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người thỏa mãn số điểm như sau:• ET_IQ + ET_Gmath>=20• ET_IQ>=8• ET_Gmath>=8• ET_English>=18--------

SELECT * FROM `Trainee` t WHERE t.ET_IQ>=8 AND ET_English>=18 AND (t.ET_IQ + t.ET_Gmath) >=20;

-- cau15:Xóa thực tập sinh có TraineeID = 5

DELETE FROM `Trainee` t WHERE t.TraineeID = 5;

-- cau16:Xóa thực tập sinh có tổng điểm ET_IQ, ET_Gmath <=15

DELETE FROM `Trainee` t WHERE (t.ET_IQ + t.ET_Gmath) <=15;

-- cau17:Xóa thực tập sinh quá 30 tuổi.

DELETE FROM `Trainee` t WHERE YEAR(CURDATE()) - YEAR(t.Birth_Date) > 30;

-- cau18:Thực tập sinh có TraineeID = 3 được chuyển sang lớp " VTI003". Hãy cập nhật thông tin vào database.

UPDATE `Trainee` t SET t.Training_Class = 'VTI003' WHERE t.TraineeID = 3;

-- cau19:Do có sự nhầm lẫn khi nhập liệu nên thông tin của học sinh số 10 đang bị sai,hãy cập nhật lại tên thành “LeVanA”, điểm ET_IQ =10, điểm ET_Gmath =15, điểm ET_English = 30.

UPDATE `Trainee` t SET t.Full_Name = 'Le Van A' , t.ET_IQ = 10 , t.ET_Gmath =15 , t.ET_English =30;

-- cau20:Đếm xem trong lớp VTI001 có bao nhiêu thực tập sinh

SELECT count(t.TraineeID) as SL_TTS FROM `Trainee` t WHERE t.Training_Class='VTI001';

-- cau22:Đếm tổng số thực tập sinh trong lớp VTI001 và VTI003 có bao nhiêu thực tập sinh.

SELECT t.Training_Class, count(*) AS SL FROM `Trainee` t GROUP BY t.Training_Class HAVING t.Training_Class='VTI001' OR t.Training_Class='VTI003'; 

-- cau23:Lấy ra số lượng các thực tập sinh theo giới tính: Male, Female, Unknown.

SELECT t.Gender , count(*) AS SL FROM `Trainee` t GROUP BY t.Gender HAVING t.Gender='Male' OR t.Gender='Female' OR t.Gender='Unknown';

-- cau24:Lấy ra lớp có lớn hơn 5 thực tập viên

SELECT t.Training_Class , count(t.TraineeID) AS SL FROM  `Trainee` t GROUP BY Training_Class HAVING count(t.TraineeID) >5;

-- cau26:Lấy ra trường có ít hơn 4 thực tập viên tham gia khóa học

SELECT t.Evaluation_Notes , count(t.TraineeID) AS SL FROM  `Trainee` t GROUP BY Evaluation_Notes HAVING count(t.TraineeID) <4;

-- cau27: Bước 1: Lấy ra danh sách thông tin ID, Fullname, lớp thực tập viên có lớp'VTI001'
--        Bước 2: Lấy ra danh sách thông tin ID, Fullname, lớp thực tập viên có lớp 'VTI002'
--        Bước 3: Sử dụng UNION để nối 2 kết quả ở bước 1 và 2

SELECT t.TraineeID , t.Full_Name, t.Training_Class FROM `Trainee` t WHERE t.Training_Class = 'VTI001'
UNION All
SELECT t.TraineeID , t.Full_Name, t.Training_Class FROM `Trainee` t WHERE t.Training_Class = 'VTI002';