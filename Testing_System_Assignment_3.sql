USE TestingSystem;

-- cau2
SELECT * FROM `Department`;

-- cau3
SELECT DepartmentID FROM `Department` WHERE DepartmentNAME = 'sale';

-- cau6
SELECT GroupName FROM `Group` WHERE CreateDate < '2019-12-20';

-- cau7
SELECT a.QuestionID, count(a.QuestionID) AS SL  FROM Answer a
INNER JOIN Question q  ON a.QuestionID = q.QuestionID
GROUP BY a.QuestionID HAVING count(a.QuestionID) >=4;

-- cau8
SELECT e.`code` FROM Exam e
WHERE e.Duration > 60 AND e.CreateDate <'2019-12-20';

-- cau9
SELECT g.GroupName , g.CreateDate FROM `Group` g
ORDER BY g.CreateDate DESC
LIMIT 5;

-- cau10
SELECT a.DepartmentID,count(a.AccountID) AS SL From `Account` a
WHERE a.DepartmentID=2;

-- cau11
SELECT a.FullName From `Account` a
WHERE a.FullName LIKE 'D%o';

-- cau12
DELETE FROM Exam e
WHERE e.CreateDate <'2019-12-20';

-- cau13
DELETE FROM Question q
WHERE q.Content= "câu hỏi"; 

-- cau14
UPDATE `Account` SET FullName = N'Nguyễn Bá Lộc' , Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID=5; 

-- cau15
UPDATE `GroupAccount` SET AccountID=5 
WHERE GroupID=4;