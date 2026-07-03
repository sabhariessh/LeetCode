-- Last updated: 03/07/2026, 11:39:59
SELECT p.firstName, 
       p.lastName, 
       a.city, 
       a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;