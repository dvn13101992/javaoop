create database hello;
use hello;

create table course(
	id int not null,
	name varchar(100)
);

select * from class;


select * from class_student;
delete from class_student;

delete from class;

select p.id, name, age, birth_date, tc.deparment from person p 
				 inner join teacher tc on p.id = tc.person_id ;
                 
 select * from person;       
 

 SET SQL_SAFE_UPDATES = 0;

select * from course; # this is comment
insert into course(id,name) values (1, 'java core'), (2, 'SQL');
insert into course(id,name) values (3, 'servlet');
delete from course where id = 3 ; 

update course set name = 'srping boot' where id = 3person;

select * from person order by age asc, name desc;
select name, age from person;

select * from person where age = 30;

select * from teacher;

select * from person where name like '%Ph%';
select * from person where name like 'Ph%';

select * from person where age >= 26 and age < 31;

select * from person where birth_date > '1992-10-13';

select max(age) from person;
select min(age) from person;
select sum(age) from person;
select count(1) as SL from person;

select * from person where year(birth_date) > 1996;

select count(1) sl, age from person group by age
having sl > 1
;

select sl, nam_sinh from(
	select count(1) sl, year(birth_date) nam_sinh from person group by year(birth_date)
) t where sl > 1;

select * from person where age in(23,30,26);

select * from person where age = (select max(age) from person);

delete from person;

delete from student;

select * from student;

select * from course;

delete from student where person_id = 1;


select * from person;

select * from student a 
inner join class_student b on a.person_id = b.student_id
inner join class c on c.id = b.class_id;





insert into person(id, name, age, birth_date) values (1, 'Dang Van Nghia', 30, '1992/10/13');
insert into person(id, name, age, birth_date) values (2, 'Dinh Van Phuc', 27, '1996/05/15');
insert into person(id, name, age, birth_date) values (3, 'Phạm Thị Thanh Thu', 27, '1994/05/15');

update person set age = 24, birth_date = '1998/07/14' where id = 3;
update person set age = 26 where id = 2;


select * from class;
# insert into class(1, 'A1') values()

		  
select * from student;

select * from teacher;

select * from person;


insert into student(person_id, student_code) values(1, 'st1');
insert into student(person_id, student_code) values(2, 'st2');
insert into student(person_id, student_code) values(10, 'st3');


select * from student a join person b on a.person_id = b.id; 

select * from student a left join person b on a.person_id = b.id; 

select * from student a right join person b on a.person_id = b.id;

insert into class(id, name, course_id) values (1, 'Lop java 1', 1);

insert into class(id, name, course_id) values (2, 'Lop java 2', 1);

select * from class inner join course where class.course_id = course.id;

select * from class;


insert into class_student(class_id, student_id) values (1,1),(1,2),(2,1),(2,2);
insert into class_student(class_id, student_id) values (2,2);

select a.*, c.* from student a inner join class_student b on a.person_id = b.student_id
inner join class c on c.id = b.class_id;
