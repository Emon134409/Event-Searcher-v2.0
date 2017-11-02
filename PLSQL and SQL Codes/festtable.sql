--fest table -- 
create table fest(
id number(6),
name varchar2(20) not null,
venue varchar2(20) not null,
fdate date,
duration number(5) not null,
type varchar2(20) not null,
details blob not null,
fimage blob,
orgid number(6) not null,
exist boolean,
constraints pk_fest primary key(id),
constraints fk_fest foreign key(orgid) references organizer
on delete cascade
) tablespace fest;

create table festspon(
id number(6),
festid number(6) not null,
sponsid number(6) not null,
constraints pk_festpon primary key(id),
constraints fk_festpon foreign key(festid) references fest,
constraints fk_festpon2 foreign key (sponsid) references sponsor
on delete cascade
) tablespace fest;