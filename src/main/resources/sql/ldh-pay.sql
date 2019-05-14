/*
Navicat MySQL Data Transfer

Source Server         : 刘德煌
Source Server Version : 50722
Source Host           : 127.0.0.1:3306
Source Database       : ldh-pay

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-05-13 15:57:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_ali_configuration
-- ----------------------------
DROP TABLE IF EXISTS `t_ali_configuration`;
CREATE TABLE `t_ali_configuration` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `fid` varchar(255) NOT NULL DEFAULT '' COMMENT '支付宝配置ID',
  `gateway` varchar(255) NOT NULL DEFAULT '' COMMENT '网关地址',
  `appid` varchar(255) NOT NULL DEFAULT '' COMMENT '支付宝appid',
  `merchantprivatekey` text NOT NULL COMMENT '商户私钥',
  `alipaypublickey` text NOT NULL COMMENT '支付宝公钥',
  `notifyurl` varchar(255) NOT NULL COMMENT '异步回调地址',
  `returnurl` varchar(255) NOT NULL DEFAULT '' COMMENT '同步回调地址',
  `signtype` varchar(255) NOT NULL DEFAULT '' COMMENT '签名加密类型',
  `charset` varchar(255) NOT NULL DEFAULT '' COMMENT '编码格式',
  `format` varchar(255) NOT NULL DEFAULT '' COMMENT 'json格式',
  `merchant` varchar(255) NOT NULL DEFAULT '' COMMENT '商户主体',
  `paycode` varchar(255) NOT NULL DEFAULT '' COMMENT '支付类型',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '该套配置是否启用0:启用 1:禁用',
  `createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_ali_configuration
-- ----------------------------
INSERT INTO `t_ali_configuration` VALUES ('1', '24362198-6b4a-0ce4-8d55-cbe88a427c61', 'https://openapi.alipaydev.com/gateway.do', '2016092500590981', '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', 'http://liudehuang.nat300.top/pay/callBack/aliCallBack', 'http://liudehuang.nat300.top/pay/callBack/aliCallBack', 'RSA2', 'UTF-8', 'JSON', 'LiuDeHuang', 'ALIQR', '0', '2019-05-13 13:09:39', '2019-05-13 13:09:39');
INSERT INTO `t_ali_configuration` VALUES ('2', '71156101-f8f4-45cc-316f-9fb850c5327c', 'https://openapi.alipaydev.com/gateway.do', '2016092500590981', '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', 'http://liudehuang.nat300.top/pay/callBack/aliCallBack', 'http://liudehuang.nat300.top/pay/callBack/aliCallBack', 'RSA2', 'UTF-8', 'JSON', 'LiuDeHuang', 'ALISDK', '0', '2019-05-13 13:12:22', '2019-05-13 13:12:22');

-- ----------------------------
-- Table structure for t_pay_record
-- ----------------------------
DROP TABLE IF EXISTS `t_pay_record`;
CREATE TABLE `t_pay_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `fid` varchar(255) NOT NULL DEFAULT '' COMMENT '支付记录id',
  `userid` varchar(255) NOT NULL DEFAULT '' COMMENT '用户id',
  `merchant` varchar(255) NOT NULL DEFAULT '' COMMENT '商户主体',
  `orderid` varchar(255) NOT NULL DEFAULT '' COMMENT '订单id',
  `outtradeno` varchar(255) NOT NULL DEFAULT '' COMMENT '商户号',
  `amount` decimal(12,2) NOT NULL COMMENT '金额',
  `paycode` varchar(255) NOT NULL DEFAULT '' COMMENT '支付类型',
  `tradeno` varchar(255) NOT NULL DEFAULT '' COMMENT '第三方平台订单号',
  `returndata` text COMMENT '调用第三方平台接口返回值',
  `notifydata` text COMMENT '异步回调返回的数据',
  `status` tinyint(1) DEFAULT NULL COMMENT '订单状态',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_pay_record
-- ----------------------------

-- ----------------------------
-- Table structure for t_system
-- ----------------------------
DROP TABLE IF EXISTS `t_system`;
CREATE TABLE `t_system` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `systemid` varchar(255) NOT NULL DEFAULT '' COMMENT '系统id',
  `systemname` varchar(255) NOT NULL DEFAULT '' COMMENT '系统名称',
  `merchant` varchar(255) NOT NULL DEFAULT '' COMMENT '商户主体',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '该主体商户是否启用或禁用',
  `createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system
-- ----------------------------
INSERT INTO `t_system` VALUES ('1', '101', '团购', 'DongJing', '0', '2019-05-13 13:05:30', '2019-05-13 13:05:30');
INSERT INTO `t_system` VALUES ('2', '102', 'wms', 'DongLin', '0', '2019-05-13 13:05:43', '2019-05-13 13:05:43');
INSERT INTO `t_system` VALUES ('3', '103', 'tms', 'DongYun', '0', '2019-05-13 13:05:56', '2019-05-13 13:05:56');
INSERT INTO `t_system` VALUES ('4', '104', '一路好运', 'DongYun', '0', '2019-05-13 13:06:15', '2019-05-13 13:06:15');
INSERT INTO `t_system` VALUES ('5', '105', '蚂蚁课堂', 'LiuDeHuang', '0', '2019-05-13 13:06:40', '2019-05-13 13:06:40');

-- ----------------------------
-- Table structure for t_wx_configuration
-- ----------------------------
DROP TABLE IF EXISTS `t_wx_configuration`;
CREATE TABLE `t_wx_configuration` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `fid` varchar(255) NOT NULL DEFAULT '' COMMENT '微信配置id',
  `appid` varchar(255) NOT NULL DEFAULT '' COMMENT '微信appid',
  `mchid` varchar(255) NOT NULL DEFAULT '' COMMENT '商户id',
  `mchkey` varchar(255) NOT NULL DEFAULT '' COMMENT '商户私钥',
  `signtype` varchar(255) NOT NULL DEFAULT '' COMMENT '签名加密类型',
  `charset` varchar(255) NOT NULL DEFAULT '' COMMENT '编码格式',
  `gateway` varchar(255) NOT NULL DEFAULT '' COMMENT '微信网关地址',
  `paycode` varchar(255) NOT NULL DEFAULT '' COMMENT '支付类型WXSDK/WXQR',
  `merchant` varchar(255) NOT NULL DEFAULT '' COMMENT '商户主体',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '改配置是否启用0：启用 1：禁用',
  `createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_wx_configuration
-- ----------------------------
INSERT INTO `t_wx_configuration` VALUES ('1', '96fe2f3f-ca82-7445-d305-4b3ce6e5a671', 'wx4f4374e47a360c22', '1355406302', '650477235c5e0882a0470e94accd9f6f', 'MD5', 'UTF-8', 'https://api.mch.weixin.qq.com', 'WXQR', 'DongJing', '0', '2019-05-13 13:14:48', '2019-05-13 13:14:48');
INSERT INTO `t_wx_configuration` VALUES ('2', '9282a842-b8ee-01a3-003d-59782b037400', 'wxd25d82dbc2b757d8', '1407428602', '650477235c5e0882a0470e94accd9f6f', 'MD5', 'UTF-8', 'https://api.mch.weixin.qq.com', 'WXSDK', 'DongJing', '0', '2019-05-13 13:15:36', '2019-05-13 13:15:48');
INSERT INTO `t_wx_configuration` VALUES ('3', '434447e9-05b1-2850-c4ba-e6983f9c141e', 'wx1ecdbf1af13134e0', '1365087602', '650477235c5e0882a0470e94accd9f6f', 'MD5', 'UTF-8', 'https://api.mch.weixin.qq.com', 'WXQR', 'DongLin', '0', '2019-05-13 13:17:17', '2019-05-13 13:17:17');
INSERT INTO `t_wx_configuration` VALUES ('4', 'e2ccd487-8785-9e1c-4029-8c70f7f890a5', 'wx7fd784c2722e30cf', '1375820302', '650477235c5e0882a0470e94accd9f6f', 'MD5', 'UTF-8', 'https://api.mch.weixin.qq.com', 'WXSDK', 'DongLin', '0', '2019-05-13 13:19:03', '2019-05-13 13:19:03');
INSERT INTO `t_wx_configuration` VALUES ('5', '655d7e1c-fc0a-9af5-6cbd-256f5b7bf9db', 'wxd5e05ba656b42de8', '1267510801', '650477235c5e0882a0470e94accd9f6f', 'MD5', 'UTF-8', 'https://api.mch.weixin.qq.com', 'WXQR', 'DongYun', '0', '2019-05-13 13:20:09', '2019-05-13 13:20:30');
INSERT INTO `t_wx_configuration` VALUES ('6', '84d7783b-2fa4-83d5-dec2-c2aab02d3a11', 'wx1f72fbddc1fa61a8', '1298922601', '650477235c5e0882a0470e94accd9f6f', 'MD5', 'UTF-8', 'https://api.mch.weixin.qq.com', 'WXSDK', 'DongYun', '0', '2019-05-13 13:21:39', '2019-05-13 13:21:39');
