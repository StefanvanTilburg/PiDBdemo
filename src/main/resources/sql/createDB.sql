-- -----------------------------------------------------
-- Schema dbdemo
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `dbdemo` ;

-- -----------------------------------------------------
-- Schema dbdemo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbdemo` DEFAULT CHARACTER SET utf8 ;
USE `dbdemo` ;

-- Set user for dbdemo
DROP USER IF EXISTS 'user'@'localhost';
CREATE USER 'user'@'localhost' IDENTIFIED BY 'userpw';
GRANT ALL ON dbdemo.* to 'user'@'localhost';