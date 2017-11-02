
-- organizer's institution table  --

create table orgins(
id number(6),
name varchar2(20) not null,
type varchar2(10),
constraints pk_orgis primary key(id)
)tablespace organizer;


-- organizer table --

create table organizer(
id number(6),
name varchar2(20) not null,
password varchar2(20) not null,
insid number(6) not null,
constraints pk_org primary key(id),
constraints fk_org foreign key(insid) references orgins
on delete cascade
)tablespace organizer;



-- organizer's contact table --

create table orgcont(
mob_number varchar2(15) not null,
email varchar2 (20) not null,
orgid number(6) not null,
constraints pk_orgcont primary key(mob_number),
constraints fk_orgcont foreign key(orgid) references organizer
on delete cascade
)tablespace organizer;
















