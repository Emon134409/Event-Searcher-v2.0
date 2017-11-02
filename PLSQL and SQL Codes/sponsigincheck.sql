create or replace procedure sponsignin (oname in varchar2, opassword in varchar2, result out number)
is
c_name sponsor.name%type;
c_pass sponsor.password%type;
flag number(6);
inc number(6);
CURSOR c_sponsor is
SELECT name, password FROM sponsor
where name=oname and password=opassword;
BEGIN
select count (id) into flag
from sponsor;
inc:=0;
OPEN c_sponsor;
LOOP
FETCH c_sponsor into c_name, c_pass;
EXIT WHEN c_sponsor%found;
inc:=inc+1;
END LOOP;
CLOSE c_sponsor;
if (inc=flag)then
result:=0;
else result:=1;
END IF;
END;
/