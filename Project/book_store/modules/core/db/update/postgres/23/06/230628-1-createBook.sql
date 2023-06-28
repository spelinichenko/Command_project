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
    PUBLICATIONYEAR date,
    COUNT_ integer,
    --
    primary key (ID)
);