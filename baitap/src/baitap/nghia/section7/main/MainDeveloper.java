package baitap.nghia.section7.main;

import java.util.Scanner;

import baitap.nghia.section7.dto.Developer;

public class MainDeveloper {
	public static void main(String[] args) {
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		Developer[] devArr = new Developer[a];

		for (int i = 0; i < devArr.length; i++) {
			devArr[i] = new Developer();
			devArr[i].input();
		}
		
		System.out.println("Nhan vien co ngon ngu la java");
		for (int i = 0; i < devArr.length; i++) {
			if("java".equals(devArr[i].programLanguage.toLowerCase())) {
				devArr[i].info();
			}
		}
	}
}
