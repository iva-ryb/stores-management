-- alter table APPLICATION_SHOP add column ADDRESS_ID uuid ^
-- update APPLICATION_SHOP set ADDRESS_ID = <default_value> ;
-- alter table APPLICATION_SHOP alter column ADDRESS_ID set not null ;
alter table APPLICATION_SHOP add column ADDRESS_ID uuid not null ;
