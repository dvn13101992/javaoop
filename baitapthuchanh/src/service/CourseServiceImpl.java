package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Course;

public class CourseServiceImpl implements CourseService {

	@Override
	public void input(Course course) {
		System.out.println("course id");
		course.setId(new Scanner(System.in).nextInt());
		System.out.println("course name");
		course.setName(new Scanner(System.in).nextLine());

	}

	@Override
	public void info(Course course) {
		System.out.println("Course id: " + course.getId());
		System.out.println("Cource name: " + course.getName());
		System.out.println("---------------");

	}

	@Override
	public void insert(Course course) {
		List<Course> courses = getAll();		
		courses.add(course);		
		writeListFile(courses);
	}

	@Override
	public List<Course> getAll() {
		File file = new File("cources.txt");
		 
		if (file.exists()) {
			try {
				FileInputStream in = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(in);

				List<Course> courses = (List<Course>) objectInputStream.readObject();
			
				in.close();
				objectInputStream.close();
				
				return courses;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		} 
		return new ArrayList<Course>();			
	}
	
	public void writeListFile(List<Course> courses) {
		FileOutputStream fo;
		try {
			fo = new FileOutputStream("cources.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

			objectOutputStream.writeObject(courses);

			fo.close();
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
