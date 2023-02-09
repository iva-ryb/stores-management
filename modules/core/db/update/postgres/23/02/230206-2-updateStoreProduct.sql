-- update APPLICATION_STORE_PRODUCT set STORE_ID = <default_value> where STORE_ID is null ;
alter table APPLICATION_STORE_PRODUCT alter column STORE_ID set not null ;
