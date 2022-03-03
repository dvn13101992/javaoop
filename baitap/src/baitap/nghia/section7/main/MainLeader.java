package baitap.nghia.section7.main;

import java.util.Scanner;

import baitap.nghia.section7.dto.Leader;

public class MainLeader {
	public static void main(String[] args) {
		
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		Leader [] leadertArr = new Leader[a];
		
		for(int i = 0 ; i < leadertArr.length; i++) {
			leadertArr[i] = new Leader();
			leadertArr[i].input();
		}
		
//		for(int i = 0 ; i < leadertArr.length; i++) {
//			leadertArr[i].info();
//		}
		
		System.out.println("Leader co team size > 10");
		for(int i = 0 ; i < leadertArr.length; i++) {
			if(leadertArr[i].teamSize > 10)
				leadertArr[i].info();
		}
		
	}
}
