DROP DATABASE IF EXISTS VTIMarkManagement;
CREATE DATABASE VTIMarkManagement;
USE VTIMarkManagement;

-- câu 1:Tạo table với các ràng buộc và kiểu dữ liệu

DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee(
	Trainee_ID TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    First_Name VARCHAR(20) NOT NULL,
    Last_Name VARCHAR(20) NOT NULL,
    Age SMALLINT NOT NULL ,
    Gender ENUM('Male','Female','Unknow')
);

DROP TABLE IF EXISTS `Subject`;
CREATE TABLE `Subject`(
	Subject_ID TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Subject_Name VARCHAR(20) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS Trainee_Subject;
CREATE TABLE Trainee_Subject(
	Trainee_ID TINYINT UNSIGNED NOT NULL,
    Subject_ID TINYINT UNSIGNED NOT NULL,
    Mark SMALLINT NOT NULL,
    Exam_Day DATE NOT NULL,
    FOREIGN KEY (Trainee_ID) REFERENCES Trainee(Trainee_ID),
    FOREIGN KEY (Subject_ID) REFERENCES `Subject`(Subject_ID)
);

INSERT INTO Trainee (First_Name,Last_Name,Age,Gender) VALUE ('Nguyen Van', 'A', 18 , 'Male');
INSERT INTO Trainee (First_Name,Last_Name,Age,Gender) VALUE ('Nguyen Van', 'B', 19 , 'Female');
INSERT INTO Trainee (First_Name,Last_Name,Age,Gender) VALUE ('Nguyen Van', 'C', 20 , 'Unknow');

INSERT INTO  `Subject`(Subject_Name) VALUE ('Java');
INSERT INTO  `Subject`(Subject_Name) VALUE ('SQL');
INSERT INTO  `Subject`(Subject_Name) VALUE ('Python');
INSERT INTO  `Subject`(Subject_Name) VALUE ('Frontent');

INSERT INTO Trainee_Subject(Trainee_ID,Subject_ID,Mark,Exam_Day) VALUE (1,1,7,'2021-04-01');
INSERT INTO Trainee_Subject(Trainee_ID,Subject_ID,Mark,Exam_Day) VALUE (2,2,8,'2021-04-02');
INSERT INTO Trainee_Subject(Trainee_ID,Subject_ID,Mark,Exam_Day) VALUE (3,3,9,'2021-04-03');
INSERT INTO Trainee_Subject(Trainee_ID,Subject_ID,Mark,Exam_Day) VALUE (1,1,9,'2021-04-03');
INSERT INTO Trainee_Subject(Trainee_ID,Subject_ID,Mark,Exam_Day) VALUE (2,2,7,'2021-04-02');

-- câu 2: a,Lấy tất cả các môn học không có bất kì điểm nào

SELECT s.Subject_Name, ts.Mark FROM Trainee_Subject ts
INNER JOIN `Subject` s ON s.Subject_ID = ts. Subject_ID
WHERE COUNT(ts.Mark)= NULL;

-- câu 2: b, Lấy danh sách các môn học có ít nhất 2 điểm

SELECT s.Subject_ID, s.Subject_Name FROM Trainee_Subject ts
INNER JOIN `Subject` s ON s.Subject_ID = ts. Subject_ID
GROUP BY Subject_Name
HAVING count(ts.Mark)>=2;

-- câu 3 :Tạo view có tên là " TraineeInfo" lấy các thông tin về học sinh bao gồm:
--            Trainee_ID, FullName, Age, Gender, Subject_ID, Subject_Name, Mark, Exam_Day

CREATE VIEW TraineeInfo AS
SELECT t.Trainee_ID, concat(t.First_Name,t.Last_Name),t.Age,t.Gender,s.Subject_ID,s.Subject_Name,ts.Mark,ts.Exam_Day
FROM Trainee_Subject ts
INNER JOIN Trainee t ON ts.Trainee_ID=t.Trainee_ID
INNER JOIN `Subject` s ON s.Subject_ID = ts. Subject_ID;

SELECT  * FROM TraineeInfo;

-- câu 4: a, Tạo trigger cho table Subject có tên là SubjectUpdateID:Khi thay đổi data của cột ID của
--                 table Subject, thì giá trị tương ứng với cột Subject_ID của table trainee_subject cũng thay
--                 đổi theo

DROP TRIGGER IF EXISTS SubjectUpdateID;
DELIMITER $$
CREATE TRIGGER SubjectUpdateID
BEFORE UPDATE ON `Subject`
FOR EACH ROW
BEGIN
	UPDATE Trainee_Subject SET Subject_ID = NEW.Subject_ID WHERE (Subject_ID=OLD.Subject_ID);
END$$
DELIMITER ;

-- câu 4: b,Tạo trigger cho table trainee có tên là StudentDeleteID:
--                Khi xóa data của cột ID của table trainee, thì giá trị tương ứng với cột SubjectID của table
--                trainee_subject cũng bị xóa theo.

DROP TRIGGER IF EXISTS StudentDeleteID;
DELIMITER $$
CREATE TRIGGER StudentDeleteID
BEFORE UPDATE ON Trainee
FOR EACH ROW
BEGIN
	DELETE FROM Trainee  WHERE (Trainee_ID=OLD.Trainee_ID);
END$$
DELIMITER ;

DELETE FROM Trainee WHERE Trainee_ID = 1;

-- câu 5: Viết 1 Store Procedure có đầu vào parameter trainee_name sẽ xóa tất cả các
--             thông tin liên quan tới học sinh có cùng tên như parameter
--             Trong trường hợp nhập vào name = "*" thì procedure sẽ xóa tất cả các học sinh


DROP PROCEDURE IF EXISTS sp_DeleteTrainee;
DELIMITER $$
CREATE PROCEDURE sp_DeleteTrainee (IN Trainee_name VARCHAR(50))
BEGIN
	DECLARE t_Trainee_ID TINYINT;
    IF Trainee_name = '*'
    THEN DELETE FROM Trainee;
	ELSE
		SELECT t.Trainee_ID INTO t_Trainee_ID FROM Trainee t 
        WHERE t.First_Name = Trainee_name;
        DELETE FROM Trainee WHERE t.Trainee_ID = t_Trainee_ID;
	END IF;
END$$
DELIMITER 

Call sp_DeleteTrainee();




