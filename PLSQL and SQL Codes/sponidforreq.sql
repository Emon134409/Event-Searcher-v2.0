DECLARE
total_rows number(2);
BEGIN
UPDATE employee
SET salary = salary + 500;
IF sql%notfound THEN
dbms_output.put_line('no customers selected');
ELSIF sql%found THEN
total_rows := sql%rowcount;
dbms_output.put_line( total_rows || ' customers selected ');
END IF;
END;
/

select id,name,decode(salary,7166,'a',salary)salary from employee;