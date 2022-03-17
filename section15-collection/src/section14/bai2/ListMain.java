package section14.bai2;

import java.util.List;

import section14.bai1.Person;

public class ListMain {
	public static void main(String[] args) {
		List<Person> lsPerson = ListExam.input();
		//ListExam.info(lsPerson);
		//ListExam.sortPerson(lsPerson);
		
		//ListExam.filter(lsPerson);
		ListExam.delete(lsPerson);
	}
}
