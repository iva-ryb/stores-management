alter table APPLICATION_PRICE_HISTORY rename column date_of_price_change to date_of_price_change__u11062 ;
alter table APPLICATION_PRICE_HISTORY alter column date_of_price_change__u11062 drop not null ;
alter table APPLICATION_PRICE_HISTORY add column PRICE decimal(19, 2) ^
update APPLICATION_PRICE_HISTORY set PRICE = 0 where PRICE is null ;
alter table APPLICATION_PRICE_HISTORY alter column PRICE set not null ;
alter table APPLICATION_PRICE_HISTORY add column DATE date ^
update APPLICATION_PRICE_HISTORY set DATE = current_date where DATE is null ;
alter table APPLICATION_PRICE_HISTORY alter column DATE set not null ;
-- update APPLICATION_PRICE_HISTORY set PRODUCT_ID = <default_value> where PRODUCT_ID is null ;
alter table APPLICATION_PRICE_HISTORY alter column PRODUCT_ID set not null ;
-- update APPLICATION_PRICE_HISTORY set STORE_ID = <default_value> where STORE_ID is null ;
alter table APPLICATION_PRICE_HISTORY alter column STORE_ID set not null ;
