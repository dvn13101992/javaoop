package setion10.bai1.main;

import setion10.bai1.model.Boss;
import setion10.bai1.model.Employee;
import setion10.bai1.model.Person;

public class Bai1Main {
	public static void main(String[] args) {
		Person p1 = new Employee();
		p1.salary();
		
		Person p2 = new Boss();
		p2.salary();
	}
}
