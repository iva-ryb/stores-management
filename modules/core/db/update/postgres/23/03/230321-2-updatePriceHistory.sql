alter table APPLICATION_PRICE_HISTORY rename column date to date__u71534 ;
alter table APPLICATION_PRICE_HISTORY alter column date__u71534 drop not null ;
alter table APPLICATION_PRICE_HISTORY rename column store_product_id to store_product_id__u71234 ;
alter table APPLICATION_PRICE_HISTORY alter column store_product_id__u71234 drop not null ;
alter table APPLICATION_PRICE_HISTORY drop constraint FK_APPLICATION_PRICE_HISTORY_ON_STORE_PRODUCT ;
drop index IDX_APPLICATION_PRICE_HISTORY_ON_STORE_PRODUCT ;
alter table APPLICATION_PRICE_HISTORY add column DATE date ^
update APPLICATION_PRICE_HISTORY set DATE = current_date where DATE is null ;
alter table APPLICATION_PRICE_HISTORY alter column DATE set not null ;
