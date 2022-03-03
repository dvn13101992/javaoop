package baitap.nghia.section7.dto;

import java.util.Scanner;

public class Teacher extends Person{
	public String mon;
	
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap mon");
		mon = new Scanner(System.in).nextLine();
		
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("Mon: " + mon);
	}
}
