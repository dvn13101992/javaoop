package main;

import java.util.List;
import java.util.Scanner;

import model.Course;
import service.CourseService;
import service.CourseServiceImpl;

public class CourseMain {
	public static void main(String[] args) {
		menuCource();
	}

	public static void menuCource() {
		Course course = new Course();
		CourseService courseService = new CourseServiceImpl();

		while (true) {
			courseService.input(course);
			courseService.insert(course);
			
			System.out.println("Ban co muon tiep tuc Y/N");
			String a = new Scanner(System.in).nextLine();			
			if("N".equalsIgnoreCase(a))
				break;
		}
		//sau khi nhap xong doc ra
		System.out.println("DOC RA");
		List<Course> courses = courseService.getAll();
		for(Course c : courses) {
			courseService.info(c);
		}
	}
}
