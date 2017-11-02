create or replace procedure orgupdate(oname in varchar2,mob in varchar2,mail in varchar2,oid in number)
is 
begin 
update organizer set name=oname
where id=oid;
update orgcont set mob_number=mob,email=mail
where orgid=oid;
end;
/

create or replace procedure orgupdate2(oname in varchar2,mob in varchar2,mob2 in varchar2,mail in varchar2,oid in number)
is 
begin 
update organizer set name=oname
where id=oid;
update orgcont set mob_number=mob,email=mail
where orgid=oid;
insert into orgcont values (mob2,mail,oid);
end;
/