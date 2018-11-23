show engines;

show variables like 'have%';

show variables like 'storage_engine%';

create database mysqltest;

use mysqltest;

create table inttest(id int);

show tables;

insert into inttest values (-12345678901);

select * from inttest;

desc inttest;

create table d_test(
	f_date date,
    f_datetime datetime,
    f_timestamp timestamp,
    f_time time,
    f_year year
);

desc d_test;

insert into d_test values (curdate(), now(), now(), time(now()), year(now()));

select * from d_test;

create table user(
	id int,
    name varchar(20)
);

desc user;

insert into user values (1, 'bob'), (2, 'petter'), (3, 'a1234567891');

select * from user;