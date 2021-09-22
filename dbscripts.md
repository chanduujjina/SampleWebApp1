create database batch_4

use batch_4


create table user (userId int NOT NULL AUTO_INCREMENT,userName varchar(255),gender varchar(255),phone varchar(255),email varchar(255),PRIMARY KEY (userId));

ALTER TABLE  user ADD UNIQUE (phone ,email);

ALTER TABLE user  ADD password varchar(255);

