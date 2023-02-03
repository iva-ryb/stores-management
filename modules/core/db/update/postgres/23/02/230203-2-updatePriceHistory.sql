alter table APPLICATION_PRICE_HISTORY rename column shop_id to shop_id__u92576 ;
drop index IDX_APPLICATION_PRICE_HISTORY_ON_SHOP ;
alter table APPLICATION_PRICE_HISTORY add column SHOP_ID uuid ;
