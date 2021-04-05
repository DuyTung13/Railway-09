USE testingsystem;

-- câu 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó----

DROP PROCEDURE IF EXISTS sp_GetDepNameFromDepID;
DELIMITER $$
CREATE PROCEDURE sp_GetDepNameFromDepID(IN in_AccountID TINYINT)
BEGIN
	SELECT a.AccountID, a.FullName, d.DepartmentNAME FROM `Account` a
	INNER JOIN Department d ON a.DepartmentID = d.DepartmentID
    WHERE a.AccountID = in_AccountID;
END$$
DELIMITER 

Call sp_GetDepNameFromDepID(2);

-- câu 2: Tạo store để in ra số lượng account trong mỗi group-----

DROP PROCEDURE IF EXISTS sp_GetAccountFromGroup;
DELIMITER $$
CREATE PROCEDURE sp_GetAccountFromGroup(IN in_AccountID TINYINT)
BEGIN
	SELECT g.GroupName, count(a.AccountID) AS SL FROM `Account` a
	INNER JOIN `Group` g ON g.CreatorID = a.AccountID
    WHERE a.AccountID = in_AccountID;
END$$
DELIMITER 

Call sp_GetAccountFromGroup(2);

-- câu 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại------

DROP PROCEDURE IF EXISTS sp_GetTypeFromQuestion;
DELIMITER $$
CREATE PROCEDURE sp_GetTypeFromQuestion(IN in_TypeID TINYINT)
BEGIN
	SELECT tq.TypeName, count(tq.TypeID) AS SL FROM TypeQuestion tq
	INNER JOIN Question q ON q.TypeID = tq.TypeID
    WHERE tq.TypeID = in_TypeID;
END$$
DELIMITER 

Call sp_GetTypeFromQuestion(2);

-- câu 4:Tạo store để trả ra id của type question có nhiều câu hỏi nhất -----

DROP PROCEDURE IF EXISTS SP_GetMaxTypeQuestion;
DELIMITER $$
CREATE PROCEDURE SP_GetMaxTypeQuestion(IN in_TypeID TINYINT)
BEGIN
	SELECT tq.TypeName, count(tq.TypeID) AS SL FROM TypeQuestion tq
	INNER JOIN Question q ON q.TypeID = tq.TypeID
    WHERE tq.TypeID = in_TypeID;
END$$
DELIMITER 

Call SP_GetMaxTypeQuestion();

-- câu 5: Sử dụng store ở question 4 để tìm ra tên của type question -----

DROP PROCEDURE IF EXISTS SP_GetMaxTypeName;
DELIMITER $$
CREATE PROCEDURE SP_GetMaxTypeName(IN in_TypeName VARCHAR(20))
BEGIN
	SELECT tq.TypeName, count(tq.TypeID) AS SL FROM TypeQuestion tq
	INNER JOIN Question q ON q.TypeID = tq.TypeID
    WHERE tq.TypeID = in_TypeID;
END$$
DELIMITER 

Call SP_GetMaxTypeName();

