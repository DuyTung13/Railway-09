USE testingsystem;

-- câu 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale ----


-- câu 2 : Tạo view có chứa thông tin các account tham gia vào nhiều group nhất -----
CREATE OR REPLACE VIEW vw_GetcountAccountID AS
WITH CTE_GetCountAccountID AS (
	SELECT ga.GroupID, count(ga.AccountID) AS SL FROM GroupAccount ga
	GROUP BY ga.AccountID
)
SELECT ga.AccountID , a.Email, a.FullName, count(ga.AccountID) AS SL  FROM GroupAccount ga
INNER JOIN `Account` a ON a.AccountID = ga.AccountID
GROUP BY ga.AccountID
HAVING count(ga.AccountID) = (SELECT max(SL) FROM CTE_GetCountAccountID );

-- câu 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi ---


    
-- câu 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất -------

CREATE OR REPLACE VIEW vw_GetCountMaxAccount AS
WITH CTE_GetCountMaxAccount AS (
	SELECT p.PositionID, count(p.PositionID) AS SL FROM Position p
	GROUP BY p.PositionID
)
SELECT p.PositionID , p.PositionName, count(a.AccountID) AS SL  FROM `Account` a
INNER JOIN Position p ON p.PositionID = a.PositionID
GROUP BY a.PositionID
HAVING count(a.PositionID) = (SELECT max(SL) FROM CTE_GetCountMaxAccount );

-- câu 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo ------

WITH CTE_GetContentQuestion AS (
	SELECT q.QuestionID, q.CreatorID, count(q.QuestionID) AS SL FROM Question q
	GROUP BY q.CreatorID
    HAVING q.CreatorID = "nguyễn %"
)
SELECT q.QuestionID , q.Content, q.CreatorID, a.FullName  FROM `Account` a
INNER JOIN Question q ON q.CreatorID = a.AccountID
GROUP BY a.AccountID
HAVING a.AccountID = (SELECT q.CreatorID FROM CTE_GetContentQuestion );

