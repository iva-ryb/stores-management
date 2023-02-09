alter table APPLICATION_STORE rename column address_id to address_id__u58068 ;
alter table APPLICATION_STORE alter column address_id__u58068 drop not null ;
drop index IDX_APPLICATION_STORE_ON_ADDRESS ;
alter table APPLICATION_STORE add column BUILDING varchar(255) ;
alter table APPLICATION_STORE add column STREET varchar(255) ;
alter table APPLICATION_STORE add column CITY varchar(255) ;
