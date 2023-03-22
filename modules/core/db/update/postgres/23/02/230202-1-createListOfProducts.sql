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
    shop_id uuid,
    product_id uuid,
    PRICE decimal(19, 2) not null,
    Column integer,
    --
    primary key (ID)
);