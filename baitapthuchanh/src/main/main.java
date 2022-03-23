package main;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		while (true) {
			System.out.println("--------MAIN MENU----------");
			System.out.println("1. Course");
			System.out.println("2. Student");
			System.out.println("3. Teacher");
			System.out.println("4. Class");
			System.out.println("5. Exit");

			System.out.println("Vui long chon");

			int c = new Scanner(System.in).nextInt();

			if (c == 1)
				MenuCourse.menu();
			else if (c == 2) {
				MenuStudent.menu();
			} else if (c == 3) {
				MenuTeacher.menu();
			} else if (c == 4) {
				MenuClass.menu();
			} else if (c == 5)
				break;
			else
				System.out.println("Chon sai. Chon lai");
		}

	}

}
