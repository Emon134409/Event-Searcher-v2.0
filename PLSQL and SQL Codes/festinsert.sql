create or replace procedure festinsert(fname in varchar2,fvenue in varchar2, fdate in varchar2,duration in varchar2,ftype in varchar2, fdetails in varchar2, flink in varchar2,orgname in varchar2,opass in varchar2)
is 
orgid number(6);
ffdate date;
fduration number(10);
begin
orgid:=getorgid(orgname,opass);
ffdate:=to_date(fdate,'MM/DD/YYYY');
fduration:=to_number(duration);
insert into fest (name,venue,fdate,duration,type,details,link,orgid) values (fname,fvenue,ffdate,fduration,ftype,fdetails,flink,orgid);
end;
/

execute festinsert('f','f',to_date('11/11/2001','MM/DD/YYYY'),2,'ff','f','a','a');