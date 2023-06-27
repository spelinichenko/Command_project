alter table BOOKSTORE_STAFF add constraint FK_BOOKSTORE_STAFF_ON_ROLE foreign key (ROLE_ID) references BOOKSTORE_ROLE(ID);
<<<<<<< HEAD
=======
create unique index IDX_BOOKSTORE_STAFF_UK_LOGIN on BOOKSTORE_STAFF (LOGIN) where DELETE_TS is null ;
>>>>>>> 5cece3a83f98907bc2ac9ce547d91087a4cafa2e
create index IDX_BOOKSTORE_STAFF_ON_ROLE on BOOKSTORE_STAFF (ROLE_ID);
