-- update APPLICATION_PRICE_HISTORY set STORE_PRODUCT_ID = <default_value> where STORE_PRODUCT_ID is null ;
alter table APPLICATION_PRICE_HISTORY alter column STORE_PRODUCT_ID set not null ;
