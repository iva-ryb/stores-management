alter table APPLICATION_PRODUCT rename column retailer_id to retailer_id__u67413 ;
drop index IDX_APPLICATION_PRODUCT_ON_RETAILER ;
alter table APPLICATION_PRODUCT add column RETAILER_ID uuid ;
