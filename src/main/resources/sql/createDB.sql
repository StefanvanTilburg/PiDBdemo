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
-- DROP USER IF EXISTS 'user'@'localhost';
-- CREATE USER 'user'@'localhost' IDENTIFIED BY 'userpw';
-- GRANT ALL ON dbdemo.* to 'user'@'localhost';

-- This is not secure but for needed for testing purpose
-- This works for now but setting a user like this is not secure. Has to do with internal ip / docker container
-- / what does docker see as localhost
DROP USER IF EXISTS 'user'@'%';
CREATE USER 'user'@'%' IDENTIFIED BY 'userpw';
GRANT ALL ON dbdemo.* to 'user'@'%';