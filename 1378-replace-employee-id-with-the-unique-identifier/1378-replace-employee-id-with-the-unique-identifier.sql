select unique_id,name from Employees e
Left join EmployeeUNI u
on e.id = u.id;