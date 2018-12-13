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
