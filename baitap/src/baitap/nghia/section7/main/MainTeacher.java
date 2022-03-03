package baitap.nghia.section7.main;

import java.util.Scanner;

import baitap.nghia.section7.dto.Teacher;

public class MainTeacher {
	
	public static void main(String[] args) {
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		Teacher [] teacherArr = new Teacher[a];
		
		for(int i = 0 ; i < teacherArr.length; i++) {
			teacherArr[i] = new Teacher();
			teacherArr[i].input();
		}
		
		for(int i = 0 ; i < teacherArr.length; i++) {
			teacherArr[i].info();
		}
	}
}
