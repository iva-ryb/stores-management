alter table APPLICATION_PRODUCT add constraint FK_APPLICATION_PRODUCT_ON_PRICEHISTORY foreign key (PRICEHISTORY_ID) references APPLICATION_PRICE_HISTORY(ID);
create index IDX_APPLICATION_PRODUCT_ON_PRICEHISTORY on APPLICATION_PRODUCT (PRICEHISTORY_ID);
