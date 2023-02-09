alter table APPLICATION_SHOP rename column address_id to address_id__u05188 ;
alter table APPLICATION_SHOP alter column address_id__u05188 drop not null ;
drop index IDX_APPLICATION_SHOP_ON_ADDRESS ;
-- alter table APPLICATION_SHOP add column ADDRESS_ID uuid ^
-- update APPLICATION_SHOP set ADDRESS_ID = <default_value> ;
-- alter table APPLICATION_SHOP alter column address_id set not null ;
alter table APPLICATION_SHOP add column ADDRESS_ID uuid not null ;
