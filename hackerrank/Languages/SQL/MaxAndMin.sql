
select city, length(city) from station where length(city) = (select max(length(city)) from station) order by city asc limit 0,1;

select city, length(city) from station where length(city) = (select min(length(city)) from station) order by city asc limit 0,1;
