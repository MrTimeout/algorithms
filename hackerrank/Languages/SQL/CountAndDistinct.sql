select count(id) - (select count(distinct(city)) from station) from station;
