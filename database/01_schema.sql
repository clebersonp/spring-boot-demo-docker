SET default_storage_engine=InnoDB;

CREATE DATABASE IF NOT EXISTS demo;

USE demo;

DROP TABLE IF EXISTS login;

CREATE TABLE login (
`id` int not null AUTO_INCREMENT,
`username` VARCHAR(100) NOT NULL,
`password` VARCHAR(20) NOT NULL,
`active` TINYINT(1),
CONSTRAINT PRIMARY key (`id`)
)ENGINE=InnoDB;