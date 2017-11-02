--function for autoid in organizer table--

create or replace procedure sponautoid (sid out number)
is
did number(6);
begin
select count(id) into sid
from sponsor;
if(sid=0) then 
sid:=1;
else 
select max(id) into did
from sponsor;
sid:=did+1;
end if; 
end;
/

--trigger for autoid in organizer table--

create or replace trigger sponautoidtrig 
before insert on sponsor for each row
declare
id number(6);
begin
sponautoid(id);
:new.id:=id;
end;
/  

--function for autoid in orgins table--
create or replace procedure sponinsautoid(sid out number) 
is
did number(6);
begin
select count(id)into sid
from sponins;
if(sid=0) then 
sid:=1;
else
select max(id) into did
from sponins;
sid:=did+1; 
end if;
end;
/

--trigger for autoid in orgins table--

create or replace trigger sponinsautoidtrig 
before insert on sponins for each row
declare
id number(6);
begin
sponinsautoid(id);
:new.id:=id;
end;
/  
