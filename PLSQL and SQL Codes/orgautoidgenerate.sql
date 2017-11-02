--function for autoid in organizer table--

create or replace procedure orgautoid (sid out number)
is
did number(6);
begin
select count(id) into sid
from organizer;
if(sid=0) then 
sid:=1;
else 
select max(id) into did
from organizer;
sid:=did+1;
end if; 
end;
/

--trigger for autoid in organizer table--

create or replace trigger orgautoidtrig 
before insert on organizer for each row
declare
id number(6);
begin
orgautoid(id);
:new.id:=id;
end;
/  

--function for autoid in orgins table--
create or replace procedure orginsautoid(sid out number) 
is
did number(6);
begin
select count(id)into sid
from orgins;
if(sid=0) then 
sid:=1;
else
select max(id) into did
from orgins;
sid:=did+1; 
end if;
end;
/

--trigger for autoid in orgins table--

create or replace trigger orginsautoidtrig 
before insert on orgins for each row
declare
id number(6);
begin
orginsautoid(id);
:new.id:=id;
end;
/  
