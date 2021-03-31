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


-- cau8


-- cau9
SELECT g.GroupID, COUNT(ga.AccountID) AS SL FROM GroupAccount ga
JOIN `Group` g ON ga.GroupID = g.GroupID
GROUP BY g.GroupID ORDER BY g.GroupID ASC;

-- cau10










