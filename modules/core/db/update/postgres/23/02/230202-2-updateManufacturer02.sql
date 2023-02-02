alter table APPLICATION_MANUFACTURER rename column address_id to address_id__u18104 ;
alter table APPLICATION_MANUFACTURER alter column address_id__u18104 drop not null ;
drop index IDX_APPLICATION_MANUFACTURER_ON_ADDRESS ;
-- alter table APPLICATION_MANUFACTURER add column ADDRESS_ID uuid ^
-- update APPLICATION_MANUFACTURER set ADDRESS_ID = <default_value> ;
-- alter table APPLICATION_MANUFACTURER alter column address_id set not null ;
alter table APPLICATION_MANUFACTURER add column ADDRESS_ID uuid not null ;
