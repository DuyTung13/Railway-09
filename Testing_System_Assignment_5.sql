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




