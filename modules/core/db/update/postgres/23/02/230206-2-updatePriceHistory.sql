alter table APPLICATION_PRICE_HISTORY rename column shop_id to shop_id__u61575 ;
alter table APPLICATION_PRICE_HISTORY drop constraint FK_APPLICATION_PRICE_HISTORY_ON_SHOP ;
drop index IDX_APPLICATION_PRICE_HISTORY_ON_SHOP ;
alter table APPLICATION_PRICE_HISTORY add column STORE_ID uuid ;
