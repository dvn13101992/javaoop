package baitap.nghia.section7.dto;

import java.util.Scanner;

public class Tester extends NhanVien{
	public String testTools;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap testTools");
		testTools = new Scanner(System.in).nextLine();
	}
	
	@Override
	public void info() {		
		super.info();
		System.out.println("testTools: " + testTools);
	}
}
