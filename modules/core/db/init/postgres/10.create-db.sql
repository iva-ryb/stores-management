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
-- begin APPLICATION_STORE
create table APPLICATION_STORE (
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
    ADDRESS_ID uuid not null,
    --
    primary key (ID)
)^
-- end APPLICATION_STORE
-- begin APPLICATION_RETAILER
create table APPLICATION_RETAILER (
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
    ADDRESS_ID uuid not null,
    --
    primary key (ID)
)^
-- end APPLICATION_RETAILER
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
    RETAILER_ID uuid,
    PRICE_FROM_RETAILER decimal(19, 2),
    --
    primary key (ID)
)^
-- end APPLICATION_PRODUCT
-- begin APPLICATION_PRICE_HISTORY
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
    PRODUCT_ID uuid,
    SHOP_ID uuid,
    --
    primary key (ID)
)^
-- end APPLICATION_PRICE_HISTORY
-- begin APPLICATION_ADDRESS
create table APPLICATION_ADDRESS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CITY varchar(255),
    STREET varchar(255),
    BUILDING varchar(255),
    --
    primary key (ID)
)^
-- end APPLICATION_ADDRESS
-- begin APPLICATION_PURCHASE
create table APPLICATION_PURCHASE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHOP_ID uuid not null,
    --
    primary key (ID)
)^
-- end APPLICATION_PURCHASE
-- begin APPLICATION_STORE_PRODUCT
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
    STORE_ID uuid,
    PRODUCT_ID uuid not null,
    PRICE decimal(19, 2) not null,
    COUNT integer not null,
    --
    primary key (ID)
)^
-- end APPLICATION_STORE_PRODUCT
