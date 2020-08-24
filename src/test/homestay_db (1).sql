-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.11 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  8.2.0.4675
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 homestay 的数据库结构
DROP DATABASE IF EXISTS `homestay`;
CREATE DATABASE IF NOT EXISTS `homestay` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `homestay`;


-- 导出  表 homestay.account 结构
DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `acc_id` int(11) NOT NULL AUTO_INCREMENT,
  `acc_name` varchar(50) NOT NULL,
  `acc_pwd` varchar(50) NOT NULL DEFAULT '123456',
  `acc_state` int(11) NOT NULL DEFAULT '0',
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`acc_id`),
  KEY `FK_account_employee` (`emp_id`),
  CONSTRAINT `FK_account_employee` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工账号表';

-- 正在导出表  homestay.account 的数据：~2 rows (大约)
DELETE FROM `account`;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` (`acc_id`, `acc_name`, `acc_pwd`, `acc_state`, `emp_id`) VALUES
	(1, 'zs', '123456', 0, 1),
	(2, 'ls', '123456', 0, 2),
	(3, 'ww', '123456', 0, 3);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;


-- 导出  表 homestay.bank 结构
DROP TABLE IF EXISTS `bank`;
CREATE TABLE IF NOT EXISTS `bank` (
  `ba_id` int(11) NOT NULL AUTO_INCREMENT,
  `ba_name` varchar(50) NOT NULL,
  `ba_phone` varchar(50) NOT NULL,
  `ba_pwd` varchar(50) NOT NULL,
  PRIMARY KEY (`ba_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='前台账号表';

-- 正在导出表  homestay.bank 的数据：~0 rows (大约)
DELETE FROM `bank`;
/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
INSERT INTO `bank` (`ba_id`, `ba_name`, `ba_phone`, `ba_pwd`) VALUES
	(1, 'zzy', '159388227681', '123'),
	(2, 'lmy', '18737843098', '123');
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;


-- 导出  表 homestay.client 结构
DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `cli_id` int(11) NOT NULL AUTO_INCREMENT,
  `cli_name` varchar(50) DEFAULT NULL,
  `cli_sex` char(50) DEFAULT NULL,
  `cli_phone` varchar(50) NOT NULL,
  `cli_date` date DEFAULT NULL,
  `cli_place` varchar(50) DEFAULT NULL,
  `cli_money` int(11) NOT NULL DEFAULT '0',
  `cli_email` varchar(50) DEFAULT NULL,
  `cli_sparephone` varchar(50) DEFAULT NULL,
  `cli_qq` varchar(50) DEFAULT NULL,
  `cli_wechat` varchar(50) DEFAULT NULL,
  `cli_referral` varchar(50) DEFAULT NULL,
  `cli_prc` varchar(50) DEFAULT NULL,
  `cli_rank` int(11) NOT NULL DEFAULT '0',
  `cli_price` int(11) NOT NULL,
  `ba_id` int(11) NOT NULL,
  PRIMARY KEY (`cli_id`),
  KEY `FK_client_bank` (`ba_id`),
  CONSTRAINT `FK_client_bank` FOREIGN KEY (`ba_id`) REFERENCES `bank` (`ba_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='客户表';

-- 正在导出表  homestay.client 的数据：~0 rows (大约)
DELETE FROM `client`;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` (`cli_id`, `cli_name`, `cli_sex`, `cli_phone`, `cli_date`, `cli_place`, `cli_money`, `cli_email`, `cli_sparephone`, `cli_qq`, `cli_wechat`, `cli_referral`, `cli_prc`, `cli_rank`, `cli_price`, `ba_id`) VALUES
	(1, '曾照云', '女', '159388227681', '2001-08-24', '河南郑州', 0, '123@qq.com', '159388227681', '123', '159388227681', '来自aaa', '1.png', 0, 0, 1),
	(2, '李梦岩', '女', '159388227681', '2001-08-24', '河南郑州', 0, '123@qq.com', '159388227681', '123', '159388227681', '来自aaa', '1.png', 0, 0, 2);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;


-- 导出  表 homestay.collect 结构
DROP TABLE IF EXISTS `collect`;
CREATE TABLE IF NOT EXISTS `collect` (
  `coll_id` int(11) NOT NULL AUTO_INCREMENT,
  `hou_id` int(11) NOT NULL,
  `cli_id` int(11) NOT NULL,
  PRIMARY KEY (`coll_id`),
  KEY `FK_collect_house` (`hou_id`),
  KEY `FK_collect_client` (`cli_id`),
  CONSTRAINT `FK_collect_client` FOREIGN KEY (`cli_id`) REFERENCES `client` (`cli_id`),
  CONSTRAINT `FK_collect_house` FOREIGN KEY (`hou_id`) REFERENCES `house` (`hou_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='房间收藏表';

-- 正在导出表  homestay.collect 的数据：~0 rows (大约)
DELETE FROM `collect`;
/*!40000 ALTER TABLE `collect` DISABLE KEYS */;
/*!40000 ALTER TABLE `collect` ENABLE KEYS */;


-- 导出  表 homestay.employee 结构
DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(50) NOT NULL,
  `emp_sex` char(2) NOT NULL,
  `emp_age` int(11) NOT NULL,
  `emp_phone` varchar(50) NOT NULL,
  `emp_address` varchar(50) NOT NULL,
  `emp_card` varchar(50) NOT NULL,
  `entryDate` varchar(50) NOT NULL,
  `dimission` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工表';

-- 正在导出表  homestay.employee 的数据：~2 rows (大约)
DELETE FROM `employee`;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`emp_id`, `emp_name`, `emp_sex`, `emp_age`, `emp_phone`, `emp_address`, `emp_card`, `entryDate`, `dimission`) VALUES
	(1, '张三', '男', 25, '14758425698', '河南郑州', '412545199505041256', '2020-08-22', NULL),
	(2, '李四', '女', 26, '14754515698', '河南郑州', '412545199405041256', '2020-08-22', NULL),
	(3, '王五', '女', 26, '14754515698', '河南郑州', '422545199405041256', '2020-08-22', NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


-- 导出  表 homestay.facility 结构
DROP TABLE IF EXISTS `facility`;
CREATE TABLE IF NOT EXISTS `facility` (
  `fac_id` int(11) NOT NULL AUTO_INCREMENT,
  `fac_wifi` int(11) NOT NULL DEFAULT '0',
  `fac_tv` int(11) NOT NULL DEFAULT '0',
  `fac_shower` int(11) NOT NULL DEFAULT '0',
  `fac_kettle` int(11) NOT NULL DEFAULT '0',
  `fac_lift` int(11) NOT NULL DEFAULT '0',
  `fac_cereal` int(11) NOT NULL DEFAULT '0',
  `fac_prc` int(11) DEFAULT NULL,
  `fac_title` int(11) NOT NULL,
  `fac_describe` int(11) NOT NULL,
  `fac_path` int(11) NOT NULL,
  `fac_rim` int(11) NOT NULL,
  `fac_landmark` int(11) NOT NULL,
  `fac_market` int(11) NOT NULL,
  `fac_photoprc` int(11) NOT NULL,
  `fac_expiredate` int(11) NOT NULL,
  `hou_id` int(11) NOT NULL,
  PRIMARY KEY (`fac_id`),
  KEY `FK_facility_house` (`hou_id`),
  CONSTRAINT `FK_facility_house` FOREIGN KEY (`hou_id`) REFERENCES `house` (`hou_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='配套设施';

-- 正在导出表  homestay.facility 的数据：~0 rows (大约)
DELETE FROM `facility`;
/*!40000 ALTER TABLE `facility` DISABLE KEYS */;
/*!40000 ALTER TABLE `facility` ENABLE KEYS */;


-- 导出  表 homestay.function 结构
DROP TABLE IF EXISTS `function`;
CREATE TABLE IF NOT EXISTS `function` (
  `fun_id` int(11) NOT NULL AUTO_INCREMENT,
  `fun_name` varchar(50) NOT NULL,
  PRIMARY KEY (`fun_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='功能表';

-- 正在导出表  homestay.function 的数据：~4 rows (大约)
DELETE FROM `function`;
/*!40000 ALTER TABLE `function` DISABLE KEYS */;
INSERT INTO `function` (`fun_id`, `fun_name`) VALUES
	(1, 'add'),
	(2, 'select'),
	(3, 'update'),
	(4, 'delete');
/*!40000 ALTER TABLE `function` ENABLE KEYS */;


-- 导出  表 homestay.house 结构
DROP TABLE IF EXISTS `house`;
CREATE TABLE IF NOT EXISTS `house` (
  `hou_id` int(11) NOT NULL AUTO_INCREMENT,
  `hou_address` varchar(50) NOT NULL,
  `hou_row` varchar(50) NOT NULL,
  `hou_details` varchar(50) NOT NULL,
  `hou_bdcount` int(11) NOT NULL,
  `hou_drcount` int(11) NOT NULL,
  `hou_kitcount` int(11) NOT NULL,
  `hou_ipcount` int(11) NOT NULL,
  `hou_cmcount` int(11) NOT NULL,
  `hou_letcount` int(11) NOT NULL DEFAULT '0',
  `rt_id` int(11) NOT NULL,
  `hou_checkcount` int(11) NOT NULL,
  `hou_bedcount` int(11) NOT NULL,
  `cli_id` int(11) NOT NULL,
  PRIMARY KEY (`hou_id`),
  KEY `FK__room_type` (`rt_id`),
  KEY `FK_house_client` (`cli_id`),
  CONSTRAINT `FK__room_type` FOREIGN KEY (`rt_id`) REFERENCES `room_type` (`rt_id`),
  CONSTRAINT `FK_house_client` FOREIGN KEY (`cli_id`) REFERENCES `client` (`cli_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='房源信息表';

-- 正在导出表  homestay.house 的数据：~0 rows (大约)
DELETE FROM `house`;
/*!40000 ALTER TABLE `house` DISABLE KEYS */;
INSERT INTO `house` (`hou_id`, `hou_address`, `hou_row`, `hou_details`, `hou_bdcount`, `hou_drcount`, `hou_kitcount`, `hou_ipcount`, `hou_cmcount`, `hou_letcount`, `rt_id`, `hou_checkcount`, `hou_bedcount`, `cli_id`) VALUES
	(1, '郑州', '金水区', '民航路20号院未来滨河小区', 1, 1, 1, 1, 1, 1, 2, 4, 2, 1);
/*!40000 ALTER TABLE `house` ENABLE KEYS */;


-- 导出  表 homestay.manager 结构
DROP TABLE IF EXISTS `manager`;
CREATE TABLE IF NOT EXISTS `manager` (
  `man_id` int(11) NOT NULL AUTO_INCREMENT,
  `man_name` varchar(50) NOT NULL,
  PRIMARY KEY (`man_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='部门表';

-- 正在导出表  homestay.manager 的数据：~2 rows (大约)
DELETE FROM `manager`;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` (`man_id`, `man_name`) VALUES
	(1, '管理部门'),
	(2, '财务部门');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;


-- 导出  表 homestay.member 结构
DROP TABLE IF EXISTS `member`;
CREATE TABLE IF NOT EXISTS `member` (
  `mem_id` int(11) NOT NULL AUTO_INCREMENT,
  `mem_name` varchar(50) NOT NULL,
  `mem_power` float NOT NULL,
  `mem_condition` int(11) NOT NULL,
  PRIMARY KEY (`mem_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='会员表';

-- 正在导出表  homestay.member 的数据：~0 rows (大约)
DELETE FROM `member`;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;


-- 导出  表 homestay.message 结构
DROP TABLE IF EXISTS `message`;
CREATE TABLE IF NOT EXISTS `message` (
  `mess_name` varchar(50) NOT NULL,
  `mess_principa` varchar(50) NOT NULL,
  `mess_phone` varchar(50) NOT NULL,
  `mess_idea` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='平台信息';

-- 正在导出表  homestay.message 的数据：~0 rows (大约)
DELETE FROM `message`;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` (`mess_name`, `mess_principa`, `mess_phone`, `mess_idea`) VALUES
	('木鸟民宿', '曾女士', '12345678977', '111111111');
/*!40000 ALTER TABLE `message` ENABLE KEYS */;


-- 导出  表 homestay.order 结构
DROP TABLE IF EXISTS `order`;
CREATE TABLE IF NOT EXISTS `order` (
  `or_id` int(11) NOT NULL AUTO_INCREMENT,
  `or_date` date DEFAULT NULL,
  `or_checkdate` date DEFAULT NULL,
  `or_outdate` date DEFAULT NULL,
  `or_checkcount` int(11) DEFAULT NULL,
  `or_needprice` int(11) DEFAULT NULL,
  `or_trueprice` int(11) DEFAULT NULL,
  `cli_id` int(11) DEFAULT NULL,
  `hou_id` int(11) DEFAULT NULL,
  `or_state` int(11) DEFAULT '0',
  PRIMARY KEY (`or_id`),
  KEY `FK_order_house` (`hou_id`),
  KEY `FK_order_client` (`cli_id`),
  CONSTRAINT `FK_order_client` FOREIGN KEY (`cli_id`) REFERENCES `client` (`cli_id`),
  CONSTRAINT `FK_order_house` FOREIGN KEY (`hou_id`) REFERENCES `house` (`hou_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单表';

-- 正在导出表  homestay.order 的数据：~0 rows (大约)
DELETE FROM `order`;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;


-- 导出  表 homestay.order_appraise 结构
DROP TABLE IF EXISTS `order_appraise`;
CREATE TABLE IF NOT EXISTS `order_appraise` (
  `oa_id` int(11) NOT NULL AUTO_INCREMENT,
  `cli_id` int(11) NOT NULL,
  `or_cover` varchar(50) NOT NULL,
  `oa_date` date NOT NULL,
  `or_id` int(11) NOT NULL,
  `or_details` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`oa_id`),
  KEY `FK_order_appraise_client` (`cli_id`),
  KEY `FK_order_appraise_order` (`or_id`),
  CONSTRAINT `FK_order_appraise_client` FOREIGN KEY (`cli_id`) REFERENCES `client` (`cli_id`),
  CONSTRAINT `FK_order_appraise_order` FOREIGN KEY (`or_id`) REFERENCES `order` (`or_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单评价表';

-- 正在导出表  homestay.order_appraise 的数据：~0 rows (大约)
DELETE FROM `order_appraise`;
/*!40000 ALTER TABLE `order_appraise` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_appraise` ENABLE KEYS */;


-- 导出  表 homestay.order_details 结构
DROP TABLE IF EXISTS `order_details`;
CREATE TABLE IF NOT EXISTS `order_details` (
  `od_id` int(11) NOT NULL AUTO_INCREMENT,
  `od_name` varchar(50) NOT NULL,
  `od_card` varchar(50) NOT NULL,
  `or_id` int(11) NOT NULL,
  PRIMARY KEY (`od_id`),
  KEY `FK_order_details_order` (`or_id`),
  CONSTRAINT `FK_order_details_order` FOREIGN KEY (`or_id`) REFERENCES `order` (`or_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单详情表';

-- 正在导出表  homestay.order_details 的数据：~0 rows (大约)
DELETE FROM `order_details`;
/*!40000 ALTER TABLE `order_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_details` ENABLE KEYS */;


-- 导出  表 homestay.pay 结构
DROP TABLE IF EXISTS `pay`;
CREATE TABLE IF NOT EXISTS `pay` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(50) NOT NULL,
  `p_number` varchar(50) NOT NULL,
  `cli_id` int(11) NOT NULL,
  PRIMARY KEY (`p_id`),
  KEY `FK__client` (`cli_id`),
  CONSTRAINT `FK__client` FOREIGN KEY (`cli_id`) REFERENCES `client` (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='支付账号表';

-- 正在导出表  homestay.pay 的数据：~0 rows (大约)
DELETE FROM `pay`;
/*!40000 ALTER TABLE `pay` DISABLE KEYS */;
/*!40000 ALTER TABLE `pay` ENABLE KEYS */;


-- 导出  表 homestay.position 结构
DROP TABLE IF EXISTS `position`;
CREATE TABLE IF NOT EXISTS `position` (
  `pos_id` int(11) NOT NULL AUTO_INCREMENT,
  `pos_name` varchar(50) NOT NULL,
  `man_id` int(11) NOT NULL,
  PRIMARY KEY (`pos_id`),
  KEY `FK__manager` (`man_id`),
  CONSTRAINT `FK__manager` FOREIGN KEY (`man_id`) REFERENCES `manager` (`man_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='职位表';

-- 正在导出表  homestay.position 的数据：~2 rows (大约)
DELETE FROM `position`;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` (`pos_id`, `pos_name`, `man_id`) VALUES
	(1, '主管', 1),
	(2, '财务经理', 2),
	(3, '测试人员', 1);
/*!40000 ALTER TABLE `position` ENABLE KEYS */;


-- 导出  表 homestay.position_allot 结构
DROP TABLE IF EXISTS `position_allot`;
CREATE TABLE IF NOT EXISTS `position_allot` (
  `pos_id` int(11) NOT NULL,
  `fun_id` int(11) NOT NULL,
  KEY `FK__function` (`fun_id`),
  KEY `FK_position_allot_position` (`pos_id`),
  CONSTRAINT `FK__function` FOREIGN KEY (`fun_id`) REFERENCES `function` (`fun_id`),
  CONSTRAINT `FK_position_allot_position` FOREIGN KEY (`pos_id`) REFERENCES `position` (`pos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  homestay.position_allot 的数据：~0 rows (大约)
DELETE FROM `position_allot`;
/*!40000 ALTER TABLE `position_allot` DISABLE KEYS */;
INSERT INTO `position_allot` (`pos_id`, `fun_id`) VALUES
	(2, 4),
	(1, 2),
	(1, 4),
	(1, 3),
	(1, 1),
	(2, 1),
	(2, 2),
	(2, 3),
	(3, 1),
	(3, 2),
	(3, 4),
	(3, 3);
/*!40000 ALTER TABLE `position_allot` ENABLE KEYS */;


-- 导出  表 homestay.power 结构
DROP TABLE IF EXISTS `power`;
CREATE TABLE IF NOT EXISTS `power` (
  `pow_id` int(11) NOT NULL AUTO_INCREMENT,
  `pow_name` varchar(50) NOT NULL,
  `pow_url` varchar(50) NOT NULL,
  PRIMARY KEY (`pow_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='模块表';

-- 正在导出表  homestay.power 的数据：~11 rows (大约)
DELETE FROM `power`;
/*!40000 ALTER TABLE `power` DISABLE KEYS */;
INSERT INTO `power` (`pow_id`, `pow_name`, `pow_url`) VALUES
	(1, '部门管理', '1'),
	(2, '员工管理', '1'),
	(3, '账号管理', '1'),
	(4, '职位分配', '1'),
	(5, '权限管理', '1'),
	(6, '客户管理', '1'),
	(7, '房间管理', '1'),
	(8, '民宿类型', '1'),
	(9, '订单管理', '1'),
	(10, '平台流水管理', '1'),
	(11, '评价管理', '1'),
	(12, '职位权限关联', '1');
/*!40000 ALTER TABLE `power` ENABLE KEYS */;


-- 导出  表 homestay.power_allot 结构
DROP TABLE IF EXISTS `power_allot`;
CREATE TABLE IF NOT EXISTS `power_allot` (
  `pos_id` int(11) NOT NULL,
  `pow_id` int(11) NOT NULL,
  KEY `FK__power` (`pow_id`),
  KEY `FK_power_allot_position` (`pos_id`),
  CONSTRAINT `FK__power` FOREIGN KEY (`pow_id`) REFERENCES `power` (`pow_id`),
  CONSTRAINT `FK_power_allot_position` FOREIGN KEY (`pos_id`) REFERENCES `position` (`pos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='职位功能关联表';

-- 正在导出表  homestay.power_allot 的数据：~1 rows (大约)
DELETE FROM `power_allot`;
/*!40000 ALTER TABLE `power_allot` DISABLE KEYS */;
INSERT INTO `power_allot` (`pos_id`, `pow_id`) VALUES
	(1, 2),
	(1, 1),
	(1, 4),
	(1, 3),
	(1, 5),
	(1, 6),
	(1, 7),
	(1, 8),
	(1, 9),
	(2, 10),
	(1, 11),
	(3, 2),
	(1, 12),
	(3, 1),
	(3, 3),
	(3, 4),
	(3, 5),
	(3, 6),
	(3, 7),
	(3, 8),
	(3, 9),
	(3, 10),
	(3, 11),
	(3, 12);
/*!40000 ALTER TABLE `power_allot` ENABLE KEYS */;


-- 导出  表 homestay.real_name 结构
DROP TABLE IF EXISTS `real_name`;
CREATE TABLE IF NOT EXISTS `real_name` (
  `rn_id` int(11) NOT NULL AUTO_INCREMENT,
  `cli_id` int(11) NOT NULL,
  `id_card` varchar(50) NOT NULL,
  PRIMARY KEY (`rn_id`),
  KEY `FK_real_name_client` (`cli_id`),
  CONSTRAINT `FK_real_name_client` FOREIGN KEY (`cli_id`) REFERENCES `client` (`cli_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='注册房东实名认证表';

-- 正在导出表  homestay.real_name 的数据：~0 rows (大约)
DELETE FROM `real_name`;
/*!40000 ALTER TABLE `real_name` DISABLE KEYS */;
INSERT INTO `real_name` (`rn_id`, `cli_id`, `id_card`) VALUES
	(1, 1, '1.png');
/*!40000 ALTER TABLE `real_name` ENABLE KEYS */;


-- 导出  表 homestay.relevance 结构
DROP TABLE IF EXISTS `relevance`;
CREATE TABLE IF NOT EXISTS `relevance` (
  `acc_id` int(11) NOT NULL,
  `pos_id` int(11) NOT NULL,
  KEY `FK__account` (`acc_id`),
  KEY `FK__position` (`pos_id`),
  CONSTRAINT `FK__account` FOREIGN KEY (`acc_id`) REFERENCES `account` (`acc_id`),
  CONSTRAINT `FK__position` FOREIGN KEY (`pos_id`) REFERENCES `position` (`pos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户职位关联表';

-- 正在导出表  homestay.relevance 的数据：~2 rows (大约)
DELETE FROM `relevance`;
/*!40000 ALTER TABLE `relevance` DISABLE KEYS */;
INSERT INTO `relevance` (`acc_id`, `pos_id`) VALUES
	(1, 1),
	(2, 2),
	(3, 3);
/*!40000 ALTER TABLE `relevance` ENABLE KEYS */;


-- 导出  表 homestay.rent_record 结构
DROP TABLE IF EXISTS `rent_record`;
CREATE TABLE IF NOT EXISTS `rent_record` (
  `re_id` int(11) NOT NULL AUTO_INCREMENT,
  `re_date` date NOT NULL,
  `re_money` int(11) NOT NULL,
  `cli_id` int(11) NOT NULL,
  `re_type` varchar(50) NOT NULL DEFAULT '支付宝',
  `re_state` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`re_id`),
  KEY `FK_rent_record_client` (`cli_id`),
  CONSTRAINT `FK_rent_record_client` FOREIGN KEY (`cli_id`) REFERENCES `client` (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='租金体现记录表';

-- 正在导出表  homestay.rent_record 的数据：~0 rows (大约)
DELETE FROM `rent_record`;
/*!40000 ALTER TABLE `rent_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `rent_record` ENABLE KEYS */;


-- 导出  表 homestay.Room_type 结构
DROP TABLE IF EXISTS `room_type`;
CREATE TABLE IF NOT EXISTS `room_type` (
  `rt_id` int(11) NOT NULL AUTO_INCREMENT,
  `rt_name` varchar(50) NOT NULL,
  `rt_rec` varchar(50) NOT NULL,
  PRIMARY KEY (`rt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='房间类型表';

-- 正在导出表  homestay.Room_type 的数据：~0 rows (大约)
DELETE FROM `room_type`;
/*!40000 ALTER TABLE `Room_type` DISABLE KEYS */;
INSERT INTO `room_type` (`rt_id`, `rt_name`, `rt_rec`) VALUES
	(1, '民居', 'aaaaaaaaaaa'),
	(2, '公寓', 'aaaaaaaaaaa'),
	(3, '独栋别墅', 'aaaaaaaaaaa'),
	(4, '四合院', 'aaaaaaaaaaa'),
	(5, '农家院', 'aaaaaaaaaaa'),
	(6, '客栈', 'aaaaaaaaaaa'),
	(7, '其它', 'aaaaaaaaaaa');
/*!40000 ALTER TABLE `Room_type` ENABLE KEYS */;


-- 导出  表 homestay.rule 结构
DROP TABLE IF EXISTS `rule`;
CREATE TABLE IF NOT EXISTS `rule` (
  `ru_id` int(11) NOT NULL AUTO_INCREMENT,
  `ru_price` int(11) NOT NULL,
  `ru_daymin` int(11) NOT NULL,
  `ru_daymax` int(11) NOT NULL,
  `ru_checkdate` int(11) NOT NULL,
  `ru_outdate` int(11) NOT NULL,
  `ru_require` varchar(50) NOT NULL,
  `hou_id` int(11) NOT NULL,
  PRIMARY KEY (`ru_id`),
  KEY `FK__house` (`hou_id`),
  CONSTRAINT `FK__house` FOREIGN KEY (`hou_id`) REFERENCES `house` (`hou_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='价格规则表';

-- 正在导出表  homestay.rule 的数据：~0 rows (大约)
DELETE FROM `rule`;
/*!40000 ALTER TABLE `rule` DISABLE KEYS */;
/*!40000 ALTER TABLE `rule` ENABLE KEYS */;


-- 导出  表 homestay.water 结构
DROP TABLE IF EXISTS `water`;
CREATE TABLE IF NOT EXISTS `water` (
  `wat_id` int(11) NOT NULL AUTO_INCREMENT,
  `wat_money` int(11) NOT NULL,
  `wat_date` date NOT NULL,
  `or_id` int(11) NOT NULL,
  `wat_state` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`wat_id`),
  KEY `FK_water_order` (`or_id`),
  CONSTRAINT `FK_water_order` FOREIGN KEY (`or_id`) REFERENCES `order` (`or_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='平台流水';

-- 正在导出表  homestay.water 的数据：~0 rows (大约)
DELETE FROM `water`;
/*!40000 ALTER TABLE `water` DISABLE KEYS */;
/*!40000 ALTER TABLE `water` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
