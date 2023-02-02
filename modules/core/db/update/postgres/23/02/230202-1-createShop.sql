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
);