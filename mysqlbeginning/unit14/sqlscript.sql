/* 2017-08-04 */
use company;

delimiter $$
create procedure proce_employee_sal ()
comment 'select salary of all employees'
begin
    select sal from t_employee;
end$$

delimiter;

select * from t_employee;

delimiter $$
create function func_employee_sal (empno int(11))
returns double(10, 2)
comment 'select salary of one employee'
begin
	return (select sal from t_employee where t_employee.empno=empno);
end$$

select * from t_employee;

declare employee_sal int default 1000;


set employee_sal = 3500;

select sal into employee_sal from t_employee where empno=7566;

select employee_sal;

declare cursor_employee cursor for select sal from t_employee;

open cursor_employee;

fetch cursor_employee into employee_sal;

close cursor_employee;

drop procedure if exists employee_count;

delimiter $
create procedure employee_count (out num integer)
begin
    declare employee_sal integer;
    declare flag integer;
    declare cursor_employee cursor for select sal from t_employee;
    declare continue handler for not found set flag = 1;
    set flag = 0;
    set num = 0;
    open cursor_employee;
    fetch cursor_employee into employee_sal;
    while flag<>1 do
		if employee_sal > 999 then
			set num = num + 1;
		end if;
        fetch cursor_employee into employee_sal;
	end while;
    close cursor_employee;
end
$





/* 2017-08-05 */
use company;
