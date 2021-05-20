/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS ManagerCandidate;
CREATE DATABASE ManagerCandidate;
USE ManagerCandidate;
/*============================== CREATE TABLE ==========================================*/
/*======================================================================================*/
-- create table : Cadidate

DROP TABLE IF EXISTS Cadidate;
CREATE TABLE Cadidate(
	ID 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Fistname		NVARCHAR(50) NOT NULL ,
	Lassname		NVARCHAR(50) NOT NULL ,
    Phone			CHAR(50) NOT NULL ,
    Email			CHAR(50) NOT NULL ,
    `Password`		VARCHAR(100) NOT NULL,
    expInYear		SMALLINT UNSIGNED,
    proSkill		ENUM ('DEV' , 'TEST', 'JAVA', 'SQL'),
    GraduationRank	ENUM ('EXCELLENCE', 'GOOD', 'FAIR', 'POOR'),
    Categogy		ENUM ('EXPERIENCECADIDATE', 'FRESHERCADIDATE') NOT NULL
    
);

/*============================== INSERT DATA ===========================================*/
/*======================================================================================*/

INSERT INTO `ManagerCandidate`.`cadidate` (`Fistname`, `Lassname`, `Phone`, `Email`, `Password`, `expInYear`, `proSkill`, `GraduationRank`, `Categogy`) 
VALUES ('fistName1', 'Lastname1', '0904123456', 'Email1@gmail.com', '1234567', '1', 'DEV', null , 'EXPERIENCECADIDATE');
INSERT INTO `ManagerCandidate`.`cadidate` (`Fistname`, `Lassname`, `Phone`, `Email`, `Password`, `expInYear`, `proSkill`, `GraduationRank`, `Categogy`) 
VALUES ('fistName2', 'Lastname2', '0904123451', 'Email2@gmail.com', '1234567', '2', 'TEST', null , 'EXPERIENCECADIDATE');
INSERT INTO `ManagerCandidate`.`cadidate` (`Fistname`, `Lassname`, `Phone`, `Email`, `Password`, `expInYear`, `proSkill`, `GraduationRank`, `Categogy`) 
VALUES ('fistName3', 'Lastname3', '0904123452', 'Email3@gmail.com', '1234567', '4', 'DEV', null , 'EXPERIENCECADIDATE');
INSERT INTO `ManagerCandidate`.`cadidate` (`Fistname`, `Lassname`, `Phone`, `Email`, `Password`, `expInYear`, `proSkill`, `GraduationRank`, `Categogy`) 
VALUES ('fistName4', 'Lastname4', '0904123453', 'Email4@gmail.com', '1234567', null, null, 'GOOD' , 'FRESHERCADIDATE');
INSERT INTO `ManagerCandidate`.`cadidate` (`Fistname`, `Lassname`, `Phone`, `Email`, `Password`, `expInYear`, `proSkill`, `GraduationRank`, `Categogy`) 
VALUES ('fistName5', 'Lastname5', '0904123454', 'Email5@gmail.com', '1234567', null, null, 'FAIR' , 'FRESHERCADIDATE');







