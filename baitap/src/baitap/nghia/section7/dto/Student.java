package baitap.nghia.section7.dto;

import java.util.Scanner;

public class Student extends Person{
	public String className;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap className");
		className = new Scanner(System.in).nextLine();
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("ClassName: " + className);
	}
}
