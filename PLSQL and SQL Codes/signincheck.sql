create or replace procedure orgsignin (oname in varchar2, opassword in varchar2, result out number)
is
c_name organizer.name%type;
c_pass organizer.password%type;
flag number(6);
inc number(6);
CURSOR c_organizer is
SELECT name, password FROM organizer
where name=oname and password=opassword;
BEGIN
select count (id) into flag
from organizer;
inc:=0;
OPEN c_organizer;
LOOP
FETCH c_organizer into c_name, c_pass;
EXIT WHEN c_organizer%found;
inc:=inc+1;
END LOOP;
CLOSE c_organizer;
if (inc=flag)then
result:=0;
else result:=1;
END IF;
END;
/