--function for autoid in fest table--
create or replace procedure eventautoid (sid out number)
is
did number(6);
begin
select count(id) into sid
from fest;
if(sid=0) then 
sid:=1;
else 
select max(id) into did
from fest;
sid:=did+1;
end if; 
end;
/

--trigger for autoid in fest table--

create or replace trigger eventautoidtrig 
before insert on fest for each row
declare
id number(6);
begin
eventautoid(id);
:new.id:=id;
end;
/ 