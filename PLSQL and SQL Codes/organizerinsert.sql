--procedure for organizer institution table--
create or replace procedure orginsinsert(iname in varchar2, itype in varchar2)
is
oname orgins.name%type;
otype orgins.type%type;
flag number(6);
cursor o_cursor is select name,type from orgins;
begin
flag:=0;
OPEN o_cursor;
LOOP
FETCH o_cursor into oname, otype;
EXIT when o_cursor%NOTFOUND;
IF oname=iname and otype=itype then 
flag:=1;
end if;
end loop;
close o_cursor;
if flag=0 then  
insert into orgins (name,type) values (iname,itype);
end if;
end;
/







-- function for getting the organizer's institution id for organizer table--
create or replace function getorginsid(iname in varchar2)
return number
is
iid number(6);
begin
select id into iid 
from orgins
where name=iname;
return iid;
end;
/

-- procedure for organizer insert-- 
create or replace procedure organizerinsert(oname in varchar2, opassword in varchar2,iname in varchar2)
is
insid number(6);
begin
insid:=getorginsid(iname);
insert into organizer (name,password,insid) values (oname,opassword,insid);
end;
/








-- function for getting the organizer's id for organizer' contact table--
create or replace function getorgid(oname in varchar2,opassword in varchar2)
return number
is
iid number(6);
begin
select id into iid 
from organizer
where name=oname and password=opassword;
return iid;
end;
/

-- procedure for organizer's contact insert-- 
create or replace procedure organizerconinsert(mobile in varchar2, email in varchar2,oname in varchar2, opassword in varchar2)
is
orgid number(6);
begin
orgid:=getorgid(oname,opassword);
insert into orgcont (mob_number,email,orgid) values (mobile,email,orgid);
end;
/


