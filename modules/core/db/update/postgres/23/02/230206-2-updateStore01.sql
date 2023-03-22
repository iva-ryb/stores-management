alter table APPLICATION_STORE rename column store_chain_id to store_chain_id__u80964 ;
alter table APPLICATION_STORE alter column store_chain_id__u80964 drop not null ;
alter table APPLICATION_STORE drop constraint FK_APPLICATION_STORE_ON_STORE_CHAIN ;
drop index IDX_APPLICATION_STORE_ON_STORE_CHAIN ;
-- alter table APPLICATION_STORE add column RETAILER_ID uuid ^
-- update APPLICATION_STORE set RETAILER_ID = <default_value> ;
-- alter table APPLICATION_STORE alter column RETAILER_ID set not null ;
alter table APPLICATION_STORE add column RETAILER_ID uuid not null ;
