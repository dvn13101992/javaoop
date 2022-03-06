package section8.bai5.model;

import java.util.Scanner;

public class Category {
	private int id;
	private String categoryName;
	
	private Product[] products;
	
	public void input() {
		System.out.println("Nhap id");
		id = new Scanner(System.in).nextInt();
		System.out.println("Nhap categoryName");
		categoryName = new Scanner(System.in).nextLine();
		
	}
	
	public void info() {
		System.out.println("id: " + id);
		System.out.println("Category Name: " + categoryName);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	
}
