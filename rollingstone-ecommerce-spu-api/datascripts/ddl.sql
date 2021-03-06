CREATE TABLE `ROLLINGSTONE_SPU` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `OFFER_ID` bigint(20) NOT NULL,
  `PRODUCT_ID` bigint(20) NOT NULL,
  `HIGHESTSTOREINDEX` int(11) DEFAULT NULL,
  `RADIUS` varchar(100) NOT NULL,
  `STORE_NAME` varchar(100) NOT NULL,
  `DAYS` int(11) DEFAULT NULL,
  `PROMiSE_DATE` date DEFAULT NULL,
  `INSTOCKSTATUS` varchar(1) NOT NULL,
  `QUANTITY` int(11) DEFAULT NULL,
  `AVAILABLEQUANTITY` int(11) DEFAULT NULL,
  `ISAUTOSTORE` varchar(1) NOT NULL,
  `NEAREST` varchar(1) NOT NULL,
  `STORENUMBER` varchar(20) NOT NULL,
  `STREETADDRESS` varchar(100) NOT NULL,
  `CITY` varchar(100) NOT NULL,
  `STATE` varchar(100) NOT NULL,
  `ZIPCODE` varchar(100) NOT NULL,
  `PHONE` varchar(100) NOT NULL,
  `SUNWH` varchar(100) NOT NULL,
  `MONWH` varchar(100) NOT NULL,
  `TUEWH` varchar(100) NOT NULL,
  `WEDWH` varchar(100) NOT NULL,
  `THURWH` varchar(100) NOT NULL,
  `FRIWH` varchar(100) NOT NULL,
  `SATWH` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;