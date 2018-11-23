use company;

create table t_diary(
	diaryno		int primary key auto_increment,
    tablename	varchar(20),
    diarytime	datetime
);

desc t_dept;

desc t_diary;

select * from t_dept;

create trigger tri_diarytime before insert on t_dept for each row insert into t_diary values (null, 't_dept', now());

insert into t_dept values (10010001, 'financial', 'ShangHai');

select * from t_diary;

delimiter $$

create trigger tri_diarytime2 after insert on t_dept for each row begin 
	insert into t_diary values (null, 't_dept', now()); 
    insert into t_diary values (null, 't_dept', now());
end $$

delimiter ;

show triggers;

select * from t_dept;

insert into t_dept values (10010002, 'project', 'GuangZhou');

select * from t_diary;

use information_schema;

select * from triggers;

select * from triggers where trigger_name='tri_diarytime';

use company;

drop trigger tri_diarytime2;

show triggers;