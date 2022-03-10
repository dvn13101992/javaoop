package setion10.bai2.model;

import java.util.Scanner;

public class LaptopServiceImpl implements LaptopService {

	@Override
	public void input(Laptop laptop) {
		System.out.println("Nhap id");
		laptop.setId(new Scanner(System.in).nextInt());

		System.out.println("Nhap cpu");
		laptop.setCpu(new Scanner(System.in).nextLine());

		System.out.println("Nhap ram");
		laptop.setRam(new Scanner(System.in).nextLine());

		System.out.println("Nhap vga");
		laptop.setVga(new Scanner(System.in).nextLine());

	}

	@Override
	public void info(Laptop laptop) {
		System.out.println("Id: " + laptop.getId());
		System.out.println("Cpu: " + laptop.getCpu());
		System.out.println("Ram: " + laptop.getRam());
		System.out.println("vga: " + laptop.getVga());

	}

}
