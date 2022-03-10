package bai2.main;

import bai2.model.Employee;

public class Bai2Main {
	public static void main(String[] args) {
		Employee employee = new Employee() {
			@Override
			public void salary() {				
				System.out.println("Luong 20tr");
			}
		};
		
		employee.salary();
	}
}
