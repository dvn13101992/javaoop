package section12.bai1;

import java.util.Scanner;

public class Bai1Main {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while(true) {			
			System.out.println("Nhap x");
			try {
				x = new Scanner(System.in).nextInt();	
				break;
			} catch (Exception e) {
				System.out.println("Nhap sai, nhap lai");
			}
		}
		
		while(true) {			
			System.out.println("Nhap y");
			try {
				y = new Scanner(System.in).nextInt();	
				break;
			} catch (Exception e) {
				System.out.println("Nhap sai, nhap lai");
			}
		}
		
		System.out.println("x + y = " + (x+y));
	}
}
