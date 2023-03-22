alter table APPLICATION_PRODUCT rename column manufacturer_id to manufacturer_id__u57010 ;
alter table APPLICATION_PRODUCT drop constraint FK_APPLICATION_PRODUCT_ON_MANUFACTURER ;
drop index IDX_APPLICATION_PRODUCT_ON_MANUFACTURER ;
alter table APPLICATION_PRODUCT rename column price_from_manufacturer to price_from_manufacturer__u80067 ;
alter table APPLICATION_PRODUCT add column PRICE_FROM_RETAILER decimal(19, 2) ;
alter table APPLICATION_PRODUCT add column RETAILER_ID uuid ;
