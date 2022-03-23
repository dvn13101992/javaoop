package main;

import java.util.List;
import java.util.Scanner;

import model.Student;
import service.PersonService;
import service.PersonServiceImpl;

public class MenuStudent {
	public static void menu() {

		while (true) {
			System.out.println("-------STUDENT MENU-----------");
			System.out.println("1. write");
			System.out.println("2. read");
			System.out.println("3. exit");

			System.out.println("Vui long chon");

			int c = new Scanner(System.in).nextInt();
			if (c == 1)
				write();
			else if (c == 2)
				readAll();
			else if (c == 3)
				break;
			else
				System.out.println("Chon lai");

		}
	}

	public static void write() {
		Student student = new Student();
		PersonService personService = new PersonServiceImpl();

		while (true) {
			personService.input(student);
			personService.insert(student);

			System.out.println("Ban co muon tiep tuc Y/N");
			String a = new Scanner(System.in).nextLine();
			if ("N".equalsIgnoreCase(a))
				break;
		}
	}

	public static void readAll() {
		PersonService personService = new PersonServiceImpl();

		// sau khi nhap xong doc ra
		System.out.println("DOC RA");
		List<Student> students = personService.getAllStudents();
		for (Student st : students) {
			personService.info(st);
		}
	}
}
