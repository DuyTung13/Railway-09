DROP DATABASE day1;
CREATE DATABASE day1;
USE day1;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	DepartmentID INT,
    DepartmentNAME VARCHAR(20)
    );
	
DROP TABLE IF EXISTS Position;
CREATE TABLE Position (
	PositionID INT,
    PositionName VARCHAR(50)
    );
    
DROP TABLE IF EXISTS Account;
CREATE TABLE Account (
	AccountID INT,
    Email VARCHAR(20),
    Username VARCHAR(30),
    FullName VARCHAR(50),
    DepartmentID INT,
    PositionID INT,
    CreateDate DATE
    );

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
	GroupID INT,
    GroupName VARCHAR(20),
    CreatorID INT,
    CreateDate DATE
    );

DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount(
	GroupID INT,
    AccountID INT,
    JoinDate DATE
    );
    
DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion(
	TypeID INT,
    TypeName VARCHAR(20)
);

DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion(
	CategoryID INT,
    CategoryName VARCHAR(20)
);

DROP TABLE IF EXISTS Question;
CREATE TABLE Question(
	QuestionID INT,
    Content VARCHAR(50),
    CategoryID INT,
    TypeID INT,
    CreatorID INT,
    CreateDate DATE
);

DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer(
	AnswerID INT,
    Content VARCHAR(50),
    QuestionID INT,
    isCorrect VARCHAR(20)
);

DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam(
	ExamID INT,
    Code INT,
    Title VARCHAR(20),
    CategoryID INT,
    Duration DATETIME,
    CreatorID INT,
    CreateDate DATE
);

DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE ExamQuestion(
	ExamID INT,
    QuestionID INT
);