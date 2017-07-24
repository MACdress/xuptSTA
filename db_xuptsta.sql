/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : db_xuptsta

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-07-24 14:56:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_blog`
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog` (
  `blogId` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `summary` varchar(100) DEFAULT NULL,
  `releaseDate` datetime DEFAULT NULL,
  `clickHit` int(11) DEFAULT NULL,
  `replyHit` int(11) DEFAULT NULL,
  `content` text,
  `blogTypeId` int(11) DEFAULT NULL,
  `honey` int(5) DEFAULT NULL,
  `bloggerId` int(11) DEFAULT NULL,
  PRIMARY KEY (`blogId`),
  KEY `bloggerId` (`bloggerId`),
  KEY `blogTypeId` (`blogTypeId`),
  CONSTRAINT `t_blog_ibfk_1` FOREIGN KEY (`bloggerId`) REFERENCES `t_blogger` (`bloggerId`),
  CONSTRAINT `t_blog_ibfk_2` FOREIGN KEY (`blogTypeId`) REFERENCES `t_blogtype` (`blogTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_blog
-- ----------------------------

-- ----------------------------
-- Table structure for `t_blogger`
-- ----------------------------
DROP TABLE IF EXISTS `t_blogger`;
CREATE TABLE `t_blogger` (
  `bloggerId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(40) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `profile` varchar(100) DEFAULT NULL,
  `nickName` varchar(20) DEFAULT NULL,
  `sign` varchar(100) DEFAULT NULL,
  `imageName` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`bloggerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_blogger
-- ----------------------------

-- ----------------------------
-- Table structure for `t_blogtype`
-- ----------------------------
DROP TABLE IF EXISTS `t_blogtype`;
CREATE TABLE `t_blogtype` (
  `blogTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(100) DEFAULT NULL,
  `orderNo` int(3) DEFAULT NULL,
  PRIMARY KEY (`blogTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_blogtype
-- ----------------------------

-- ----------------------------
-- Table structure for `t_categories`
-- ----------------------------
DROP TABLE IF EXISTS `t_categories`;
CREATE TABLE `t_categories` (
  `categoriesId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`categoriesId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_categories
-- ----------------------------

-- ----------------------------
-- Table structure for `t_comment`
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT,
  `userIp` varchar(20) DEFAULT NULL,
  `blogId` int(11) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `commentDate` datetime DEFAULT NULL,
  `state` int(2) DEFAULT NULL,
  `bloggerId` int(11) DEFAULT NULL,
  PRIMARY KEY (`commentId`),
  KEY `blogId` (`blogId`),
  KEY `bloggerId` (`bloggerId`),
  CONSTRAINT `t_comment_ibfk_1` FOREIGN KEY (`blogId`) REFERENCES `t_blog` (`blogId`),
  CONSTRAINT `t_comment_ibfk_2` FOREIGN KEY (`bloggerId`) REFERENCES `t_blogger` (`bloggerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `t_conus`
-- ----------------------------
DROP TABLE IF EXISTS `t_conus`;
CREATE TABLE `t_conus` (
  `conusId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `professional` varchar(20) DEFAULT NULL,
  `message` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`conusId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_conus
-- ----------------------------

-- ----------------------------
-- Table structure for `t_dynamic`
-- ----------------------------
DROP TABLE IF EXISTS `t_dynamic`;
CREATE TABLE `t_dynamic` (
  `dynamicId` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(40) DEFAULT NULL,
  `content` text,
  `dynamicTypeId` int(11) DEFAULT NULL,
  `publishDate` datetime DEFAULT NULL,
  `summary` varchar(40) DEFAULT NULL,
  `dynamicImage` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`dynamicId`),
  KEY `dynamicTypeId` (`dynamicTypeId`),
  CONSTRAINT `t_dynamic_ibfk_1` FOREIGN KEY (`dynamicTypeId`) REFERENCES `t_dynamictype` (`dynamicTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dynamic
-- ----------------------------

-- ----------------------------
-- Table structure for `t_dynamictype`
-- ----------------------------
DROP TABLE IF EXISTS `t_dynamictype`;
CREATE TABLE `t_dynamictype` (
  `dynamicTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`dynamicTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dynamictype
-- ----------------------------

-- ----------------------------
-- Table structure for `t_link`
-- ----------------------------
DROP TABLE IF EXISTS `t_link`;
CREATE TABLE `t_link` (
  `linkId` int(11) NOT NULL AUTO_INCREMENT,
  `linkName` varchar(40) DEFAULT NULL,
  `linkUrl` varchar(40) DEFAULT NULL,
  `linkImage` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`linkId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_link
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member` (
  `memberId` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(40) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `imageName` varchar(40) DEFAULT NULL,
  `memberTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`memberId`),
  KEY `memberTypeId` (`memberTypeId`),
  CONSTRAINT `t_member_ibfk_1` FOREIGN KEY (`memberTypeId`) REFERENCES `t_membertype` (`memberTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member
-- ----------------------------

-- ----------------------------
-- Table structure for `t_membertype`
-- ----------------------------
DROP TABLE IF EXISTS `t_membertype`;
CREATE TABLE `t_membertype` (
  `memberTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`memberTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_membertype
-- ----------------------------

-- ----------------------------
-- Table structure for `t_question`
-- ----------------------------
DROP TABLE IF EXISTS `t_question`;
CREATE TABLE `t_question` (
  `questionId` int(11) NOT NULL AUTO_INCREMENT,
  `questionNo` int(11) DEFAULT NULL,
  `description` text,
  `categoriesId` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`questionId`),
  KEY `categoriesId` (`categoriesId`),
  CONSTRAINT `t_question_ibfk_1` FOREIGN KEY (`categoriesId`) REFERENCES `t_categories` (`categoriesId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_question
-- ----------------------------

-- ----------------------------
-- Table structure for `t_test`
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `testId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `questionId` int(11) DEFAULT NULL,
  `submitTime` varchar(20) DEFAULT NULL,
  `code` text,
  `correctRate` float(6,3) DEFAULT NULL,
  PRIMARY KEY (`testId`),
  KEY `questionId` (`questionId`),
  KEY `userId` (`userId`),
  CONSTRAINT `t_test_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `t_useroj` (`userId`),
  CONSTRAINT `t_test_ibfk_2` FOREIGN KEY (`questionId`) REFERENCES `t_question` (`questionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_test
-- ----------------------------

-- ----------------------------
-- Table structure for `t_testdata`
-- ----------------------------
DROP TABLE IF EXISTS `t_testdata`;
CREATE TABLE `t_testdata` (
  `testDataId` int(11) NOT NULL AUTO_INCREMENT,
  `questionId` int(11) DEFAULT NULL,
  `input` varchar(200) DEFAULT NULL,
  `output` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`testDataId`),
  KEY `questionId` (`questionId`),
  CONSTRAINT `t_testdata_ibfk_1` FOREIGN KEY (`questionId`) REFERENCES `t_question` (`questionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_testdata
-- ----------------------------

-- ----------------------------
-- Table structure for `t_useroj`
-- ----------------------------
DROP TABLE IF EXISTS `t_useroj`;
CREATE TABLE `t_useroj` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `nickName` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  `enabled` int(2) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_useroj
-- ----------------------------
