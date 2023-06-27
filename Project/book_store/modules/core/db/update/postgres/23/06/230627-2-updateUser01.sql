<<<<<<< HEAD
alter table BOOKSTORE_USER add constraint FK_BOOKSTORE_USER_ON_ROLE foreign key (ROLE_ID) references BOOKSTORE_ROLE(ID);
create index IDX_BOOKSTORE_USER_ON_ROLE on BOOKSTORE_USER (ROLE_ID);
=======
create unique index IDX_BOOKSTORE_USER_UK_LOGIN on BOOKSTORE_USER (LOGIN) where DELETE_TS is null ;
>>>>>>> 5cece3a83f98907bc2ac9ce547d91087a4cafa2e
