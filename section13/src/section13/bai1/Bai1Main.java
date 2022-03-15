package section13.bai1;

import java.util.Scanner;

public class Bai1Main {
	public static void main(String[] args) {
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		
		Thread [] tArr = new ThreadDdos[a];
		
		for(int i = 0; i < tArr.length; i++) {
			tArr[i] = new ThreadDdos();
			
			tArr[i].start();
		}
	}
}
