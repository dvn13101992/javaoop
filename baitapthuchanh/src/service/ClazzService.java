package service;

import java.util.List;

import model.Clazz;

public interface ClazzService {
	void input(Clazz clazz);
	void info(Clazz clazz);
	void insert(Clazz clazz);
	List<Clazz> getAll();
}
