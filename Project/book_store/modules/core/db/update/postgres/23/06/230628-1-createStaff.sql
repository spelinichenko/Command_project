create table BOOKSTORE_STAFF (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    ROLE_ID uuid,
    LOGIN varchar(255),
    PASSWORD varchar(255),
    --
    primary key (ID)
);