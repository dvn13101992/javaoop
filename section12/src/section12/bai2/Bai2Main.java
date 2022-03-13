package section12.bai2;

import java.util.Scanner;

public class Bai2Main {
	public static void main(String[] args) {
		System.out.println("Nhap x");
		int x = new Scanner(System.in).nextInt();
		
		System.out.println("Nhap y");
		int y = new Scanner(System.in).nextInt();
		
		try {
			phepchia(x, y);
		} catch (ZezoException e) {
			System.out.println("Co loi xay ra: " + e.getErroCode());
		}
	}
	
	public static void phepchia(int a, int b) throws ZezoException{
		if(b == 0) {
			ZezoException e = new ZezoException();
			e.setErroCode("Mau so bang 0");
			throw e;
		}
		
		System.out.println("Ket qua: " + (float) a/b);
	}
}
