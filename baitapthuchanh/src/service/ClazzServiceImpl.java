package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Clazz;
import model.Course;
import model.Person;
import model.Student;
import model.Teacher;

public class ClazzServiceImpl implements ClazzService{

	private PersonService personService = new PersonServiceImpl();
	private CourseService courseService = new CourseServiceImpl();
	@Override
	public void input(Clazz clazz) {
		
		System.out.println("Nhap clazzId");
		clazz.setClassId(new Scanner(System.in).nextInt());
		System.out.println("Nhap class name");
		clazz.setClassName(new Scanner(System.in).nextLine());
		System.out.println("-----Nhap teacher------");
		
		Teacher tc = new Teacher();
		personService.input(tc);
		clazz.setTeacher(tc);
		
		System.out.println("-----Nhap course---");
		Course course = new Course();
		courseService.input(course);
		clazz.setCourse(course);
		
		
		System.out.println("-----Nhap ds sinh vien---------");
		List<Student> students = new ArrayList<Student>();

		while(true) {
			Student student = new Student();
			personService.input(student);
			students.add(student);
			System.out.println("Ban co muon tiep tuc Y/N");
			String c = new Scanner(System.in).nextLine();
			if("N".equalsIgnoreCase(c))
				break;
		}
		clazz.setStudents(students);
			
	}

	@Override
	public void info(Clazz clazz) {
		System.out.println("ClassId: " + clazz.getClassId());
		System.out.println("ClassName: " + clazz.getClassName());
		System.out.println("----Teacher-----");
		personService.info(clazz.getTeacher());
		System.out.println("----Course------");
		courseService.info(clazz.getCourse());
		System.out.println("----DS Sinh Vien-----");
		for(Student st : clazz.getStudents()) {
			personService.info(st);			
		}
		
		System.out.println("------------------");
	}

	@Override
	public void insert(Clazz clazz) {
		List<Clazz> clazzs = getAll();
		clazzs.add(clazz);
		writeListFile(clazzs);
	}

	@Override
	public List<Clazz> getAll() {
		File file = new File("class.txt");
		 
		if (file.exists()) {
			try {
				FileInputStream in = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(in);

				List<Clazz> courses = (List<Clazz>) objectInputStream.readObject();
			
				in.close();
				objectInputStream.close();
				
				return courses;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		} 
		return new ArrayList<Clazz>();			
	}
	
	public void writeListFile(List<Clazz> clazzs) {
		FileOutputStream fo;
		try {
			fo = new FileOutputStream("class.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

			objectOutputStream.writeObject(clazzs);

			fo.close();
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
