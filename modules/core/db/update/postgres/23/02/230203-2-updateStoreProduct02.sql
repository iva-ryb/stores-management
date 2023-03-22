alter table APPLICATION_STORE_PRODUCT rename column shop_id to shop_id__u57308 ;
alter table APPLICATION_STORE_PRODUCT drop constraint FK_APPLICATION_STORE_PRODUCT_ON_SHOP ;
drop index IDX_APPLICATION_STORE_PRODUCT_ON_SHOP ;
alter table APPLICATION_STORE_PRODUCT add column STORE_ID uuid ;
