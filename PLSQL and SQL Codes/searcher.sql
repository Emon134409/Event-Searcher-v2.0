-- searcher table-- 
create table searcher(
id number(6),
name varchar2(20) not null,
password varchar2(10) not null,
address varchar2(20),
constraints pk_searcher primary key(id)
)tablespace sys;

-- searcher's contact-- 
create table searchcont(
id number(6),
smobnum varchar2(15),
semail varchar2(20),
serid number(6),
constraints pk_sercont primary key(id),
constraints fk_sercont foreign key(serid) references searcher
on delete cascade
)tablespace sys;