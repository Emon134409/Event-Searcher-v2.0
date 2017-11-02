create or replace procedure reqinsert(fid in number,sponid in number)
is 
begin
insert into festsponreq values(fid,sponid);
end;
/