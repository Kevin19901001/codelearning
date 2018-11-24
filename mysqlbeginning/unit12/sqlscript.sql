/* 2017-08-01 */
select 6 + 4 addition, 6 - 4 subtraction, 6 * 4 multiplication, 6 / 4 division, 6 div 4 division, 6 % 4 complementation, 6 mod 4 complementation;

use company;

select ename employee, sal monthly_salary, sal * 12 yearly_salary from t_employee;

select 6 / 0 division, 6 div 0 division, 6 % 0 complementation, 6 mod 0 complementation;

select 1 = 1 math_compare, 'kevin' = 'kevin' string_compare, 1 + 2 = 3 + 3 expression_compare, 1 <=> 1 math_compare, 'kevin' <=> 'kevin' string_compare, 1 + 2 <=> 3 + 3 expression_compare;

select null = null '=effection', null <=> null '<=>effection';

select 1<>1 math_compare, 'kevin' <> 'kevin' string_compare, 1 + 2 <> 3 + 3 expression_compare, 1 != 1 math_compare, 'kevin' != 'kevin' string_compare, 1 + 2 != 3 + 3 expression_compare;

select 'kevin' <= 'kevin';

select 'kevin' regexp 'k' match1, 'kevin' regexp 'kev' match2;

select 5&6, bin(5&6) binary1, 4&5&6, bin(4&5&6) binary2;