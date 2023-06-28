alter table BOOKSTORE_STAFF add constraint FK_BOOKSTORE_STAFF_ON_ROLE foreign key (ROLE_ID) references SEC_ROLE(ID);
create index IDX_BOOKSTORE_STAFF_ON_ROLE on BOOKSTORE_STAFF (ROLE_ID);
