INSERT INTO `rs_ecommerce`.`ROLLINGSTONE_CART`
(
`CART_TOTAL`,
`CART_DATE`,
`user_profile_id`)
VALUES
(
200.00,
'2018-10-20',
1);

INSERT INTO `rs_ecommerce`.`ROLLINGSTONE_CART_ITEM`
(
`OFFER_ID`,
`PRODUCT_ID`,
`QUANTITY`,
`UNIT`,
`PRICE`,
`FFM_TYPE`,
`CART_ID`)
VALUES
(
1001,
1001,
3,
'PCS',
112.00,
'SHIPPING',
9);