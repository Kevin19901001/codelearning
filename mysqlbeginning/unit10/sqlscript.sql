create table t_employee(
    empno		int,
    ename		varchar(20),
    job			varchar(40),
    MGR			int,
    Hiredate	        date,
    sal			double(10, 2),
    comm		double(10, 2),
    deptno		int
);

desc t_employee;

insert into t_employee (empno, ename, job, MGR, Hiredate, sal, comm, deptno) values 
(7369, 'SMITH', 'CLERK', 7902, '1981-03-12', 800.00, NULL, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1982-03-12', 1600.00, 300.00, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1983-03-12', 1250.00, 500.00, 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-03-12', 2975.00, NULL, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-03-12', 1250.00, 1400.00, 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-03-12', 2850.00, NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1985-03-12', 2450.00, NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1981-03-12', 3000.00, NULL, 20),
(7839, 'KING', 'PRESIDENT', NULL, '1981-03-12', 5000.00, NULL, 10),
(7844, 'TURNER', 'SALESMAN', 7698, '1989-03-12', 1500.00, 0.00, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1998-03-12', 1100.00, NULL, 20),
(7900, 'JAMES', 'CLERK', 7698, '1997-03-12', 950.00, NULL, 30),
(7902, 'FORD', 'ANALYST', 7566, '0000-00-00', 3000.00, NULL, 20),
(7934, 'MILLER', 'CLERK', 7782, '1981-03-12',1300.00, NULL, 10);

use company;

select * from t_employee;

delete from t_employee;

select * from t_employee;

select empno, ename, job, Hiredate, sal, deptno from t_employee;

desc t_employee;

select empno from t_employee;

select empno, ename, sal from t_employee;

select empno, sal, ename from t_employee;

select ename, job from t_employee;

select distinct job from t_employee;

select ename, sal*12 from t_employee;

select ename, sal*12 yearsalary from t_employee;

select concat (ename, ' employee year salary is: $', sal*12) yearsalary from t_employee;

select ename, job from t_employee where job='clerk';

select ename, job, sal from t_employee where job='clerk' && sal>800.00;

select ename, job, sal from t_employee where job='clerk' and sal>800.00;

select ename, job, sal from t_employee where sal between 1000 and 2000;

select ename, job from t_employee where comm is null;

select ename, job, hiredate from t_employee where comm is not null;

select empno, ename, job, hiredate from t_employee where deptno not in (7521, 7782, 7566, 7788);

/* 2017-07-27 */
use company;

select empno, ename, job from t_employee where empno in (7521, 7782, 7566, 7788, null);

select empno, ename, job from t_employee where empno not in (7521, 7782, 7566, 7788, null);

select ename, job from t_employee where ename like 'A%';

select ename, job from t_employee where ename like 'a%';

select ename, job from t_employee where ename not like 'a%';

select ename, job from t_employee where ename like '_A%';

select ename, job from t_employee where ename not like '_A%';

select ename, job from t_employee where ename not like '%A%';

select ename, sal from t_employee where sal like '%5%';

select ename, job, sal, hiredate from t_employee order by sal asc;

select * from t_employee order by mgr asc;

select * from t_employee order by hiredate asc, sal desc;

select * from t_employee where comm is null limit 3;

select * from t_employee where comm is null limit 12;

select * from t_employee where comm is null order by hiredate asc limit 5;

select * from t_employee where comm is null order by hiredate asc limit 5, 5;

select count(*) number from t_employee;

select count(comm) number from t_employee;

select count(comm) number from t_employee where comm!=0;

select avg(comm) average from t_employee;

select avg(comm) average from t_employee where not comm=0;

select sum(sal) sumsalary from t_employee;

select sum(comm) sumcommon from t_employee;

select max(sal) maxsalary, min(sal) minsalary from t_employee;

select max(comm) maxval, min(comm) minval from t_employee where comm!=0;

select count(deptno) number from t_dept;

select avg(deptno) avgnum, sum(deptno) sumnum, max(deptno) maxnum, min(deptno) minnum from t_dept;

/* 2017-07-28 */
use company;

select * from t_employee group by deptno;

select deptno, group_concat(ename) enames from t_employee group by deptno;

select deptno, group_concat(ename) enames, count(ename) number from t_employee group by deptno;

select deptno, hiredate from t_employee group by deptno, hiredate;

select deptno, group_concat(ename) enames, count(ename) number from t_employee group by deptno, hiredate;

select deptno, avg(sal), group_concat(ename) enames, count(ename) number from t_employee group by deptno having avg(sal) > 2000;
