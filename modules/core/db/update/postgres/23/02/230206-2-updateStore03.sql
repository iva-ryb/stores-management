alter table APPLICATION_STORE rename column retailer_id to retailer_id__u16189 ;
alter table APPLICATION_STORE alter column retailer_id__u16189 drop not null ;
drop index IDX_APPLICATION_STORE_ON_RETAILER ;
-- alter table APPLICATION_STORE add column RETAILER_ID uuid ^
-- update APPLICATION_STORE set RETAILER_ID = <default_value> ;
-- alter table APPLICATION_STORE alter column retailer_id set not null ;
alter table APPLICATION_STORE add column RETAILER_ID uuid not null ;
