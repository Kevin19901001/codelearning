mysqldump -u root -p company t_dept> e:\t_dept_back.sql

mysqldump -u root -p --databases company> e:\database_company_back.sql

mysqldump -u root -p --all-databases> e:\all_databases_back.sql

mysql -u root -p < e:\all_databases_back.sql

use company;