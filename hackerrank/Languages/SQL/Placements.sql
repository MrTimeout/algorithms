/*
Write a query to output the names of those students whose best friends got offered a higher salary than them. Names must be ordered by the salary amount offered to the best friends. It is guaranteed that no two students got same salary offer.
*/

select s.name from students s, friends f, packages pf, packages ps where s.id = f.id and f.friend_id = pf.id and s.id = ps.id and pf.salary > ps.salary order by pf.salary asc
