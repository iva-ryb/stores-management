create table APPLICATION_STORE_PRODUCT (
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
    PRODUCT_ID uuid not null,
    PRICE decimal(19, 2) not null,
    COUNT integer not null,
    --
    primary key (ID)
);