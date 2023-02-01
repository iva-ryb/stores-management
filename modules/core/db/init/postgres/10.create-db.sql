-- begin APPLICATION_STORE_CHAIN
create table APPLICATION_STORE_CHAIN (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FULL_NAME varchar(255),
    --
    primary key (ID)
)^
-- end APPLICATION_STORE_CHAIN
-- begin APPLICATION_SHOP
create table APPLICATION_SHOP (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER varchar(255) not null,
    NAME varchar(255) not null,
    STORE_CHAIN_ID uuid not null,
    --
    primary key (ID)
)^
-- end APPLICATION_SHOP
-- begin APPLICATION_PRODUCT
create table APPLICATION_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    MANUFACTURER_ID uuid not null,
    PRICE_FROM_MANUFACTURER decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end APPLICATION_PRODUCT
-- begin APPLICATION_MANUFACTURER
create table APPLICATION_MANUFACTURER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FULL_NAME varchar(255),
    USER_ID uuid not null,
    --
    primary key (ID)
)^
-- end APPLICATION_MANUFACTURER
