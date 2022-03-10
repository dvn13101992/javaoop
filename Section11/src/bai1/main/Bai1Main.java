package bai1.main;

import bai1.model.FoodMenu;

public class Bai1Main {
	public static void main(String[] args) {
		for(FoodMenu f : FoodMenu.values()) {
			System.out.println("----------");
			System.out.println(f.getId());
			System.out.println(f.getName());			
		}
	}
}
