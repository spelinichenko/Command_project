-- begin BOOKSTORE_BASKET
create table BOOKSTORE_BASKET (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID uuid,
    BOOK_ID uuid,
    COUNT integer,
    --
    primary key (ID)
)^
-- end BOOKSTORE_BASKET
-- begin BOOKSTORE_AUTHOR
create table BOOKSTORE_AUTHOR (
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
    YEAR_OF_BIRTH timestamp,
    --
    primary key (ID)
)^
-- end BOOKSTORE_AUTHOR
-- begin BOOKSTORE_BOOK
create table BOOKSTORE_BOOK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    GENRE_ID uuid,
    AUTHOR_ID uuid,
    PUBLICATION_YEAR date,
    COUNT integer,
    --
    primary key (ID)
)^
-- end BOOKSTORE_BOOK
-- begin BOOKSTORE_GENRE
create table BOOKSTORE_GENRE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end BOOKSTORE_GENRE
-- begin BOOKSTORE_STAFF
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
)^
-- end BOOKSTORE_STAFF
-- begin SEC_USER
alter table SEC_USER add column BALANCE double precision ^
update SEC_USER set BALANCE = 0 where BALANCE is null ^
alter table SEC_USER alter column BALANCE set not null ^
alter table SEC_USER add column DAY_OF_BIRTH date ^
alter table SEC_USER add column DTYPE varchar(31) ^
update SEC_USER set DTYPE = 'bookstore_User' where DTYPE is null ^
-- end SEC_USER
