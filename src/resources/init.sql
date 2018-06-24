DROP DATABASE IF EXISTS db_mybatis;
CREATE DATABASE db_mybatis;
USE db_mybatis;

CREATE TABLE student (
id INT NOT NULL auto_increment,
name VARCHAR(24),
age INT,
PRIMARY KEY(id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT = '学生表';

CREATE TABLE address (

id INT NOT NULL auto_increment,
sheng VARCHAR(24),
shi VARCHAR(24),
qu VARCHAR(24),
PRIMARY KEY(id)

)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT = '地址表';


