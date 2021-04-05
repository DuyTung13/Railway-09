USE TestingSystem;

-- cau1
SELECT a.AccountID,a.Username,a.Fullname, d.DepartmentNAME FROM `Account` a
INNER JOIN Department d  ON a.DepartmentID = d.DepartmentID;

-- cau2
SELECT * FROM `Account` a
WHERE a.CreateDate < '2020-12-20';

-- cau3
SELECT * FROM `Account` a
INNER JOIN Position p ON a.PositionID = p.PositionID
WHERE p.PositionName = 'DEV';

-- cau4
SELECT d.DepartmentName, count(a.DepartmentID) AS SL FROM `Account` a
INNER JOIN Department d ON a.DepartmentID = d.DepartmentID
GROUP BY a.DepartmentID HAVING COUNT(a.DepartmentID) >3;

-- cau5

-- cau6
SELECT cq.CategoryID, cq.CategoryName, count(q.CategoryID) FROM CategoryQuestion cq
JOIN question q ON cq.CategoryID = q.CategoryID
GROUP BY q.CategoryID;

-- cau7


-- cau8 :Lấy ra Question có nhiều câu trả lời nhất
WITH CTE_GetCountQuestionID AS (
	SELECT q.QuestionID, count(q.QuestionID) AS SL FROM Question q
	GROUP BY q.QuestionID
)
SELECT q.QuestionID , q.Content, count(a.QuestionID) AS SL  FROM Answer a
INNER JOIN Question q ON q.QuestionID = a.QuestionID
GROUP BY a.QuestionID	
HAVING count(a.QuestionID) = (SELECT max(SL) FROM CTE_GetCountQuestionID );

-- cau9
SELECT g.GroupID, COUNT(ga.AccountID) AS SL FROM GroupAccount ga
JOIN `Group` g ON ga.GroupID = g.GroupID
GROUP BY g.GroupID ORDER BY g.GroupID ASC;

-- cau10 Tìm chức vụ có ít người nhất----

WITH CTE_GetCountAccountID AS (
	SELECT a.AccountID, count(a.PositionID) AS SL FROM `Account` a
    GROUP BY a.PositionID
)
SELECT a.PositionID, p.PositionName, count(a.PositionID) AS SL  FROM `Account` a
INNER JOIN  Position p  ON p.PositionID = a.PositionID
GROUP BY a.PositionID	
HAVING count(a.PositionID) = (SELECT min(SL) FROM CTE_GetCountAccountID );

-- cau11 Tìm chức vụ có nhiều người nhất----

WITH CTE_GetCountAccountID AS (
	SELECT a.AccountID, count(a.PositionID) AS SL FROM `Account` a
    GROUP BY a.PositionID
)
SELECT a.PositionID, p.PositionName, count(a.PositionID) AS SL  FROM `Account` a
INNER JOIN  Position p  ON p.PositionID = a.PositionID
GROUP BY a.PositionID	
HAVING count(a.PositionID) = (SELECT max(SL) FROM CTE_GetCountAccountID );

-- cau 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ... ------

SELECT q.QuestionID, q.Content, a.FullName, tq.TypeName, an.Content FROM Question q
INNER JOIN categoryquestion cq ON q.CategoryID = cq.CategoryID
INNER JOIN typequestion tq ON q.TypeID = tq.TypeID
INNER JOIN `account` a ON a.AccountID = q.CreatorID
INNER JOIN Answer an ON q.QuestionID = an.QuestionID
ORDER BY q.QuestionID ASC;

-- câu 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm -----

-- câu 14: Lấy ra group không có account nào -----------

SELECT g.GroupName , count(ga.AccountID) AS SL FROM GroupAccount ga
JOIN `Group` g ON g.GroupID = ga.GroupID
GROUP BY ga.AccountID
HAVING  ga.AccountID = 0;

-- câu 16: Lấy ra question không có answer nào

SELECT q.Content , count(ans.AnswerID) AS SL FROM Answer ans
JOIN Question q ON q.QuestionID = ans.QuestionID
GROUP BY ans.AnswerID
HAVING  ans.AnswerID = 0;

-- câu 17: a) Lấy các account thuộc nhóm thứ 1
-- --------b) Lấy các account thuộc nhóm thứ 2
-- --------c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau

SELECT a.AccountID, a.Email, a.FullName FROM `Group` g
JOIN `Account` a ON a.AccountID = g.CreatorID
WHERE g.GroupID =1
UNION ALL
SELECT a.AccountID, a.Email, a.FullName  FROM `Group` g
JOIN `Account` a ON a.AccountID = g.CreatorID
WHERE g.GroupID =2;

-- câu 17: a) Lấy các group có lớn hơn 5 thành viên
-- --------b) Lấy các group có nhỏ hơn 7 thành viên
-- --------c) Ghép 2 kết quả từ câu a) và câu b)

SELECT g.GroupName FROM GroupAccount ga
JOIN `Group` g ON g.GroupID = ga.GroupID
WHERE ga.AccountID > 5
UNION
SELECT g.GroupName FROM GroupAccount ga
JOIN `Group` g ON g.GroupID = ga.GroupID
WHERE ga.AccountID > 7;











