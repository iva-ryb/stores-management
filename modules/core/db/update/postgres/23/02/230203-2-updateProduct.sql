alter table APPLICATION_PRODUCT rename column manufacturer_id to manufacturer_id__u80151 ;
drop index IDX_APPLICATION_PRODUCT_ON_MANUFACTURER ;
alter table APPLICATION_PRODUCT add column MANUFACTURER_ID uuid ;
