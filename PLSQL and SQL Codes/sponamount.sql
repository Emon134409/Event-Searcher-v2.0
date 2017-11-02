create or replace procedure sponamount(fid in number, platinum out number,gold out number, silver out number)
is
gco  number;
gpla number;
gsil number;
begin
select count(festid) into gco 
from festspon where festid=fid and type='Gold';
select count(festid) into gpla 
from festspon where festid=fid and type='Platinum';
select count(festid) into gsil
from festspon where festid=fid and type='Silver';

if(gco=0)then gold:=0;
else
select amount into gold
from festspon where festid=fid and type='Gold';
end if;

if(gpla=0) then platinum:=0;
else 
 select amount into platinum
from festspon where festid=fid and type='Platinum'; 
end if;

if(gsil=0) then silver:=0;  
 else 
  select amount into silver
from festspon where festid=fid and type='Silver'; 
 end if;
end;
/


declare
gold number;
platinum number;
silver number;
begin
sponamount(3,platinum,gold,silver);
dbms_output.put_line(platinum);
end;
/


create or replace procedure updateSpon(fid in number,sid in number,typ1 in varchar2,typ2 in varchar2,typ3 in varchar2,samount in number)
is
begin
       update festspon set status='paid', sponid= sid where  festid=fid and  (type=typ1 or type =typ2 or type = typ3);
	   update sponsor set amount=amount+samount where id=sid;
	   commit;
end;


--,newnam in varchar2,typ in varchar2,ven in varchar2,dat in varchar2,da in number,shor in varchar2,lin in varchar2)

   --  ffdate date;
   
   --  ffdate :=to_date(dat,'dd-mon-yy');
  --   update fest set name=newnam,type=typ,venue=ven,exist=1,fdate=ffdate,duration=da,details=shor,link=lin where name=oldname;
	-- commit;
create OR REPLACE PROCEDURE UPDATEEVENT(oldname in varchar2,newnam in varchar2,typ in varchar2,ven in varchar2,dat in varchar2,da in number,shor in varchar2,lin in varchar2)
is
ffdate date;
begin
    ffdate := to_date(dat,'MM/DD/YYYY');
	update fest set name=newnam,type=typ,venue=ven,exist=1,fdate=ffdate,duration=da,details=shor,link=lin where name=oldname;
	commit;

end;
/
   -- 
	
--
create or replace procedure festinsert(fname in varchar2,fvenue in varchar2, fdate in varchar2,duration in varchar2,ftype in varchar2, fdetails in varchar2, flink in varchar2,orgname in varchar2,opass in varchar2)
 is 
 orgid number(6); 
 ffdate date; 
 fduration number(10);
 begin orgid:=getorgid(orgname,opass); 
 ffdate:=to_date(fdate,'MM/DD/YYYY'); 
 fduration:=to_number(duration);
 insert into fest (name,venue,fdate,duration,type,details,link,orgid,exist) values (fname,fvenue,ffdate,fduration,ftype,fdetails,flink,orgid,1); 
 end;
 /

create or replace procedure sponsorinsert(oname in varchar2, opassword in varchar2,iname in varchar2) 
is insid number(6); 
begin insid:=getsponinsid(iname); 
insert into sponsor (name,password,insid,amount) values (oname,opassword,insid,0); end;

create or replace PROCEDURE SAVEFS(FID IN NUMBER,TY IN VARCHAR2, AMOU IN NUMBER) 
IS COUNTER NUMBER(2);
BEGIN 
SELECT COUNT(*) INTO COUNTER 
FROM FESTSPON 
WHERE FESTID=FID AND TYPE = TY; 
IF COUNTER = 0 
THEN INSERT INTO FESTSPON(FESTID,TYPE,AMOUNT,STATUS) VALUES(FID,TY,AMOU,'UNPAID'); 
ELSE UPDATE FESTSPON SET AMOUNT=AMOU WHERE FESTID=FID AND TYPE =TY; 
END IF; 
COMMIT; 
END;

create or replace procedure getstatus(fid in number,typ in varchar2,sta out varchar2)
is 
begin
select status into sta from festspon
where festid=fid and type=typ;
end;
/

create or replace procedure checkdate(dat in varchar2,b out number)
is
fdate date;
a date;
begin
select sysdate into a from dual;
fdate:=to_date(dat,'MM/DD/YYYY');
b=a-fdate;
end;
/