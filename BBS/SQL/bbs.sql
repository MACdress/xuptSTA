CREATE DATABASE bbs
USE bbs
CREATE TABLE article(id INT PRIMARY KEY AUTO_INCREMENT,
pid INT,
rootid INT,
tittle VARCHAR(255),
cont TEXT,
padte DATETIME,
isleaf INT)
INSERT INTO article VALUES(NULL,0,1,"蚂蚁战胜大象","蚂蚁战胜大象",NOW(),1);
INSERT INTO article VALUES(NULL,1,1,"蚂蚁大象","蚂蚁胜大象",NOW(),1);
INSERT INTO article VALUES(NULL,2,1,"蚂蚁战胜大象","蚂蚁战胜大象",NOW(),0);
INSERT INTO article VALUES(NULL,3,1,"蚂战胜大象","蚂蚁战胜大",NOW(),1);
INSERT INTO article VALUES(NULL,4,1,"蚂蚁战胜大象","蚂蚁战胜象",NOW(),0);
INSERT INTO article VALUES(NULL,5,1,"蚁战胜大象","蚂蚁战大象",NOW(),1);
