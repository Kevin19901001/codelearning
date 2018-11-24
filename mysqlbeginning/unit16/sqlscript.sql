use mysql;

show tables;

desc user;

show variables like 'have_openssal';

desc db;

desc host;

desc tables_priv;

desc columns_priv;

desc procs_priv;

create user 'Kevin'@'localhost' identified by 'Fhq19901001';

insert into user (host, user, password, ssl_cipher, x509_issuer, x509_subject) values ('localhost', 'Alice', 'A123456', '', '', '');

flush privileges;

set password=password('Fhq19901001');

update user set password=password('hq19901001') where user='root' and host='localhost';

drop user 'Kevin'@'localhost';

select user from user;

set password for 'Kevin'@'localhost'=password('654321');

delete from user where user='Alice' and host='localhost';