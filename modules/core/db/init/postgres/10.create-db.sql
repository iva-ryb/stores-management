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
    CITY varchar(255),
    STREET varchar(255),
    BUILDING varchar(255),
    --
    NUMBER varchar(255) not null,
    NAME varchar(255) not null,
    RETAILER_ID uuid not null,
    LOCATION VARCHAR(100),
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
    PRODUCER_ID uuid not null,
    PRICE_FROM_PRODUCER decimal(19, 2),
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
    PRICE decimal(19, 2) not null,
    DATE timestamp not null,
    PRODUCT_ID uuid not null,
    STORE_ID uuid not null,
    STORE_PRODUCT_ID uuid not null,
    --
    primary key (ID)
)^
-- end APPLICATION_PRICE_HISTORY
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
    STORE_ID uuid not null,
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
    STORE_ID uuid not null,
    PRODUCT_ID uuid not null,
    PRICE decimal(19, 2) not null,
    COUNT integer not null,
    --
    primary key (ID)
)^
-- end APPLICATION_STORE_PRODUCT
-- begin APPLICATION_PRODUCER
create table APPLICATION_PRODUCER (
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
    NAME varchar(255) not null,
    FULL_NAME varchar(255),
    USER_ID uuid,
    --
    primary key (ID)
)^
-- end APPLICATION_PRODUCER
-- begin APPLICATION_PURCHASE_PRODUCT
create table APPLICATION_PURCHASE_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID uuid not null,
    COUNT integer not null,
    PURCHASE_ID uuid,
    STORE_PRODUCT_ID uuid,
    --
    primary key (ID)
)^
-- end APPLICATION_PURCHASE_PRODUCT
