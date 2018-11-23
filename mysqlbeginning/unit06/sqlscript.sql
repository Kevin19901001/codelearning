drop table t_dept;

drop table t_employee;

drop table t_dept;

show tables;

create table t_dept(
	deptno	int,
    dname	varchar(20),
    loc		varchar(40),
    index index_deptno(deptno)
);

desc t_dept;

show create table t_dept;

explain select * from t_dept where deptno=1;

create index index_dname on t_dept (dname);

show create table t_dept;

alter table t_dept add index index_loc (loc);

show create table t_dept;

/* 2017-07-21 */
use company;

show tables;

drop table t_dept;

show tables;

create table t_dept(
	deptno	int,
    dname	varchar(20),
    loc		varchar(40),
    unique index index_deptno (deptno)
);

show tables;

show create table t_dept;

explain select * from t_dept where deptno=1;

drop table t_dept;

create table t_dept(
	deptno	int,
    dname	varchar(20),
    loc		varchar(40)
);

show tables;

create unique index index_deptno on t_dept (deptno);

show create table t_dept;

drop table t_dept;

create table t_dept(
	deptno	int,
    dname	varchar(20),
    loc	varchar(40)
);

alter table t_dept add unique index index_deptno (deptno);

show create table t_dept;

drop table t_dept;

create table t_dept(
	deptno	int,
    dname	varchar(20),
    loc		varchar(40),
    key index_dname_loc (dname, loc)
);

show create table t_dept;


explain select * from t_dept where dname='aaa';

drop table t_dept;

create table t_dept(
	deptno	int,
    dname	varchar(20),
    loc		varchar(40)
);

create index index_dname_loc on t_dept (dname, loc);

show create table t_dept;

explain select * from t_dept where dname='bbb';

drop table t_dept;

create table t_dept(
	deptno	int,
    dname	varchar(20),
    loc		varchar(40)
);

drop index index_deptno on t_dept;





















