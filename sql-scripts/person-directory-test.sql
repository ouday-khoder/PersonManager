

CREATE DATABASE  IF NOT EXISTS `person_directory_test`;
USE `person_directory_test`;

--
-- Table structure for table `person_test`
--

DROP TABLE IF EXISTS `person_test`;

CREATE TABLE `person_test` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `person_test`
--

INSERT INTO `person_test` VALUES
	(1,'Ouday','Khoder','oudaykhoder25@gmail.com'),
	(2,'Leila','Yassin','Leila@gmail.com'),
	(3,'John','Doe','Doe@outlook.com');

