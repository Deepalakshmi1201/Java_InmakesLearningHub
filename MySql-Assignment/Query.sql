use employeedb;
-- Employee_table:
create table employee(
EMP_ID int not null,
 FIRST_NAME varchar(50) not null,
 LAST_NAME varchar(50) not null,
 SALARY int not null,
 JOINING_DATE datetime not null,
 DEPARTMENT varchar(50) not null,
 primary key(EMP_ID)
);
insert into employee(EMP_ID,FIRST_NAME,LAST_NAME, SALARY,JOINING_DATE,DEPARTMENT) 
values(1,'John','Abraham',1000000,'2013-01-01 12.00.00' ,'Banking ');
insert into employee(EMP_ID,FIRST_NAME,LAST_NAME, SALARY,JOINING_DATE,DEPARTMENT) 
values(2,'Michael ','Clarke',800000,'2013-01-01 12.00.00' ,'Insurance');
insert into employee(EMP_ID,FIRST_NAME,LAST_NAME, SALARY,JOINING_DATE,DEPARTMENT) 
values(3,'Roy','Thomas',700000,'2013-01-01 12.00.00' ,'Banking ');
insert into employee(EMP_ID,FIRST_NAME,LAST_NAME, SALARY,JOINING_DATE,DEPARTMENT) 
values(4,'Tom','Jose',600000,'2013-01-01 12.00.00' ,'Insurance');
insert into employee(EMP_ID,FIRST_NAME,LAST_NAME, SALARY,JOINING_DATE,DEPARTMENT) 
values(5,'Jerry','Pinto',650000,'2013-01-01 12.00.00' ,'Insurance');
insert into employee(EMP_ID,FIRST_NAME,LAST_NAME, SALARY,JOINING_DATE,DEPARTMENT) 
values(6,'Philip ','Mathew',750000,'2013-01-01 12.00.00' ,'Services');
insert into employee(EMP_ID,FIRST_NAME,LAST_NAME, SALARY,JOINING_DATE,DEPARTMENT) 
values(7,'Towino','Thomas', 650000,'2013-01-01 12.00.00' ,'Services');
insert into employee(EMP_ID,FIRST_NAME,LAST_NAME, SALARY,JOINING_DATE,DEPARTMENT) 
values(8,'Jeffin','Jose', 600000,'2013-01-01 12.00.00' ,'Insurance');
commit;
select * from employee;

-- Incentives_table:
create table Incentives(
EMPLOYEE_REF_ID int not null,
INCENTIVE_DATE date not null,
INCENTIVE_AMOUNT int not null
);
insert into Incentives(EMPLOYEE_REF_ID,INCENTIVE_DATE,INCENTIVE_AMOUNT )
values(1 ,'2013-02-01', 5000);
insert into Incentives(EMPLOYEE_REF_ID,INCENTIVE_DATE,INCENTIVE_AMOUNT )
values(2 ,'2013-02-01', 3000);
insert into Incentives(EMPLOYEE_REF_ID,INCENTIVE_DATE,INCENTIVE_AMOUNT )
values(3 ,'2013-02-01', 4000);
insert into Incentives(EMPLOYEE_REF_ID,INCENTIVE_DATE,INCENTIVE_AMOUNT )
values(4 ,'2013-02-01', 4500);
insert into Incentives(EMPLOYEE_REF_ID,INCENTIVE_DATE,INCENTIVE_AMOUNT )
values(5 ,'2013-02-01', 3500);
commit;
select* from Incentives;

-- 1. Get all employee details from the employee table
select * from employee;
-- 2. Get First_Name,Last_Name from employee table
select FIRST_NAME,LAST_NAME from employee;
-- 3. Get First_Name from employee table in upper case
select  upper(FIRST_NAME) from employee;
-- 4. Get First_Name from employee table in lower case
select  lower(FIRST_NAME) from employee;
-- 5. Get unique DEPARTMENT from employee table
select distinct DEPARTMENT from employee;
-- 6. Select first 3 characters of FIRST_NAME from EMPLOYEE
select SUBSTR(FIRST_NAME,1,3) from employee;
-- 7. Get position of 'o' in name 'John' from employee table
select POSITION("o" IN "John") AS MatchPosition;
-- 8. Get FIRST_NAME from employee table after removing white spaces from rightside
select Rtrim(FIRST_NAME)  from employee;
-- 9. Get FIRST_NAME from employee table after removing white spaces from leftside
select ltrim(FIRST_NAME)  from employee;
-- 10. Get length of FIRST_NAME from employee table
select length(FIRST_NAME) as length from employee;
-- 11. Get First_Name from employee table after replacing 'o' with '$'
select replace(FIRST_NAME,'o','$') as replacingcharcter from employee;
-- 12. Get First_Name and Last_Name as single column from employee table separated by a '_'
select  concat(FIRST_NAME, '_',LAST_NAME) as name from employee;
-- 13. Get FIRST_NAME ,Joining year,Joining Month and Joining Date from employee table
select FIRST_NAME,Year(JOINING_DATE),month(JOINING_DATE),day(JOINING_DATE)  from employee;
-- 14. Get all employee details from the employee table order by First_Name Ascending
select FIRST_NAME  from employee
order by FIRST_NAME asc ;
-- 15. Get all employee details from the employee table order by First_Name descending
select FIRST_NAME  from employee
order by FIRST_NAME desc ;
-- 16. Get all employee details from the employee table order by First_Name Ascending and Salary descending
select * from employee
order by FIRST_NAME asc , SALARY desc;
-- 17. Get employee details from employee table whose employee name is “Jerry”
select * from employee
where FIRST_NAME = 'John' ;
-- 18. Get employee details from employee table whose employee name are “John” and “Roy”
select * from employee
where FIRST_NAME='John' or FIRST_NAME='Roy';
-- 19. Get employee details from employee table whose employee name are not “John” and “Roy”
select * from employee
where not FIRST_NAME='John' and not FIRST_NAME='Roy';
-- 20. Get employee details from employee table whose first name ends with 'n' and name contains 4 letters
select * from employee
where FIRST_NAME like '___n%';
-- 21. Get employee details from employee table whose first name starts with 'J' and name contains 4 letters
select * from employee
where FIRST_NAME like 'J%' and length(FIRST_NAME )=4;
-- 22. Get employee details from employee table whose Salary greater than 600000
select * from employee
where SALARY > 600000;
-- 23. Get employee details from employee table whose Salary less than 800000
select * from employee
where SALARY < 800000;
-- 24. Get employee details from employee table whose Salary between 500000 and 800000
select * from employee
where SALARY between 500000  and 800000 ;
-- 25. Get employee details from employee table whose name is 'John' and 'Michael'
select * from employee
where FIRST_NAME='John' or FIRST_NAME='Michael ';
-- 26. Get employee details from employee table whose joining year is “2013”
select * from employee
where year(JOINING_DATE) = 2013;
-- 27. Get employee details from employee table whose joining month is “January”
select * from employee
where monthname(JOINING_DATE) = 'January';
-- 28. Get employee details from employee table who joined before January 1st 2013
select * from employee
where monthname(JOINING_DATE) = 'January' and day(JOINING_DATE)=1 and year(JOINING_DATE) = 2013;
-- 29. Get employee details from employee table who joined after January 31st
select * from employee
where monthname(JOINING_DATE) = 'January' and day(JOINING_DATE)=31 ;
-- 30. Get Joining Date and Time from employee table
select date(JOINING_DATE) ,time(JOINING_DATE) from employee;
-- 31. Get Joining Date,Time including milliseconds from employee table
select date(JOINING_DATE) ,time(JOINING_DATE) as milliseconds from employee;
-- 32. Get difference between JOINING_DATE and INCENTIVE_DATE from employee and incentives table
select DateDIFF(JOINING_DATE , INCENTIVE_DATE ) as difference from employee,Incentives;
-- 33. Get current date
select curdate();
-- 34. Get names of employees from employee table who has '%' in Last_Name. Tip : Escape character for special characters in a query.
Select LAST_NAME FROM EMPLOYEE WHERE LAST_NAME LIKE '%\%%';
-- 35. Get Last Name from employee table after replacing special character with white space
Select replace(LAST_NAME,'%',' ') AS  last_name from employee;
-- 36. Get department wise average salary from employee table order by salary ascending
select avg(SALARY) , DEPARTMENT from employee
group by DEPARTMENT
order by avg(SALARY) asc;
-- 37. Get department wise maximum salary from employee table order by salary ascending
select max(SALARY) , DEPARTMENT from employee
group by DEPARTMENT
order by max(SALARY) asc;
-- 38. Get department wise minimum salary from employee table order by salary ascending
select min(SALARY) , DEPARTMENT from employee
group by DEPARTMENT
order by min(SALARY) asc;
-- 39. Select no of employees joined with respect to year and month from employee table
select count(EMP_ID) from employee
where month(JOINING_DATE) = 1 AND Year(JOINING_DATE) = 2013;
-- 40. Select department,total salary with respect to a department from employee table 
-- where total salary greater than 800000 order by Total_Salary descending
select sum(SALARY) , DEPARTMENT from employee
group by DEPARTMENT
having sum(SALARY) > 800000 
order by sum(SALARY) desc;
-- 41. Select first_name, incentive amount from employee and incentives table for those employees who have incentives
alter table employee add column INCENTIVE_AMOUNT int ;
update employee as e , Incentives as i
set e.INCENTIVE_AMOUNT = i.INCENTIVE_AMOUNT
where i.EMPLOYEE_REF_ID = e.EMP_ID;
-----------------------------------------------------------------------------------------------------
select FIRST_NAME,INCENTIVE_AMOUNT from employee
where  INCENTIVE_AMOUNT is not null;
-- 42. Select first_name, incentive amount from employee and incentives table for those employees who have incentives and incentive amount greater than 3000
select FIRST_NAME,INCENTIVE_AMOUNT from employee
where  INCENTIVE_AMOUNT > 3000;
-- 43.Select first_name, incentive amount from employee and incentives table for all employes even if they didn't get incentives
select FIRST_NAME,INCENTIVE_AMOUNT from employee;
-- 44. Select first_name, incentive amount from employee and incentives table for all employees even if they didn't get incentives and
-- set incentive amount as 0 for those employees who didn't get incentives.
update employee as e
set e.INCENTIVE_AMOUNT  = 0
where e.INCENTIVE_AMOUNT  is null;
select * from employee;
-- select FIRST_NAME,INCENTIVE_AMOUNT from employee ;
-- 45. Select first_name, incentive amount from employee and incentives table for all employees who got incentives using left join
select e.FIRST_NAME,i.INCENTIVE_AMOUNT 
from employee e
left join Incentives i
on e.EMP_ID = i.EMPLOYEE_REF_ID;

-- 46. Select max incentive with respect to employee from employee and incentives table using sub query
select max(INCENTIVE_AMOUNT) from employee where exists (select max(INCENTIVE_AMOUNT) from Incentives);
-- 47. Select TOP 2 salary from employee table
select SALARY 
from employee
limit 2;
-- 48. Select 2nd Highest salary from employee table
select max(SALARY) as 2nd_Highest_salary from employee where SALARY < (select max(SALARY) from employee);
-- 49. Select First_Name, LAST_NAME from employee table as separate rows 
select FIRST_NAME from EMPLOYEE union select LAST_NAME from employee;
-- 50. Select employee details from employee table if data exists in incentive table ?
select * from employee
where  INCENTIVE_AMOUNT is not null;
-- 51. Select 20 % of salary from John , 10% of Salary for Roy and for other 15 % of salary from employee table
select FIRST_NAME , 
case  FIRST_NAME
  when 'John' then SALARY * .2
   when 'Roy' then SALARY * .10
   else SALARY * .15
end "Amount" 
from employee;
-- 52. Select Banking as 'Bank Dept', Insurance as 'Insurance Dept' and Services as 'Services Dept' from employee table
 SELECT distinct
 case 
	 when DEPARTMENT = 'Insurance' then 'Insurance Dept'
	 when DEPARTMENT = 'Services' then 'Services Dept'
     when DEPARTMENT = 'Banking ' then 'Bank Dept'
end 'Department'
from employee;

use `whitesource`;
-- Turning off safe updates

SET SQL_SAFE_UPDATES = 0;
-- Insert your script

-- Tunring back on safe updates
SET SQL_SAFE_UPDATES = 1;
alter table Incentives
add constraint Fk_Incentives 
foreign key (EMPLOYEE_REF_ID)  references employee(EMP_ID);
-----------------------------------------------------------------------------------------------------------
ALTER TABLE Incentives
DROP FOREIGN KEY Fk_Incentives  ;
-- 53. Delete employee data from employee table who got incentives in incentive table
SET SQL_SAFE_UPDATES = 0;
delete from employee 
where EMP_ID in (select EMPLOYEE_REF_ID from Incentives);
-- 54. Insert into employee table Last Name with " ' " (Single Quote - SpecialCharacter)
 select concat(LAST_NAME , "'") as last_name from employee;
-- 55. Update incentive table where employee name is 'John'
SET SQL_SAFE_UPDATES = 0;
update employee as e
set e.INCENTIVE_AMOUNT = 8000
where FIRST_NAME = 'John';
select * from employee
where FIRST_NAME = 'John';


