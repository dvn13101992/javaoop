package service;

import java.util.List;

import model.Student;

public interface StudentService {
	void input(Student student);
	void info(Student student);
	void insert(Student Student);
	List<Student> getAll();

}
