CREATE TABLE `gestationinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ocaid` int(11) NOT NULL,
  `serviceTime` date DEFAULT NULL,
  `serviceResult` varchar(45) DEFAULT NULL,
  `servicePerson` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `ocaid_UNIQUE` (`ocaid`),
  CONSTRAINT `fk` FOREIGN KEY (`ocaid`) REFERENCES `onechildarchives` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8

