/*
SQLyog - Free MySQL GUI v5.02
Host - 5.5.5-10.1.31-MariaDB : Database - web_customer_tracker
*********************************************************************
Server version : 5.5.5-10.1.31-MariaDB
*/


create database if not exists `web_customer_tracker`;

USE `web_customer_tracker`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert into `customer` values 
(108,'INDRESH','S','indresh@hotmail.co.in');
