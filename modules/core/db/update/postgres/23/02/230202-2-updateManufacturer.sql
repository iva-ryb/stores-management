-- alter table APPLICATION_MANUFACTURER add column ADDRESS_ID uuid ^
-- update APPLICATION_MANUFACTURER set ADDRESS_ID = <default_value> ;
-- alter table APPLICATION_MANUFACTURER alter column ADDRESS_ID set not null ;
alter table APPLICATION_MANUFACTURER add column ADDRESS_ID uuid not null ;
