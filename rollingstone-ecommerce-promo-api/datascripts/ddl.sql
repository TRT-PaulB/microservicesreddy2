CREATE TABLE `ROLLINGSTONE_PROMO` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `DISCOUNT_TYPE` varchar(255) NOT NULL,
  `DISCOUNT_AMOUNT` double NOT NULL,
  `END_DATE` date NOT NULL,
  `MIN_PURCHASE_VALUE` varchar(255) NOT NULL,
  `PRODUCT_CODE` varchar(255) NOT NULL,
   `PROMO_CODE` varchar(255) NOT NULL,
  `PROMO_NAME` varchar(255) NOT NULL,
   `PROMO_TITLE` varchar(255) NOT NULL,
  `PROMO_DETAILS` varchar(255) NOT NULL,
  `START_DATE` date NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;