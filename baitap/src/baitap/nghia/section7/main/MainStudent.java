package baitap.nghia.section7.main;

import java.util.Scanner;

import baitap.nghia.section7.dto.Student;

public class MainStudent {
	public static void main(String[] args) {
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		Student [] studentArr = new Student[a];
		
		for(int i = 0 ; i < studentArr.length; i++) {
			studentArr[i] = new Student();
			studentArr[i].input();
		}
		
		for(int i = 0 ; i < studentArr.length; i++) {
			studentArr[i].info();
		}
	}
}
