package baitap.nghia.section6;

import java.util.Scanner;

public class School {
	private String schoolName;
	private String address;
	private int id;

	public School() {

	}

	public void input() {
		System.out.println("Nhap ma truong");
		id = new Scanner(System.in).nextInt();
		System.out.println("Nhap ten truong");
		schoolName = new Scanner(System.in).nextLine();
		System.out.println("Nhap dia chi");
		address = new Scanner(System.in).nextLine();
	}

	public void info() {
		System.out.println("Thong tin-----------");
		System.out.println("Ma truong: " + id);
		System.out.println("Ten truong: " + schoolName);
		System.out.println("Dia chi " + address);
	}

	public static void main(String[] args) {
		System.out.println("Nhap so phan tu cua mang");
		int n = new Scanner(System.in).nextInt();
		School[] schoolArr = new School[n];

		for (int i = 0; i < schoolArr.length; i++) {
			schoolArr[i] = new School();
			schoolArr[i].input();
		}
		for (int i = 0; i < schoolArr.length; i++) {
			schoolArr[i].info();
		}

		System.out.println("Nhap ky tu tim kiem");
		String word = new Scanner(System.in).nextLine();

		for (int i = 0; i < schoolArr.length; i++) {
			if (schoolArr[i].schoolName.toLowerCase().contains(word.toLowerCase().trim())) {
				schoolArr[i].info();
			}
		}

	}
}
