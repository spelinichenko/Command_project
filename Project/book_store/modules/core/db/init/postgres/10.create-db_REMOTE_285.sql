-- begin BOOKSTORE_USER
create table BOOKSTORE_USER (
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
    BALANCE double precision,
    DAY_OF_BIRTH date,
    LOGIN varchar(255),
    PASSWORD varchar(255),
    --
    primary key (ID)
)^
-- end BOOKSTORE_USER
