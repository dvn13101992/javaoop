package setion10.bai3.main;

import java.util.Scanner;

import setion10.bai3.Service.StudentService;
import setion10.bai3.ServiceImpl.StudentServiceImpl;
import setion10.bai3.model.Student;

public class Bai3Main {
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImpl();
		
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		
		Student[] stArr = new Student[a];
		
		for(int i = 0; i < stArr.length; i++) {
			stArr[i] = new Student();
			stService.input(stArr[i]);
		}
		
		for(Student st : stArr) {
			stService.info(st);
		}
		
		Student stAgeMax = stArr[0];
		for(int i = 1; i < stArr.length; i++) {
			if(stAgeMax.getAge() < stArr[i].getAge())
				stAgeMax = stArr[i];
		}
		
		System.out.println("Sinh vien co tuoi lon nhat-----");
		stService.info(stAgeMax);
	}
}
