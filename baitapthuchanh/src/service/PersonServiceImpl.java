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

import model.Person;
import model.Student;
import model.Teacher;

public class PersonServiceImpl implements PersonService {

	@Override
	public void input(Person person) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");

		System.out.println("Nhap id");
		person.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap name");
		person.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhap age");
		person.setAge(new Scanner(System.in).nextInt());
		System.out.println("Nhap date of birth");
		String dateOfBirthStr = new Scanner(System.in).nextLine();
		while (true) {
			try {
				person.setBirthDate(simpleDateFormat.parse(dateOfBirthStr));
				break;
			} catch (ParseException e) {
				System.out.println("Nhap sai dinh dang ngay");
			}
		}

		if (person instanceof Student) {
			Student st = (Student) person;
			System.out.println("Nhap Student code");
			st.setStudentCode(new Scanner(System.in).nextLine());
		} else if (person instanceof Teacher) {
			Teacher tc = (Teacher) person;
			System.out.println("Nhap Deparment");
			tc.setDeparment(new Scanner(System.in).nextLine());
		}
	}

	@Override
	public void info(Person person) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Id: " + person.getId());
		System.out.println("Name: " + person.getName());
		System.out.println("age: " + person.getAge());
		System.out.println("date of birth: " + simpleDateFormat.format(person.getBirthDate()));

		if (person instanceof Student) {
			Student st = (Student) person;
			System.out.println("Student code: " + st.getStudentCode());
		} else if (person instanceof Teacher) {
			Teacher tc = (Teacher) person;
			System.out.println("Deparment: " + tc.getDeparment());
		}
		System.out.println("----------------");

	}

	@Override
	public void insert(Person person) {
		if(person instanceof Student) {
			Student st = (Student) person;
			List<Student> students = getAllStudents();
			students.add(st);
			writeListFileStudent(students);
		}else if(person instanceof Teacher) {
			Teacher tc = (Teacher) person;
			List<Teacher> teachers = getAllTeacher();
			teachers.add(tc);
			writeListFileTeacher(teachers);
		}

	}

	@Override
	public List<Student> getAllStudents() {
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

	@Override
	public List<Teacher> getAllTeacher() {
		File file = new File("teacher.txt");

		if (file.exists()) {
			try {
				FileInputStream in = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(in);

				List<Teacher> teachers = (List<Teacher>) objectInputStream.readObject();

				in.close();
				objectInputStream.close();

				return teachers;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return new ArrayList<Teacher>();
	}
	
	private void writeListFileTeacher(List<Teacher> teachers) {
		FileOutputStream fo;
		try {
			fo = new FileOutputStream("teacher.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

			objectOutputStream.writeObject(teachers);

			fo.close();
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void writeListFileStudent(List<Student> students) {
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
