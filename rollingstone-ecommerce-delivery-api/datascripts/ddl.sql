CREATE TABLE `ROLLINGSTONE_DELIVERY` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `OFFERID` bigint(20) NOT NULL,
  `PRODUCT_ID` bigint(20) NOT NULL,
  `IS_AVAILABLE` varchar(1) NOT NULL,
  `AVAILABLE_DATE` date DEFAULT NULL,
  `DAYS_IN_TRANSIT` int(11) DEFAULT NULL,
  `DELIVERY_CHARGE` decimal(12,2) DEFAULT NULL,
  `IS_FREE_FOR_MEMBERS` varchar(1) NOT NULL,
  `HAUL_AWAY_MESSAGE` varchar(100) NOT NULL,
  `HAS_SPECIAL_OFFERS` varchar(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
