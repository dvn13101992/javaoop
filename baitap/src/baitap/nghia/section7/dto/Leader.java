package baitap.nghia.section7.dto;

import java.util.Scanner;

public class Leader extends NhanVien {
	public int teamSize;
	public static float luongCoBan = 10000000f;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap teamSize");
		teamSize = new Scanner(System.in).nextInt();
	}

	@Override
	public void info() {
		super.info();
		System.out.println("teamSize: " + teamSize);
		System.out.println("Bonus: " + bonus());
	}

	public float bonus() {
		if (teamSize > 10)
			return luongCoBan * ((float) 50 / 100);
		return luongCoBan * ((float) 10 / 100);
	}

}
