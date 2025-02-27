create database sql_concepts;
use sql_concepts;

show databases;
show tables ;
create table dept_tab(
deptno VARCHAR(5),
dname VARCHAR(50),
mgr_id VARCHAR(10),
location_id VARCHAR(10),
CONSTRAINT pk_dept_tab PRIMARY KEY(deptno)
);

create table emp_tab(
empno VARCHAR(5),
name VARCHAR(50) NOT NULL,
job VARCHAR(10),
manager VARCHAR(10),
hiredate DATE,
salary VARCHAR(20),
commission VARCHAR(10),
deptno VARCHAR(5),
CONSTRAINT pk_dept_tab PRIMARY KEY(empno),
CONSTRAINT fk_dept_tab FOREIGN KEY(deptno) REFERENCES dept_tab(deptno)
);

create table country_tab(
country_id VARCHAR(5),
country_name VARCHAR(50),
CONSTRAINT pk_country_tab PRIMARY KEY(country_id)
);

create table states_tab(
state_id VARCHAR(10),
state_name VARCHAR(50),
country_id VARCHAR(5),
CONSTRAINT pk_country_tab PRIMARY KEY(state_id),
CONSTRAINT fk_country_tab FOREIGN KEY(country_id) REFERENCES country_tab(country_id)
);

drop table states_tab;

show tables;
describe states_tab;

INSERT INTO dept_tab(deptno, dname, mgr_id, location_id)
VALUES
(30, 'Purchasing Tax', 114, 1700),
(40, 'Human Resources', 203, 2400),
(70, 'Public Relations', 204, 2700),
(120, 'Treasury', NULL, 1700),
(130, 'Corporate Tax', null, 1700);

select * from dept_tab;
select count(*) from dept_tab;

insert into emp_tab values(7000, 'KING', 'President', null, '2005-11-17', 5000, null, 40);
insert into emp_tab values(7004, 'CLARK', 'Manager', null, str_to_date('20-11-2017','%d-%m-%Y'), 7000, null, 40);

select * from emp_tab;

insert into country_tab values(1, 'USA');
insert into country_tab values(2, 'India');
insert into country_tab values(3, 'Canada');

select * from country_tab;

insert into states_tab values(1, 'California', 1);
insert into states_tab values(2, 'Texas', 1);
insert into states_tab values(3, 'Karnataka', 2);

select * from states_tab;

select empno, 10 * (salary + 100) as "updated salary" from emp_tab;
select concat(name, ' belongs to ', deptno, ' department number') as "employee department data"
from emp_tab;
select count(distinct deptno) from emp_tab;

select distinct deptno, name from emp_tab;

select empno, name, salary from emp_tab where name = 'KING' and salary > 4200;
select empno, name, salary from emp_tab where salary between 2000  and 4500;
select empno, name, salary from emp_tab where deptno in (30, 40);
select empno, name, salary from emp_tab where name in ('King', 'Mike');

select empno, name, salary from emp_tab where name like '%i%' ;

SELECT deptno, mgr_id FROM dept_tab WHERE mgr_id IS NULL;

select empno, name, deptno, salary from emp_tab where deptno = 30 or deptno = 40 and salary > 4200;
select empno, name, deptno, salary from emp_tab where (deptno = 30 or deptno = 40) and salary > 4200;

select concat('hello','myself') as 'message' from dual;
select substr('hello myself', 7, 5) as 'substr message' from dual;
select length('hello myself', 7, 5) as 'total length' from dual;

create table states_tab2(
state_id VARCHAR(10),
state_name VARCHAR(50),
country_id VARCHAR(5),
CONSTRAINT pk_states_tab2 PRIMARY KEY(state_id),
CONSTRAINT fk_states_tab2 FOREIGN KEY(state_id) REFERENCES country_tab(country_id));

insert into states_tab2 select * from states_tab; -- this is called as bulk copy
select * from states_tab2;
update emp_tab set salary= 6000 where empno = 7000;
-- commit
select * from emp_tab;

create table emp_tab2(
empno VARCHAR(5),
name VARCHAR(50) NOT NULL,
job VARCHAR(10),
manager VARCHAR(10),
hiredate DATE,
salary VARCHAR(20),
commission VARCHAR(10),
deptno VARCHAR(5),
CONSTRAINT pk_dept_tab2 PRIMARY KEY(empno),
CONSTRAINT fk_dept_tab2 FOREIGN KEY(deptno) REFERENCES dept_tab(deptno)
);

insert into emp_tab2 select * from emp_tab;

SET SQL_SAFE_UPDATES = 0;

update emp_tab2 set 
manager = (select manager from emp_tab where empno = 7003),
salary = (select salary from emp_tab where empno = 7004) 
where 
empno = 7005;

update emp_tab set deptno = 100 where deptno = 30;
 
describe emp_tab2;
select * from emp_tab2;

delete from states_tab where state_id in (3,4);

delete from country_tab where country_id = 1;

alter table states_tab2 drop column state_name;
rename table states_tab2 to states_tab3;

select * from states_tab3;

select LPAD(5000, 8, '*') FROM dual;
select LPAD(10000, 8, '*') FROM dual;
select RPAD(100000, 8, '*') FROM dual;

select TRIM('d' FROM 'HelloWorld') FROM dual;
select REPLACE('HelloWorld','Hello','Bye');

select name, job, salary,
CASE job when 'manager' then 1.20 * salary
when 'clerk' then 1.15 * salary
else salary
end "revised salary"
from emp_tab;

select sum(salary) from emp_tab;

select min(salary), max(salary)from emp_tab where deptno = 30;

select count(*) from emp_tab;

select manager, max(salary) from emp_tab group by manager order by max(salary) desc;

select deptno, max(salary) from emp_tab where max(salary) >= 4000 group by deptno;

select deptno, max(salary) from emp_tab group by deptno having max(salary) >= 4000;

create database libraryDB;
use libraryDB;

create table books(
bookID int primary key auto_increment,
title varchar(225) not null,
author varchar(255),
publicationyear int,
genre varchar(50),
availablecopies int
);

create user 'root1'@'localhost' identified by 'password';
grant select, update, delete, insert on libraryDB.books to 'root1'@'localhost';

select * from information_schema.user_privileges;

revoke delete on libraryDB.books from 'root1'@'localhost';
show grants for 'root1'@'localhost';

create table customers(
customer_id int not null auto_increment,
name varchar(255) not null,
email varchar(255) not null,
primary key(customer_id)
);

insert into customers(name, email) 
values
('aarin', 'a@gmail.com'),
('poo','poo@gmail.com'),
('yashu','yashu@gmail.com');

select * from customers;

set autocommit = 0;
start transaction;

update customers set name  = "ABC XYZ"
where customer_id = 1;
rollback;

select * from customers;

SHOW VARIABLES LIKE 'autocommit';

create table orders(
order_id int not null auto_increment,
customer_id int null,
quantity int not null,
primary key(order_id),
foreign key(customer_id) references customers(customer_id)
); 

create table strangerthings(
id int primary key,
character_name varchar(255),
last_seen date,
next_appearance date,
location varchar(255)
);

INSERT INTO strangerthings (id, character_name, last_seen, next_appearance, location) 
VALUES
(1, 'Eleven', '2024-10-30', '2025-03-20', 'Hawkins, IN'),
(2, 'Mike Wheeler', '2024-11-15', '2025-04-15', 'Hawkins, IN'),
(3, 'Dustin Henderson', '2024-12-10', '2025-05-10', 'Hawkins, IN'),
(4, 'Lucas Sinclair', '2024-12-25', '2025-06-05', 'Hawkins, IN'),
(5, 'Will Byers', '2025-01-01', '2025-07-01', 'Hawkins, IN');

select character_name, datediff(next_appearance, last_seen) as days_until_next_appearance from strangerthings;
select character_name, dayofweek(next_appearance) as days_until_next_appearance from strangerthings;
select character_name, dayname(next_appearance) as days_until_next_appearance from strangerthings;
select character_name, dayofmonth(next_appearance) as days_until_next_appearance from strangerthings;
select character_name, dayofyear(next_appearance),
if(dayofyear(next_appearance) = '1', 'Happy New Year',
 'Just Another Day...') as message from strangerthings;

select character_name, adddate(next_appearance, interval 1 day) as next_appearnce_tomorrow from strangerthings;


drop table employees;

-- Create the employees table
CREATE TABLE employees (
    id VARCHAR(36) PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    salary DECIMAL(10,2),
    job_experience INT
);



-- Create the new trigger

DELIMITER //
CREATE TRIGGER adjust_salary_before_insert
BEFORE INSERT ON employees
FOR EACH ROW
BEGIN
IF NEW.job_experience>5 THEN 
	SET NEW.salary = NEW.salary * 1.20;
ELSE
	SET NEW.salary = NEW.salary * 1.10;
END IF;
END;
//
DELIMITER ;

-- Insert sample data into employees table
INSERT INTO employees (id, name, email, password, salary, job_experience) 
VALUES
('1', 'John Doe', 'john.doe@example.com', 'password123', 60000.00, 6),
('2', 'Jane Smith', 'jane.smith@example.com', 'password456', 55000.00, 4),
('3', 'Sam Brown', 'sam.brown@example.com', 'password789', 70000.00, 8),
('4', 'Lisa White', 'lisa.white@example.com', 'password012', 50000.00, 2),
('5', 'Tom Green', 'tom.green@example.com', 'password345', 65000.00, 5);

truncate table employees;

select * from employees;

DELIMITER //
CREATE TRIGGER prevent_employee_deletion
BEFORE DELETE ON employees
FOR EACH ROW
BEGIN
    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT = 'deletion of employee is not allowed';
END;
//
DELIMITER ;

DELETE FROM employees WHERE id = '1';
drop table employee;
select * from employee;


-- Creating procedures to call it from java

CREATE TABLE sql_concepts.employeeRecords(
empid int not null primary key,
name varchar(20) not null ,
role varchar(20) default null ,
city varchar(25) ,
country varchar(25)
);

DELIMITER //;
create procedure sql_concepts.insertEmployeeRecord(
IN in_id int,
IN in_name varchar(20),
IN in_role varchar(20),
IN in_city varchar(20),
IN in_country varchar(25),
OUT out_result varchar(20)
)
BEGIN
	INSERT into sql_concepts.employeeRecord( empid , name , role , city , country ) 
    VALUES (in_id , in_name , in_role , in_city , in_country );
    commit ;
    SET out_result := 'TRUE' ;
END;





