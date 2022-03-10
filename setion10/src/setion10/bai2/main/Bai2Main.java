package setion10.bai2.main;

import setion10.bai2.model.Laptop;
import setion10.bai2.model.LaptopService;
import setion10.bai2.model.LaptopServiceImpl;

public class Bai2Main {
	public static void main(String[] args) {
		LaptopService laptopService = new LaptopServiceImpl();
		
		Laptop laptop = new Laptop();
		
		laptopService.input(laptop);
		laptopService.info(laptop);
	}
}
