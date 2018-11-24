/* 2017-08-02 */
select concat('My', 'S', 'Q', 'L') concatstr;

select concat('My', 'S', 'QL', null) concatstr;

select concat(curdate(), 12.34) concatstr;

select concat_ws('-', '0712', '1234567') phonenum;

select concat_ws(null, '0712', '9654321') phonenum;

select concat_ws('-', '0712', null, '1234567') phonenum;

select strcmp('abc', 'abd'), strcmp('abc', 'abc'), strcmp('abc', 'abb');

select length('mysql');

select length('哈哈');

select char_length('mysql');

select char_length('哈哈');

select upper('mysql');

select ucase('mysql');

select lower('MYSQL');

select lcase('MYSQL');

select find_in_set('MySQL', 'oracle,sql server,MySQL') position;

select field('MySQL', 'oracle','sql server','MySQL') position;

select locate('sql', 'mysql') locate;

select position('sql' in 'mysql') position;

select instr('mysql', 'sql') instr;

select elt(2,'sql','mysql', 'oracle');

select bin(5) binfive, make_set(5, 'mysql', 'sql server', 'postgresql') after;

select 'mysql' string, left('mysql', 2) lefts, right('mysql', 3) rights;

select 'oraclemysql' string, substring('oraclemysql', 7, 5) substring;

select 'mysqldb2' string, mid('mysqldb2', 1, 5) sub;

select ltrim(' ha ha ha ha') ltrims;

select char_length('ha ha ha ha ') chars, char_length(rtrim('ha ha ha ha ')) rtrimlength;

select trim('    ha ha ha ha    ') trims;

select insert('myname', 3, 6, 'sql') after;

select replace('mysql', 'sql', 'sex') replaced;

select rand(), rand(), rand(3), rand(3);

select ceil(4.5), floor(5.6), ceil(33.1), floor(11.3);

select truncate(123.456789, 3) trunc;

select round(123.456789, -2);

select now() now, current_timestamp() timestamp, localtime() loctime, sysdate() sysdate;

select current_date() curr, curdate() cur;

select curtime() cur, current_time() curr;

select now() now, unix_timestamp() unixformat, from_unixtime(unix_timestamp()) common;

select unix_timestamp(now()) unixnow;

select now() now, utc_date() date, utc_time() time;

select now() now, year(now()) yearn, quarter(now()) quartern, month(now()) monthn, week(now()) weekn, dayofmonth(now()) dayofmn, hour(now()) hourn, minute(now()) minuten, second(now()) secondn;

select now() now, month(now()) month, monthname(now()) monthname;

select now() now, week(now()) week, weekofyear(now()) wofyear, dayname(now()) dname, dayofweek(now()) dofweek, weekday(now()) wday;

select now() now, dayofyear(now()) dayOfYear, dayofmonth(now()) dayOfMonth;

select now() now, extract(year from now()) year, extract(month from now()) month, extract(day from now()) day, extract(hour from now()) hour, extract(minute from now()) minute, extract(second from now()) second;

select now() now, to_days(now()) days, from_days(to_days(now())) date;

select now() now, datediff('2017-10-01', now()) days;

select now() now, adddate(now(), 5) afterFiveDays, subdate(now(), 5) fiveDaysAgo;

select curdate() nowdate, adddate(curdate(), interval '2,3' year_month) afterdate, subdate(curdate(), '2, 3', year_month) beforemonth; 

select curtime() currenttime, addtime(curtime(), 5) aftertime, subtime(curtime(), 5) beforetime;

select version() ver, database() db, user() usr;

create table auto_increment(
	id int(11) not null auto_increment unique
);

show tables;

insert into auto_increment values (null), (null), (null), (null);

select last_insert_id();

select * from auto_increment;







