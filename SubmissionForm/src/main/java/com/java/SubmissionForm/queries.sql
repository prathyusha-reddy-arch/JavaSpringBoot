use submsissions;
desc consultant_detail;
desc lead_detail;
desc submission;
desc submission_update;

create database Submissions;
use Submissions;

-- Creation of lead detail table
create table lead_detail(
 lead_id varchar(60) primary key,
 first_name varchar(35),
 last_name varchar(35),
 email varchar(60),
 phone_number varchar(10)

);

-- Creation of consultant detail table

create table consultant_detail(
consultant_id varchar(60) primary key,
 lead_id varchar(60) ,
 first_name varchar(35),
 last_name varchar(35),
 email varchar(60),
 phone_number varchar(10),
 foreign key(lead_id) references lead_detail(lead_id)

);

-- Creation of submission  table

create table submission(
 submission_id varchar(60) primary key,
 consultant_id varchar(60) ,
 vendor_company varchar(50),
 vendor_name varchar(35),
 vendor_email varchar(60),
 vendor_phone_number varchar(10),
 implementation_partner varchar(60),
 client_name varchar(60),
 pay_rate varchar(10),
 submission_status boolean,
 submission_type varchar(60),
 city varchar(60),
 state varchar(60),
 zipcode int,
 foreign key(consultant_id)
 references consultant_detail(consultant_id));

-- Creation of submission update table

create table submission_update(

update_id varchar(60),
submission_id varchar(60),
update_text varchar(100),
create_date date

);

use submissions;

--  Creation of employee table
create table Employee(
first_name varchar(60),
last_name varchar(60),
job_start_date date,
salary int,
primary key(first_name,last_name)
);

-- adding column
alter table Employee
add column department varchar(60);

desc Employee;

-- select statements

select * from Employee;
select max(salary) as highest_salary from Employee;
select * from Employee where job_start_date >=date_sub(now(),interval 2 month);
select department,count(first_name) from Employee group by department;
alter table submission_update
add primary key(update_id);

-- adding constraint to submission update table
alter table submission_update
add foreign key (submission_id) references submission(submission_id);

-- displaying whole data in tables
select * from consultant_detail;
select * from lead_detail;
select * from submission;
select * from submission_update;

SET SQL_SAFE_UPDATES = 0;

-- updating data
update consultant_detail 
set email='ypr@gmail.com' where consultant_id=200;

-- Displaying count of submissions
Select count(s.consultant_id),concat(c.first_name ,c.last_name)
 as full_name
from consultant_detail c inner join submission s on
c.consultant_id=s.consultant_id group by s.consultant_id;

 -- deleting the data whose pay rate is null 
delete  from submission where pay_rate is null;

alter table submission
add column submission_date date;

-- getting submission count based on submission date
select  count(s.consultant_id) as count,concat(c.first_name ,c.last_name) as fullname
from consultant_detail c inner join submission s on
c.consultant_id=s.consultant_id group by s.submission_date,c.first_name,c.last_name;


select l.first_name from lead_detail l;
    

-- lead name and submission date to find the submissions.
select s.*
from submission s
join consultant_detail c on s.consultant_id=c.consultant_id
join lead_detail l on l.lead_id=c.lead_id 
where l.first_name='Kranthi' and s.submission_date='2023-07-11';


-- to find the number of submissions by each lead
select l.first_name,count(s.submission_id)
from lead_detail l 
join consultant_detail c on l.lead_id=c.lead_id
join submission s on s.consultant_id=c.consultant_id
group by s.submission_id;

          
