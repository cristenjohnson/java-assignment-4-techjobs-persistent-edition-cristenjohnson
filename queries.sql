-- Part 1: Test it with SQL
CREATE TABLE job (
id INT,
name VARCHAR (255),
employer_id INT);

-- Part 2: Test it with SQL
SELECT * FROM techjobs.employer ;
WHERE location ;
IN(SELECT techjobs FROM employer WHERE location='St. Louis') ;

-- Part 3: Test it with SQL
DROP TABLE techjobs.job ;

-- Part 4: Test it with SQL
SELECT * ;
FROM skill ;
LEFT JOIN job_skills ON skill.id = job_skills.skills_id ;
WHERE job_skills.jobs_id IS NOT NULL ;
ORDER BY skill.name ASC ;