USE  testingsystem;

-- câu 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tại trước 1 năm trước




-- câu 3: Cấu hình 1 group có nhiều nhất là 5 user

DROP TRIGGER IF EXISTS TRG_MaxGroup;
DELIMITER $$
CREATE TRIGGER TRG_MaxGroup
BEFORE INSERT ON GroupAccount
FOR EACH ROW
BEGIN
		DECLARE var_AccountID TINYINT; 
		SELECT count( ga.AccountID) INTO var_AccountID FROM GroupAccount ga
        WHERE ga.AccountID = NEW.AccountID ;
		IF  (var_AccountID) >5 THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'Khong the insert them vao group nay';
		END IF;
END
DELIMITER ;

INSERT INTO `GroupAccount` ( GroupID, AccountID, JoinDate ) values ('5' , '2', '2015-09-15');

-- câu 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question

DROP TRIGGER IF EXISTS TRG_MaxExam;
DELIMITER $$
CREATE TRIGGER TRG_MaxExam
BEFORE INSERT ON ExamQuestion
FOR EACH ROW
BEGIN
	DECLARE var_QuestionID TINYINT;
    SELECT count( eq.QuestionID) INTO var_QuestionID FROM ExamQuestion eq
	WHERE eq.QuestionID = NEW.QuestionID ;
    IF  (var_QuestionID) > 10 THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Khong the insert them vao bai thi nay';
	END IF;
END
DELIMITER ;

INSERT INTO `ExamQuestion` ( ExamID, QuestionID)  values ('2',	'2');

-- câu 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
--           còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó



-- câu 6: Không sử dụng cấu hình default cho field DepartmentID của table Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
--           vào departmentID thì sẽ được phân vào phòng ban "waiting Department"

DROP TRIGGER IF EXISTS SetConfigurtionDepartment;
DELIMITER $$
	CREATE TRIGGER SetConfigurtionDepartment
	BEFORE INSERT ON `Account`
    FOR EACH ROW
    BEGIN		
		DECLARE v_Watting TINYINT; 
        SELECT DepartmentID INTO v_Watting FROM Department AS D WHERE DepartmentName = 'Waiting Room';
		IF New.DepartmentID IS NULL THEN 
			SET New.DepartmentID = v_Watting ;
		END IF;        
    END$$
DELIMITER ;

-- câu 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng.



-- câu 8: Viết trigger sửa lại dữ liệu cho đúng: Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
--            Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database




-- câu 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày


-- câu 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào




-- câu 12: Lấy ra thông tin exam trong đó: Duration <= 30 thì sẽ đổi thành giá trị "Short time" 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
--             Duration > 60 thì sẽ đổi thành giá trị "Long time"	




-- câu 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên là the_number_user_amount và mang giá trị được quy định như sau:
--              Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
--              Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher



-- câu 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User"