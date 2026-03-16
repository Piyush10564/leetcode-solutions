# Write your MySQL query statement below
-- SELECT class
-- FROM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >=5;
-- WHERE num > 4;