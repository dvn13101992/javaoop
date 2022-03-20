package service;

import java.util.List;

import model.Teacher;

public interface TeacherService {
	void input(Teacher teacher);
	void info(Teacher teacher);
	void insert(Teacher teacher);
	List<Teacher> getAll();
}
