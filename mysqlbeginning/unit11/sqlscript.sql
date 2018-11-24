/* unit11 */
use company;

show databases;

show tables;

select * from t_dept;

insert into t_dept values (10, 'ACCOUNTING', 'NEW YORK'), (20, 'RESEARCH', 'DALLAS'), (30, 'SALES', 'CHICAGO'), (40, 'OPERATIONS', 'BOSTON');

select * from t_dept;

/* 2017-07-29 */
use company;

select e.ename employeename, e.job from t_employee e;

select e.ename employeename, e.job, l.ename leadername from t_employee e inner join t_employee l on e.mgr = l.empno;

select e.ename employeename, e.job, l.ename laedername from t_employee e, t_employee l where e.mgr = l.empno;

select e.empno, e.ename, e.job from t_employee e;

select e.empno, e.ename, e.job, d.dname, d.loc from t_employee e inner join t_dept d on e.deptno = d.deptno;

select * from t_employee e inner join t_dept d on e.deptno = d.deptno;

select e.empno, e.ename, e.sal, e.job, l.ename leadername, d.dname, d.loc from t_employee e inner join t_employee l on e.mgr = l.empno inner join t_dept d on e.deptno = d.deptno;

select e.ename employeename, e.job, l.ename leadername from t_employee e inner join t_employee l on e.mgr = l.empno and e.empno > l.empno;

select e.ename employeename, e.job, l.ename leadername from t_employee e left outer join t_employee l on e.mgr = l.empno;

insert into t_employee values (7999, 'MIKE', 'CLERK', 7782, '1981-03-12', 5200.00, NULL, 50);

select e.empno, e.ename employeename, e.job, d.dname, d.loc from t_dept d inner join t_employee e on e.deptno = d.deptno;


/* 2017-07-31 */
use company;

create table t_cstudent(
	name		varchar(20),
    sex			varchar(1)
);

desc t_cstudent;

create table t_mstudent(
	name		varchar(20),
    sex			varchar(1)
);

desc t_mstudent;

insert t_cstudent values ('KEVIN', 'M'),
						 ('SMITH', 'M'),
                         ('JENNY', 'W'),
                         ('JORDAN', 'W'),
                         ('BOB', 'M');
                         
select * from t_cstudent;

insert into t_mstudent values ('KITTY', 'W'),
							  ('ALICE', 'W'),
                              ('JOE', 'M'),
                              ('PETER', 'M'),
                              ('CLARK', 'W');
                              
select * from t_mstudent;

insert t_mstudent values ('SMITH', 'M'),
                         ('JENNY', 'W'),
                         ('JORDAN', 'W'),
                         ('BOB', 'M');
                         
select * from t_mstudent;

select * from t_cstudent union select * from t_mstudent;

select * from t_cstudent union all select * from t_mstudent;

select count(*) from t_dept, t_employee;

select count(*) from t_dept;

select count(*) from t_employee;

/* single row, single col */
select * from t_employee where sal > (select sal from t_employee where ename = 'SMITH');

select * from t_employee where sal = (select sal from t_employee where ename = 'smith') && job = (select job from t_employee where ename ='smith');

/* single row, multiple cols */
select * from t_employee where (sal, job) = (select sal, job from t_employee where ename = 'smith');

/* multiple rows single col */
select * from t_employee where deptno in (select deptno from t_dept);

select ename, sal from t_employee where sal >= any(select sal from t_employee where job = 'manager');

select ename, sal from t_employee where sal >= all(select sal from t_employee where job = 'manager');

select deptno, dname from t_dept d where exists (select * from t_employee e where e.deptno = d.deptno);

select d.deptno, d.dname, d.loc, number, average from t_dept d inner join (select deptno, count(empno) number, avg(sal) average from t_employee group by deptno desc) employee on d.deptno = employee.deptno;

/* 2017-08-01 */
use company;

