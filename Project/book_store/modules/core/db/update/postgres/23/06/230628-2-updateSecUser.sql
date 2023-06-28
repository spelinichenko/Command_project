alter table SEC_USER add column DAY_OF_BIRTH date ;
alter table SEC_USER add column BALANCE double precision ^
update SEC_USER set BALANCE = 0 where BALANCE is null ;
alter table SEC_USER alter column BALANCE set not null ;
alter table SEC_USER add column DTYPE varchar(31) ;
