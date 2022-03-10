package setion10.bai3.ServiceImpl;

import java.util.Scanner;

import setion10.bai3.Service.StudentService;
import setion10.bai3.model.Student;

public class StudentServiceImpl implements StudentService{

	@Override
	public void input(Student student) {
		System.out.println("Nhap thong tin------");
		System.out.println("Nhap id");
		student.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap name");
		student.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhap tuoi");
		student.setAge(new Scanner(System.in).nextInt());
		
	}

	@Override
	public void info(Student student) {
		System.out.println("Thong tin ------");
		System.out.println("Id: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
	}

}
