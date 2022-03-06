package section8.bai5.main;

import java.util.Scanner;

import section8.bai5.model.Category;
import section8.bai5.model.Product;

public class MainBai5 {
	public static void main(String[] args) {
		System.out.println("Nhap sl category");
		int a = new Scanner(System.in).nextInt();
		
		Category[] categoryArr = new Category[a];
		
		for(int i = 0; i < categoryArr.length; i++) {
			categoryArr[i] = new Category();
			categoryArr[i].input();
			
			System.out.println("Nhap sl product");
			int sl = new Scanner(System.in).nextInt(); 
			Product[] productArr = new Product[sl];
			
			for (int j = 0; j < productArr.length; j++) {
				productArr[j] = new Product();
				productArr[j].input();
				productArr[j].setCategory(categoryArr[i]);
			}
			
			categoryArr[i].setProducts(productArr);
			
		}
		
		System.out.println("Thong tin category");
		for(Category c : categoryArr) {
			c.info();
			System.out.println("----");
			for(Product p : c.getProducts()) {
				p.info();
			}
			
			System.out.println("----------");
		}

		

	}
}
