
-- sponsor's institution table  --

create table sponins(
id number(6),
name varchar2(20) not null,
type varchar2(10),
constraints pk_sponis primary key(id)
)tablespace sponsor;


-- sponsor table --

create table sponsor(
id number(6),
name varchar2(20) not null,
password varchar2(20) not null,
insid number(6) not null,
constraints pk_spon primary key(id),
constraints fk_spon foreign key(insid) references sponins
on delete cascade
)tablespace sponsor;



-- sponsor's contact table --

create table sponcont(
mob_number varchar2(15) not null,
email varchar2 (20) not null,
sponid number(6) not null,
constraints pk_sponscont primary key(mob_number),
constraints fk_sponcont foreign key(sponid) references sponsor
on delete cascade
)tablespace sponsor;
















