alter table APPLICATION_PRODUCT add constraint FK_APPLICATION_PRODUCT_ON_MANUFACTURER foreign key (MANUFACTURER_ID) references APPLICATION_MANUFACTURER(ID);
create unique index IDX_APPLICATION_PRODUCT_UK_PRICE_FROM_MANUFACTURER on APPLICATION_PRODUCT (PRICE_FROM_MANUFACTURER) where DELETE_TS is null ;
create unique index IDX_APPLICATION_PRODUCT_UK_NAME on APPLICATION_PRODUCT (NAME) where DELETE_TS is null ;
create index IDX_APPLICATION_PRODUCT_ON_MANUFACTURER on APPLICATION_PRODUCT (MANUFACTURER_ID);
