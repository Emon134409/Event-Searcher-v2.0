create or replace procedure orgprofile (name in varchar2, pass in varchar2, mobile out varchar2, email out varchar2,id out number)
is 
begin
id:=getorgid(name,pass);
select mob_number,email into mobile,email
from orgcont
where orgid=id;
end;
/