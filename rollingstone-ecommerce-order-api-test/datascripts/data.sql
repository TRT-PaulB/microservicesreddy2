INSERT INTO `rs_ecommerce`.`ROLLINGSTONE_ORDER`
(
`ORDER_NUMBER`,
`ORDER_TRACKING_NUMBER`,
`ORDER_TOTAL`,
`ORDER_DATE`,
`user_profile_id`,
`SHIPPING_ADDRESS_ID`,
`BILLING_ADDRESS_ID`,
`ACCOUNT_ID`)
VALUES
(
'1001',
'OT_1001',
200.00,
'2018-10-20',
1,
10,
10,
8);

INSERT INTO `rs_ecommerce`.`ROLLINGSTONE_ORDER_ITEMS`
(
`QTY_ORDERED`,
`uom`,
`unit_price`,
`order_id`,
`product_id`)
VALUES
(
2,
'PCS',
20.00,
3,
1);