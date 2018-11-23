/* 2017-07-24 unit09 */
use company;

select * from t_dept;

insert into t_dept (deptno, dname, loc) values (10010003, 'hr', 'ChangSha');

select * from t_dept;

/* 2017-07-25 */
use company;

select * from t_dept;

insert into t_dept values(10010004, 'security', 'BeiJing');

select * from t_dept;

insert into t_dept (deptno, dname) values (10010005, 'logistics');

select * from t_dept;

desc t_dept;

insert into t_dept (deptno, dname, loc) values (10010006, 'market', 'ShenZhen'),
												(10010007, 'quality', 'BeiJing'),
                                                (10010008, 'design', 'BeiJing'),
                                                (10010009, 'research', 'SheZhen');
                                                
select * from t_dept;

insert into t_dept (deptno, loc) values (10010010, 'WuHan'), (10010011, 'HangZhou'), (10010012, 'NanJing');

select * from t_dept;

create table t_leader(
	id		int,
    name	varchar(20),
    dname	varchar(20),
    loc		varchar(40)
);

desc t_leader;

insert into t_leader values 
(20010001, 'Bob', 'Security', 'BeiJing'), 
(20010002, 'Green', 'market', 'ShenZhen'), 
(20010003, 'Steve', 'hr', 'ChangSha'), 
(20010004, 'Alice', 'quality', 'BeiJing');

select * from t_leader;

insert into t_dept (dname, loc) select dname, loc from t_leader;

select * from t_dept;

update t_dept set loc='GuangZhou' where loc=null;

select * from t_dept;

update t_dept set loc='GuangZhou' where deptno=10010005;

select * from t_dept;

update t_dept set dname='research', loc='NanJing' where deptno=10010010;

select * from t_dept;

update t_dept set loc='ChongQing' where deptno is null;

select * from t_dept;

update t_dept set loc='ShenZhen' where loc='SheZhen';

select * from t_dept;

delete from t_dept where dname='logistics';

select * from t_dept;

delete from t_dept where dname is null;

select * from t_dept;

delete from t_dept where deptno is null;

select * from t_dept;

delete from t_dept;

select * from t_dept;