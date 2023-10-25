
6.1 List all the scientists' names, their projects' names, 
    -- and the hours worked by that scientist on each project, 
    -- in alphabetical order of project name, then scientist name.

Ans: select S.Name AS ScientistName, P.Name AS ProjectName, P.Hours AS HoursWorked
from Scientists AS S
JOIN AssignedTo AS A ON S.SSN = A.Scientist
JOIN Projects AS P ON A.Project = P.Code
ORDER BY P.Name, S.Name;

6.2 Select the project names which are not assigned yet

Ans: select P.Name,a.project
from Projects AS P
LEFT JOIN AssignedTo AS A ON P.Code = A.Project
where A.Project IS NULL;
