
2.1 Select the last name of all employees.

Ans: SELECT LastName from Employees;

2.2 Select the last name of all employees, without duplicates.

Ans: select distinct lastname from Employees;

2.3 Select all the data of employees whose last name is "Smith".

Ans: select * from Employees where lastname = 'Smith';

2.4 Select all the data of employees whose last name is "Smith" or "Doe".

Ans: select * from Employees where lastname = 'Smith' OR LastName = 'Doe';

2.5 Select all the data of employees that work in department 14.

Ans: select * from Employees where Department = 14;

2.6 Select all the data of employees that work in department 37 or department 77.

Ans: select * from Employees where Department = 37 or Department = 77;

2.7 Select all the data of employees whose last name begins with an "S".

Ans: select * from Employees where LastName LIKE 'S%';

2.8 Select the sum of all the departments' budgets.

Ans: select SUM(Budget) AS TotalBudget from Departments;

2.9 Select the number of employees in each department (you only need to show the department code and the number of employees).

Ans: select Department, COUNT(*) AS NumberOfEmployees from Employees GROUP BY Department;

2.10 Select all the data of employees, including each employee's department's data.

Ans: select * from Employees E  JOIN Departments D ON E.Department = D.Code;

2.11 Select the name and last name of each employee, along with the name and budget of the employee's department.

Ans: select E.Name, E.LastName, D.Name AS DepartmentName, D.Budget from Employees AS E JOIN Departments AS D ON E.Department = D.Code;

2.12 Select the name and last name of employees working for departments with a budget greater than $60,000.

Ans: select E.Name, E.LastName from Employees AS E JOIN Departments AS D ON E.Department = D.Code where D.Budget > 60000;

2.13 Select the departments with a budget larger than the average budget of all the departments.

Ans: select * from Departments where Budget > (SELECT AVG(Budget) FROM Departments);

2.14 Select the names of departments with more than two employees.

Ans: select D.Name from Departments AS D JOIN Employees AS E ON D.Code = E.Department GROUP BY D.Code, D.Name HAVING COUNT(*) > 2;

2.15 Very Important - Select the name and last name of employees working for departments with second lowest budget.

Ans: select E.name, E.LastName from employees AS E JOIN Departments AS D ON E.Department = D.Code where D.Budget = (select min(Budget) from Departments where Budget > (select min(Budget) FROM Departments));

2.16  Add a new department called "Quality Assurance", with a budget of $40,000 and departmental code 11. 
-And Add an employee called "Mary Moore" in that department, with SSN 847-21-9811.

-- Insert the new department
Insert into departments (Code, Name, Budget) values (11, 'Quality assurance', 40000);

-- Insert the new employee in the Quality assurance department
Insert into employees (SSN, Name, Lastname, department) values ('847219811', 'Mary', 'Moore', 11);

2.17 Reduce the budget of all departments by 10%.

Ans: update departments set budget = budget * 0.90;

2.18 Reassign all employees from the Research department (code 77) to the IT department (code 14).

Ans: update employees set department = 14 where department = 77;

2.19 Delete from the table all employees in the IT department (code 14).

Ans: delete from Employees where department = 14;

2.20 Delete from the table all employees who work in departments with a budget greater than or equal to $60,000.

Ans: delete from employees where department IN (select code from departments where Bbudget >= 60000);

2.21 Delete from the table all employees.

Ans: delete from employees;
