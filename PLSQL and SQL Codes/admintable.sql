-- admin table --

create table admin
(
id number(6),
name varchar2(20) not null,
password varchar2(20) not null,
constraints pk_admin primary key(id)
)tablespace sys;
