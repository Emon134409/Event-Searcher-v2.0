create table festspontype(
festid number(6),
type varchar2(6),
amount number(10),
status varchar2(10),
constraints fk_festspontype foreign key(festid) references fest 
);
