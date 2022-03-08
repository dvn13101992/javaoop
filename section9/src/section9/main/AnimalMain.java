package section9.main;

import java.util.Scanner;

import section9.model.Animal;
import section9.model.Chicken;
import section9.model.Dog;

public class AnimalMain {
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("Chon: ");
			System.out.println("1. Dog");
			System.out.println("2. Chicken");
			
			int a = new Scanner(System.in).nextInt();
			
			if(a == 1) {
				menuDog();	
				break;
			}
			else if(a==2) {
				menuChicken();
				break;
			}
			else
				System.out.println("Ban da chon sai");
		}
	}
	
	public static void input(Animal animal) {
		System.out.println("Nhap name");
		animal.setName(new Scanner(System.in).nextLine());
		
		System.out.println("Nhap color");
		animal.setColor(new Scanner(System.in).nextLine());
		
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("Nhap nhiem vu");
			dog.setNhiemVu(new Scanner(System.in).nextLine());
		}
		
		if(animal instanceof Chicken) {
			Chicken chicken = (Chicken) animal;
			System.out.println("Nhap type");
			chicken.setType(new Scanner(System.in).nextLine());
		}
			
	}
	
	public static void info(Animal animal) {
		System.out.println("Name: " + animal.getName());
		System.out.println("Color: " + animal.getColor());
		
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("Nhiem vu: " + dog.getNhiemVu());			
		}
		
		if(animal instanceof Chicken) {
			Chicken chicken = (Chicken) animal;
			System.out.println("type: " + chicken.getType());
		}
	}
	
	public static void menuDog() {
		System.out.println("Nhap dog---");
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		
		Dog[] dogArr = new Dog[a];
		
		for(int i = 0; i < dogArr.length; i++) {
			dogArr[i] = new Dog();
			input(dogArr[i]);
		}
		
		for(Dog dog : dogArr) {
			info(dog);
		}
	}
	
	public static void menuChicken() {
		System.out.println("Nhap chicken---");
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		
		Animal[] animalArr = new Chicken[a];
		
		for(int i = 0; i < animalArr.length; i++) {
			animalArr[i] = new Chicken();
			input(animalArr[i]);
		}
		
		for(Animal animal : animalArr) {
			info(animal);
		}
	}
}
