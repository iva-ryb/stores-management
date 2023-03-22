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
    HOUSE varchar(255),
    --
    primary key (ID)
);