package baitap.nghia.section7.dto;

import java.util.Scanner;

public class Developer extends NhanVien{
	public String programLanguage;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap programLanguage");
		programLanguage = new Scanner(System.in).nextLine();
	}
	
	@Override
	public void info() {		
		super.info();
		System.out.println("programLanguage: " + programLanguage);
	}
}
