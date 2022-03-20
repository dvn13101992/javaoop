package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Course;
import model.Student;

public class StudentServiceImpl implements StudentService{

	@Override
	public void input(Student student) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.println("Nhap id");
		student.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap name");
		student.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhap age");
		student.setAge(new Scanner(System.in).nextInt());
		System.out.println("Nhap date of birth");
		String dateOfBirthStr = new Scanner(System.in).nextLine();
		while(true) {
			try {
				student.setBirthDate(simpleDateFormat.parse(dateOfBirthStr));
				break;
			} catch (ParseException e) {
				System.out.println("Nhap sai dinh dang ngay");
			}			
		}
		System.out.println("Nhap Student code");
		student.setStudentCode(new Scanner(System.in).nextLine());
		
	}

	@Override
	public void info(Student student) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Id: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("age: " + student.getAge());
		System.out.println("date of birth: " + simpleDateFormat.format(student.getBirthDate()));
		System.out.println("Student code: " + student.getStudentCode());
	}

	@Override
	public void insert(Student Student) {
		List<Student> students = getAll();
		students.add(Student);
		writeListFile(students);		
	}

	@Override
	public List<Student> getAll() {
		
		File file = new File("student.txt");
		
		if (file.exists()) {
			try {
				FileInputStream in = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(in);
				
				List<Student> students = (List<Student>) objectInputStream.readObject();
				
				in.close();
				objectInputStream.close();
				
				return students;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return new ArrayList<Student>();
		
	}
	
	public void writeListFile(List<Student> students) {
		FileOutputStream fo;
		try {
			fo = new FileOutputStream("student.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

			objectOutputStream.writeObject(students);

			fo.close();
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
