/* 2017-07-21 unit07 view */
create database view;

use view;

CREATE TABLE t_product (
    id INT,
    name VARCHAR(20),
    price DOUBLE
);

insert into t_product values (1, 'apple', 5.59);

insert into t_product values (2, 'banana', 4.59);

insert into t_product values (3, 'orange', 3.89);

insert into t_product values (4, 'pear', 9.99);

SELECT 
    *
FROM
    t_product;

CREATE VIEW view_selectproduct AS
    SELECT 
        id, name
    FROM
        t_product;

SELECT 
    *
FROM
    view_selectproduct;


/* 2017-07-22 */
use view;

CREATE TABLE t_student (
    id INT,
    name VARCHAR(20),
    sex VARCHAR(1),
    groupid INT
);

insert into t_student values (10010001, 'Bob', 'M', 20010001);

insert into t_student values (10010002, 'Amy', 'W', 20010001);

insert into t_student values (10012003, 'Blake', 'W', 20010002);

insert into t_student values (10010004, 'Green', 'M', 20010002);

insert into t_student values (10010005, 'Alice', 'W', 20010002);

insert into t_student values (10010006, 'Swift', 'W', 20010002);

insert into t_student values (10010007, 'Kevin', 'M', 20010003);

insert into t_student values (10010008, 'Kate', 'W', 20010003);

insert into t_student values (10010009, 'Stive', 'M', 20010004);

SELECT 
    *
FROM
    t_student;

CREATE TABLE t_group (
    id INT,
    name VARCHAR(20)
);

insert into t_group values (20010001, 'group01');

insert into t_group values (20010002, 'group02');

insert into t_group values (20010003, 'group03');

insert into t_group values (20010004, 'group04');

insert into t_group values (20010005, 'group05');

SELECT 
    *
FROM
    t_group;

CREATE VIEW view_cons AS SELECT 3.1415926;

SELECT 
    *
FROM
    view_cons;

CREATE VIEW view_func AS
    SELECT 
        COUNT(name)
    FROM
        t_student;

SELECT 
    *
FROM
    view_func;

CREATE VIEW view_order AS
    SELECT 
        name
    FROM
        t_student
    ORDER BY id DESC;

SELECT 
    *
FROM
    view_order;

CREATE VIEW view_inner_link AS
    SELECT 
        s.name
    FROM
        t_student AS s,
        t_group AS g
    WHERE
        s.groupid = g.id AND g.id = 20010002;

SELECT 
    *
FROM
    view_inner_link;

CREATE VIEW view_outter_link AS
    SELECT 
        s.name
    FROM
        t_student AS s
            LEFT JOIN
        t_group AS g ON s.groupid = g.id
    WHERE
        g.id = 20010002;

SELECT 
    *
FROM
    view_outter_link;

CREATE VIEW view_sub_query AS
    SELECT 
        s.name
    FROM
        t_student AS s
    WHERE
        s.groupid IN (SELECT 
                id
            FROM
                t_group);

SELECT 
    *
FROM
    view_sub_query;

CREATE VIEW view_union AS
    SELECT 
        id, name
    FROM
        t_student 
    UNION ALL SELECT 
        id, name
    FROM
        t_group;

SELECT 
    *
FROM
    view_union;

show tables;

show table status;

show table status from view like 'view_union';

show create view view_func;

describe view_func;

use information_schema;

SELECT 
    *
FROM
    views
WHERE
    table_name = 'view_inner_link';

use view;

drop view v_selectproduct;

drop view view_inner_link, view_outter_link;

drop view view_selectproduct;

CREATE VIEW view_selectproduct AS
    SELECT 
        name
    FROM
        t_product;

SELECT 
    *
FROM
    view_selectproduct;

CREATE OR REPLACE VIEW view_selectproduct AS
    SELECT 
        id, name
    FROM
        t_product;

SELECT 
    *
FROM
    view_selectproduct;

alter view view_selectproduct as select name from t_product;

SELECT 
    *
FROM
    view_selectproduct;
    
CREATE VIEW view_product AS
    SELECT 
        *
    FROM
        t_product;

SELECT 
    *
FROM
    view_product;

insert into view_product values (5, 'strawberry',18.88);

SELECT 
    *
FROM
    t_product;
    
use view;

DELETE FROM view_product 
WHERE
    name = 'apple';
    
SELECT 
    *
FROM
    t_product;

UPDATE view_product 
SET 
    price = 17.99
WHERE
    name = 'strawberry';
    
SELECT 
    *
FROM
    t_product;