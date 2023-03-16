alter table APPLICATION_PRICE_HISTORY rename column date to date__u49092 ;
alter table APPLICATION_PRICE_HISTORY alter column date__u49092 drop not null ;
alter table APPLICATION_PRICE_HISTORY add column DATE timestamp ^
update APPLICATION_PRICE_HISTORY set DATE = current_date where DATE is null ;
alter table APPLICATION_PRICE_HISTORY alter column DATE set not null ;
