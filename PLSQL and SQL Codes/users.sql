create user admin identified by admin;
create user organizer identified by org;
create user users identified by users;
create user sponsor identified by spon; 


grant all privileges to admin identified by admin ;  


grant connect to organizer;
grant insert,select on admin.organizer to organizer;
grant insert(name) on admin.fest to organizer;
grant insert(venue) on admin.fest to organizer;
grant insert(fdate) on admin.fest to organizer;
grant insert(duration) on admin.fest to organizer;
grant insert(type) on admin.fest to organizer;
grant insert(details) on admin.fest to organizer;
grant insert(fimage) on admin.fest to organizer;
grant insert(orgid) on admin.fest to organizer;


grant all on admin.sponsor to sponsor;
