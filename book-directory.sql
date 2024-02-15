CREATE DATABASE  IF NOT EXISTS `book_directory`;
USE `book_directory`;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `book_name` varchar(45) DEFAULT NULL,
  `author_name` varchar(45) DEFAULT NULL,
  `availability` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `book`
--

INSERT INTO `book` VALUES 
	(1,'Also sprach Zarathustra','Friedrich Wilhelm Nietzsche','5'),
	(2,'King Lear','Whilliam Shakespeare','3'),
	(3,'Cyrano de Bergerac','Edmond Rostand','3'),
	(4,'Montezumas daughter','H. Rider Haggard','2'),
	(5,'The beast nights','Chelsea Yarbro','1');
