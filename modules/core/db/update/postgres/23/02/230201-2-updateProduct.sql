-- update APPLICATION_PRODUCT set PRICE_FROM_MANUFACTURER = <default_value> where PRICE_FROM_MANUFACTURER is null ;
alter table APPLICATION_PRODUCT alter column PRICE_FROM_MANUFACTURER set not null ;
