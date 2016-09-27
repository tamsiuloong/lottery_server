/*
Navicat MySQL Data Transfer

Source Server         : mine
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : lottery

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2016-08-31 17:00:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ts_winningpeople
-- ----------------------------
DROP TABLE IF EXISTS `ts_winningpeople`;
CREATE TABLE `ts_winningpeople` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prize` varchar(255) DEFAULT NULL,
  `area` int(11) DEFAULT NULL,
  `row` int(11) DEFAULT NULL,
  `seat` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ts_winningpeople
-- ----------------------------
INSERT INTO `ts_winningpeople` VALUES ('1', '全英雄，全皮肤', '6', '1', '4');
INSERT INTO `ts_winningpeople` VALUES ('2', '全英雄，全皮肤', '4', '4', '8');
INSERT INTO `ts_winningpeople` VALUES ('3', '全英雄，全皮肤', '3', '7', '5');
INSERT INTO `ts_winningpeople` VALUES ('4', '全英雄，全皮肤', '3', '20', '27');
INSERT INTO `ts_winningpeople` VALUES ('5', '全英雄，全皮肤', '3', '20', '27');
INSERT INTO `ts_winningpeople` VALUES ('6', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('7', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('8', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('9', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('10', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('11', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('12', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('13', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('14', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('15', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('16', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('17', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('18', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('19', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('20', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('21', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('22', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('23', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('24', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('25', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('26', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('27', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('28', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('29', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('30', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('31', '全英雄，全皮肤', '2', '19', '28');
INSERT INTO `ts_winningpeople` VALUES ('32', '三国全英雄，全皮肤', '4', '6', '13');
INSERT INTO `ts_winningpeople` VALUES ('33', '全英雄，全皮肤', '2', '19', '28');
