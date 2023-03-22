alter table APPLICATION_PURCHASE rename column shop_id to shop_id__u39358 ;
alter table APPLICATION_PURCHASE alter column shop_id__u39358 drop not null ;
drop index IDX_APPLICATION_PURCHASE_ON_SHOP ;
-- alter table APPLICATION_PURCHASE add column SHOP_ID uuid ^
-- update APPLICATION_PURCHASE set SHOP_ID = <default_value> ;
-- alter table APPLICATION_PURCHASE alter column shop_id set not null ;
alter table APPLICATION_PURCHASE add column SHOP_ID uuid not null ;
