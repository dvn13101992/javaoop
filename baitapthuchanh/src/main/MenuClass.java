package main;

import java.util.List;
import java.util.Scanner;

import model.Clazz;
import service.ClazzService;
import service.ClazzServiceImpl;

public class MenuClass {
	public static void menu() {
		System.out.println("------CLASS MENU-------");
		while(true) {			
			System.out.println("1. Write");
			System.out.println("2. Read");
			System.out.println("3. Exit");
			System.out.println();
			int c = new Scanner(System.in).nextInt();
			if(c==1) {
				write();
			}else if(c==2) {
				read();
			}else if(c==3)
				break;
			else
				System.out.println("Chon sai. Chon lai");
		}
			
	}
	
	public static void write() {
		ClazzService clazzService = new ClazzServiceImpl();
		
		while(true) {		
			Clazz clazz = new Clazz();
			
			clazzService.input(clazz);
			clazzService.insert(clazz);
			
			System.out.println("Ban co muon tiep tuc Y/N");
			String c = new Scanner(System.in).nextLine();
			
			if("N".equalsIgnoreCase(c))
				break;
		}
		
	}
	
	public static void read() {
		ClazzService clazzService = new ClazzServiceImpl();
		List<Clazz> clazzs = clazzService.getAll();
		System.out.println("------DOC RA-------");
		for(Clazz clazz : clazzs) {
			clazzService.info(clazz);
		}
	}
}
