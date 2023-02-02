create table APPLICATION_PRICE_HISTORY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_OF_PRICE_CHANGE date not null,
    product_id uuid,
    shop_id uuid,
    --
    primary key (ID)
);