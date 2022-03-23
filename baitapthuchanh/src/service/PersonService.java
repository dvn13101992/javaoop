package service;

import java.util.List;

import model.Person;
import model.Student;
import model.Teacher;

public interface PersonService {
	void input(Person person);
	void info(Person person);
	
	//luu xuong file/db
	void insert(Person person);
	
	//doc danh sach tu file/db
	List<Student> getAllStudents();
	
	List<Teacher> getAllTeacher();
	
	
}
