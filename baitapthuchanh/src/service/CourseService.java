package service;

import java.util.List;

import model.Course;

public interface CourseService {
	void input(Course course);
	
	void info(Course course);
	
	void insert(Course course);
	
	List<Course> getAll();
}
