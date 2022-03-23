package main;

import java.util.List;
import java.util.Scanner;

import model.Course;
import service.CourseService;
import service.CourseServiceImpl;

public class MenuCourse {
	public static void menu() {
		
		while(true) {
			System.out.println("-------COURSE MENU-----------");
			System.out.println("1. write");
			System.out.println("2. read");
			System.out.println("3. exit");
			
			System.out.println("Vui long chon");
			
			int c = new Scanner(System.in).nextInt();
			if(c==1)
				write();
			else if(c==2)
				readAll();
			else if(c==3)
				break;
			else
				System.out.println("Chon lai");
			
		}
	}

	public static void write() {
		Course course = new Course();
		CourseService courseService = new CourseServiceImpl();

		while (true) {
			courseService.input(course);
			courseService.insert(course);

			System.out.println("Ban co muon tiep tuc Y/N");
			String a = new Scanner(System.in).nextLine();
			if ("N".equalsIgnoreCase(a))
				break;
		}
	}

	public static void readAll() {
		CourseService courseService = new CourseServiceImpl();

		// sau khi nhap xong doc ra
		System.out.println("DOC RA");
		List<Course> courses = courseService.getAll();
		for (Course c : courses) {
			courseService.info(c);
		}
	}
}
