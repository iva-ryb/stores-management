alter table APPLICATION_STORE_PRODUCT rename column shop_id to shop_id__u19127 ;
drop index IDX_APPLICATION_STORE_PRODUCT_ON_SHOP ;
alter table APPLICATION_STORE_PRODUCT add column SHOP_ID uuid ;
