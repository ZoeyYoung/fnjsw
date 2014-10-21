-- MySQL dump 10.13  Distrib 5.5.28, for Win64 (x86)
--
-- Host: localhost    Database: fnjsw
-- ------------------------------------------------------
-- Server version	5.5.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gestationinfo`
--

DROP TABLE IF EXISTS `gestationinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gestationinfo`
--

LOCK TABLES `gestationinfo` WRITE;
/*!40000 ALTER TABLE `gestationinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `gestationinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `onechildarchives`
--

DROP TABLE IF EXISTS `onechildarchives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `onechildarchives` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fName` varchar(255) DEFAULT NULL COMMENT '姓名',
  `fIdCardNo` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `fPhone` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `marriageIdNo` varchar(255) DEFAULT NULL COMMENT '婚育证明号码',
  `fPermanentAddress` varchar(255) DEFAULT NULL COMMENT '户籍地址',
  `fpHouseNo` varchar(255) DEFAULT NULL COMMENT '户籍地址门牌号',
  `fAddress` varchar(255) DEFAULT NULL COMMENT '现居住地址',
  `faHouseNo` varchar(255) DEFAULT NULL COMMENT '户籍地址',
  `fCompanyName` varchar(255) DEFAULT NULL COMMENT '工作单位名称',
  `fCompanyAddr` varchar(255) DEFAULT NULL COMMENT '工作单位地址',
  `mName` varchar(255) DEFAULT NULL COMMENT '门牌号',
  `mIdCardNo` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `mPhone` varchar(255) DEFAULT NULL COMMENT 'mPhone',
  `mPermanentAddress` varchar(2) DEFAULT NULL COMMENT '户籍地址',
  `mpHouseNo` varchar(255) DEFAULT NULL COMMENT '户籍地址门牌号',
  `mAddress` varchar(255) DEFAULT NULL COMMENT '现居住地址',
  `maHouseNo` varchar(255) DEFAULT NULL COMMENT '现居住地址门牌号',
  `mCompanyName` varchar(255) DEFAULT NULL COMMENT '工作单位名称',
  `mCompanyAddr` varchar(255) DEFAULT NULL COMMENT '工作单位地址',
  `maritalStatus` varchar(2) DEFAULT '2' COMMENT '婚姻状况',
  `marriageNo` varchar(255) DEFAULT NULL COMMENT '结婚证号',
  `marriageDate` date DEFAULT NULL COMMENT '结婚时间',
  `hasChild` varchar(2) DEFAULT '2' COMMENT '生育子女状况',
  `isAdopted` varchar(2) DEFAULT '2' COMMENT '是否领养',
  `residenceNo` varchar(255) DEFAULT NULL COMMENT '居住证号',
  `getResidenceDate` varchar(255) DEFAULT NULL COMMENT '领取居住证时间',
  `registrationAddr` varchar(255) DEFAULT NULL COMMENT '办证地点',
  `serviceNo` varchar(255) DEFAULT NULL COMMENT '服务证号',
  `registrationDate` date DEFAULT NULL COMMENT '办证时间',
  `operator` varchar(255) DEFAULT NULL COMMENT '经办人',
  `opPhone` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `status` varchar(2) DEFAULT '1' COMMENT '状态',
  `familyPlanningCertificate` text COMMENT '计生证件扫描文件名',
  `zhunShengZheng` text COMMENT '准生证扫描文件名',
  `comment` text COMMENT '备注',
  `lastServiceTime` date DEFAULT NULL,
  `lastServiceResult` varchar(45) DEFAULT NULL,
  `lastServicePerson` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `onechildarchives`
--

LOCK TABLES `onechildarchives` WRITE;
/*!40000 ALTER TABLE `onechildarchives` DISABLE KEYS */;
INSERT INTO `onechildarchives` VALUES (18,'test','','','',NULL,'',NULL,'','','','','','',NULL,'',NULL,'','','','-1','','2014-10-09','','-1','','2014/10/01',NULL,'','2014-10-02','','','-1',NULL,NULL,NULL,NULL,NULL,NULL),(19,'ttt','','','',NULL,'',NULL,'','','','','','',NULL,'',NULL,'','','','-1','','2014-10-08','','-1','','2014/10/07',NULL,'','2014-10-02','','','-1',NULL,NULL,NULL,NULL,NULL,NULL),(20,'dddd','','','',NULL,'',NULL,'','','','','','',NULL,'',NULL,'','','','-1','','2014-10-03','','-1','','2014/10/07',NULL,'','2014-10-03','','','-1',NULL,NULL,'',NULL,NULL,NULL);
/*!40000 ALTER TABLE `onechildarchives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `pwd` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin'),(2,'a','a');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-10-22  0:00:33
