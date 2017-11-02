--procedure for sponsor institution table--
create or replace procedure sponinsinsert(iname in varchar2, itype in varchar2)
is
sname sponins.name%type;
stype sponins.type%type;
flag number(6);
cursor s_cursor is select name,type from sponins;
begin
flag:=0;
OPEN s_cursor;
LOOP
FETCH s_cursor into sname, stype;
EXIT when s_cursor%NOTFOUND;
IF sname=iname and stype=itype then 
flag:=1;
end if;
end loop;
close s_cursor;
if flag=0 then  
insert into sponins (name,type) values (iname,itype);
end if;
end;
/






-- function for getting the organizer's institution id for organizer table--
create or replace function getsponinsid(iname in varchar2)
return number
is
iid number(6);
begin
select id into iid 
from sponins
where name=iname;
return iid;
end;
/

-- procedure for organizer insert-- 
create or replace procedure sponsorinsert(oname in varchar2, opassword in varchar2,iname in varchar2)
is
insid number(6);
begin
insid:=getsponinsid(iname);
insert into sponsor (name,password,insid) values (oname,opassword,insid);
end;
/








-- function for getting the organizer's id for organizer' contact table--
create or replace function getsponid(oname in varchar2,opassword in varchar2)
return number
is
iid number(6);
begin
select id into iid 
from sponsor
where name=oname and password=opassword;
return iid;
end;
/

-- procedure for organizer's contact insert-- 
create or replace procedure sponsorconinsert(mobile in varchar2, email in varchar2,oname in varchar2, opassword in varchar2)
is
orgid number(6);
begin
orgid:=getsponid(oname,opassword);
insert into sponcont (mob_number,email,sponid) values (mobile,email,orgid);
end;
/

