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
    ROLE_ID uuid,
    LOGIN varchar(255),
    PASSWORD varchar(255),
    --
    primary key (ID)
)^
-- end BOOKSTORE_USER
<<<<<<< HEAD
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
=======
>>>>>>> 37218b1b1869121bd5226f71f53763cac5d71fb8
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
    COUNT integer,
    --
    primary key (ID)
)^
-- end BOOKSTORE_BASKET
<<<<<<< HEAD
-- begin BOOKSTORE_ROLE
create table BOOKSTORE_ROLE (
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
-- end BOOKSTORE_ROLE
=======
>>>>>>> 37218b1b1869121bd5226f71f53763cac5d71fb8
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
<<<<<<< HEAD
-- begin BOOKSTORE_BOOK
create table BOOKSTORE_BOOK (
=======
-- begin BOOKSTORE_ROLE
create table BOOKSTORE_ROLE (
>>>>>>> 37218b1b1869121bd5226f71f53763cac5d71fb8
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
<<<<<<< HEAD
    GENRE_ID uuid,
    AUTHOR_ID uuid,
    PUBLICATIONYEAR date,
    COUNT_ integer,
    --
    primary key (ID)
)^
-- end BOOKSTORE_BOOK
=======
    --
    primary key (ID)
)^
-- end BOOKSTORE_ROLE
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
>>>>>>> 37218b1b1869121bd5226f71f53763cac5d71fb8
