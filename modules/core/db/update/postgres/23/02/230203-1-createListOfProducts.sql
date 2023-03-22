create table APPLICATION_LIST_OF_PRODUCTS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHOP_ID uuid,
    PRODUCT_ID uuid,
    PRICE decimal(19, 2) not null,
    COUNT integer,
    --
    primary key (ID)
);