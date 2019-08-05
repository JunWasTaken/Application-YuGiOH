start database;
start db;

drop user User1 cascade;
create user User1 identified by User1 default tablespace users;

drop table Duellist;
create table Duellist (
    email varchar2(20) not null primary key,
    mdp varchar(20) not null,
    NameOf varchar2(45),
    Nickname varchar2(45),
    MainDeck varchar2(45)
    );

drop table ID_Log;
create table ID_log(
    email varchar2(20) primary key,
    mdp varchar2(20) not null);

insert into Duellist values(
    'randomMail@jsp.org',
    123,
    'Denos',
    'Junkie',
    'Stardust Dragon'
    );
    
insert into ID_Log values(
    'randomMail@jsp.org', 
    123
    );
    
insert into ID_Log values(
    'randomEmail@jsp.com',
    123
    );
    