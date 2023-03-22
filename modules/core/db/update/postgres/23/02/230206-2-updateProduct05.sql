-- update APPLICATION_PRODUCT set PRODUCER_ID = <default_value> where PRODUCER_ID is null ;
alter table APPLICATION_PRODUCT alter column PRODUCER_ID set not null ;
