// Create a database:
// CREATE DATABASE dbname;
create database test1;        // Create a database 'test1'.
show databases;               // Query all databaes in database system.
use test1;                    // Use databse 'test1'.
show tables;                  // Quesy all tables in database 'test1'.
use mysql;                    // Use database 'mysql'.
show tables;                  // There are many tables in 'mysql'.

// Delete a database:
// drop database dbname;
drop database test1;          // Delete database 'test1'.
show databases;               // There is no database named 'test1' because it has been deleted.

// Create table:
// create table tablename(
//   column_name_1 column_type_1 constraints,
//   column_name_2 column_type_2 constraints,
//   ...
//   column_name_n column_type_n constraints
// );
create table emp(
  ename         varchar(10),
  hiredate      date,
  sal           decimal(10,2),
  deptnp        int(2)
);
show tables;                  // show tables in database 'test1'. There is 'emp'.
desc emp;                     // Show the detail of table 'emp'.
show create table emp \G      // Show more information about table 'emp'.

// Delete a table from specified database:
// drop table tablename
drop table emp;		      // Delete table emp from 'test1'.

// Modify table:
// Change table type:
// alter table tablename modify [column] column_definition [first | after col_name]
alter table emp modify ename varchar(20);

// Add a new table field:
desc emp;
alter table emp add column age int(3);

// Delete a table field:
// alter table tablename drop [column] column_name
desc emp;
alter table emp drop column age;
