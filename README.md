# VLS_HIB_SB

#Database Creation
CREATE DATABASE VLS;

use VLS;


SELECT * FROM Courses;

INSERT INTO COURSES VALUES(1,"Java",1,"Sanjay",10);<br /> 
INSERT INTO COURSES VALUES(2,"Python",0,"Selva",10);


#Browser URL's
http://localhost:8080/api/courses
http://localhost:8080/api/courses/id/1
http://localhost:8080/api/courses/id/2
http://localhost:8080/api/courses/author/Sanjay
http://localhost:8080/api/courses/author/Selva
