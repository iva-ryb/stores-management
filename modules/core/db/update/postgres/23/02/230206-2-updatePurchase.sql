alter table APPLICATION_PURCHASE rename column shop_id to shop_id__u88412 ;
alter table APPLICATION_PURCHASE alter column shop_id__u88412 drop not null ;
alter table APPLICATION_PURCHASE drop constraint FK_APPLICATION_PURCHASE_ON_SHOP ;
drop index IDX_APPLICATION_PURCHASE_ON_SHOP ;
-- alter table APPLICATION_PURCHASE add column STORE_ID uuid ^
-- update APPLICATION_PURCHASE set STORE_ID = <default_value> ;
-- alter table APPLICATION_PURCHASE alter column STORE_ID set not null ;
alter table APPLICATION_PURCHASE add column STORE_ID uuid not null ;
