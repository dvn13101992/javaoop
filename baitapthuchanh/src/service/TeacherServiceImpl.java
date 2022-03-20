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

import model.Teacher;

public class TeacherServiceImpl implements TeacherService {

	@Override
	public void input(Teacher teacher) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");

		System.out.println("Nhap id");
		teacher.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap name");
		teacher.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhap age");
		teacher.setAge(new Scanner(System.in).nextInt());
		System.out.println("Nhap date of birth");
		String dateOfBirthStr = new Scanner(System.in).nextLine();
		while (true) {
			try {
				teacher.setBirthDate(simpleDateFormat.parse(dateOfBirthStr));
				break;
			} catch (ParseException e) {
				System.out.println("Nhap sai dinh dang ngay");
			}
		}

		teacher.setDeparment(new Scanner(System.in).nextLine());

	}

	@Override
	public void info(Teacher teacher) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Id: " + teacher.getId());
		System.out.println("Name: " + teacher.getName());
		System.out.println("age: " + teacher.getAge());
		System.out.println("date of birth: " + simpleDateFormat.format(teacher.getBirthDate()));
		System.out.println("Department: " + teacher.getDeparment());
	}

	@Override
	public void insert(Teacher teacher) {
		List<Teacher> teachers = getAll();
		teachers.add(teacher);
		writeListFile(teachers);

	}

	private void writeListFile(List<Teacher> teachers) {
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

	@Override
	public List<Teacher> getAll() {
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

}
