package section8.bai5.model;

import java.util.Scanner;

public class Product {
	private String productName;
	private int price;
	private Category category;

	public void input() {
		System.out.println("Nhap productName");
		productName = new Scanner(System.in).nextLine();
		System.out.println("Nhap price");
		price = new Scanner(System.in).nextInt();
	}

	public void info() {
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
