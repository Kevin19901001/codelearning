/*  2017-08-03 */
use company;

show variables like 'tx_isolation';

create table test_1(
    id		int,
    username	varchar(20)
)
engine=innodb;

desc test_1;

insert into test_1 values (1, 'petter'), (2, 'bob'), (3, 'allen'), (4, 'aron');

select * from test_1;

begin;

update test_1 set username='test' where id=1;

commit;

select * from test_1;

begin;

update test_1 set username='petter' where id=1;

select * from test_1;

rollback;

select * from test_1;

commit;
