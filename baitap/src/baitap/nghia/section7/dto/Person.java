package baitap.nghia.section7.dto;

import java.util.Scanner;

public class Person {
	public String name;
	public int age;
	
	public void input() {
		System.out.println("Nhap ten");
		name = new Scanner(System.in).nextLine();
		System.out.println("Nhap tuoi");
		age = new Scanner(System.in).nextInt();
	}
	
	public void info() {
		System.out.println("Ten: " + name);
		System.out.println("Tuoi: " + age);
	}
}
