/* 5.2 Create table. */
create database company;

use company;

create table t_dept(
	deptno 	int,
    dname 	varchar(20),
    loc 	varchar(20)
);

describe t_dept;

use new_company;

describe t_dept;

show create table t_dept;

drop table t_dept;

/* 5.5 Modify table. */
/* 5.5.1 Modify table name. */
alter table t_dept rename test_dept;

desc test_dept;

/* 5.5.2 Add colnum. */
alter table test_dept add descri varchar(20);

desc test_dept;

alter table test_dept add brief varchar(10) first;

alter table test_dept add address varchar(20) after deptno;

alter table test_dept drop brief;

/* 5.5.4 Modify colnum. */
alter table test_dept modify deptno varchar(20);

alter table test_dept change loc location varchar(40);

/* Modify the colnum and attribute at the same time. */
alter table test_dept change location loc varchar(20);

desc test_dept;

alter table test_dept modify address varchar(20) after loc;

alter table test_dept modify dname varchar(20) first;

select * from test_dept;

create table t_dept(
	deptno int not null,
    dname varchar(20),
    loc varchar(40)
);

desc t_dept;

drop table t_dept;

create table t_dept(
	deptno 	int not null,
    dename 	varchar(20),
    loc 	varchar(40) default 'chengdu'
);

desc t_dept;

drop table t_dept;

create table t_dept(
	deptno 	int not null,
    dname	varchar(20) unique,
    loc		varchar(40)
);

desc t_dept;

drop database company;

create database company;

use company;

create table t_dept(
	deptno 	int primary key,
    dname 	varchar(20),
    loc 	varchar(40)
);

desc t_dept;

drop table t_dept;

create table t_dept(
	deptno	int,
    dname	varchar(20),
    loc		varchar(40),
    constraint pk_dname primary key(dname)
);

desc t_dept;

drop table t_dept;

create table t_dept(
	deptno 	int,
    dname	varchar(20),
    loc		varchar(40),
    constraint pk_deptno_dname primary key(deptno, dname)
);

desc t_dept;

drop table t_dept;

create table t_dept(
	deptno	int primary key auto_increment,
    dname	varchar(30),
    loc		varchar(40)
);

desc t_dept;

create table t_employee(
	empno		int primary key,
    ename		varchar(20),
    job			varchar(40),
    mgr			int,
    hiredate	date,
    sal			double(10, 2),
    common		double(10, 2),
    deptno		int,
    constraint fk_deptno foreign key (deptno) references t_dept (deptno)
);

desc t_employee;

desc t_dept;