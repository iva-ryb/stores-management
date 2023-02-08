alter table APPLICATION_PRODUCT rename column retailer_id to retailer_id__u38391 ;
alter table APPLICATION_PRODUCT drop constraint FK_APPLICATION_PRODUCT_ON_RETAILER ;
drop index IDX_APPLICATION_PRODUCT_ON_RETAILER ;
alter table APPLICATION_PRODUCT rename column price_from_retailer to price_from_retailer__u69751 ;
alter table APPLICATION_PRODUCT add column PRICE_FROM_PRODUCER decimal(19, 2) ;
alter table APPLICATION_PRODUCT add column PRODUCER_ID uuid ;
