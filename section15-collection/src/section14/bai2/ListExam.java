package section14.bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import section14.bai1.Person;

public class ListExam {
	public static List<Person> input(){
		List<Person> ls = new ArrayList<Person>();
		while(true) {
			Person p = new Person();
			System.out.println("Nhap id");
			p.setId(new Scanner(System.in).nextInt());
			
			System.out.println("Nhap name");
			p.setName(new Scanner(System.in).nextLine());
			
			System.out.println("Nhap tuoi");
			p.setAge(new Scanner(System.in).nextInt());
			
			ls.add(p);
			
			System.out.println("Ban co muon tiep tuc Y/N");
			String a = new Scanner(System.in).nextLine();
			
			if(a.equalsIgnoreCase("N"))
				break;			
		}
		
		return ls;
	}
	
	public static void info(List<Person> ls) {
		if(ls.size() > 0) {
			for(Person p : ls) {
				System.out.println("ID: " + p.getId());
				System.out.println("Name: " + p.getName());
				System.out.println("Age: " + p.getAge());
			}
		}
	}
	
	public static void filter(List<Person> ls) {
		List<Person> lsFilter = new ArrayList<Person>();
		
		for(Person p : ls) {
			if(p.getAge() > 20)
				lsFilter.add(p);
		}
		
		System.out.println("Ket qua filter");
		if(lsFilter.size() > 0)
			info(lsFilter);
	}
	
	public static void delete(List<Person> ls) {
		Iterator<Person> i = ls.iterator();
		if(i.hasNext()) {
			Person p = i.next();			
			if(p.getName().contains("A"))
				i.remove();
		}
		
		System.out.println("Danh sach sau khi xoa");
		
		if(ls.size() > 0)
			info(ls);
	}
	
	public static void sortPerson(List<Person> ls) {
		if(ls.size() > 0) {
			Collections.sort(ls, new Comparator<Person>() {
				@Override
				public int compare(Person o1, Person o2) {					
					return o2.getAge() - o1.getAge();
				}
				
			});
			System.out.println("List sau khi sap xep");
			info(ls);
		}
	}
}
