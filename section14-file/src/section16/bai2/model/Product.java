package section16.bai2.model;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable{
	
	private static final long serialVersionUID = 10;
	private int id;
	private String name;
	private int price;
	
	public void inupt() {
		System.out.println("Nhap id");
		id = new Scanner(System.in).nextInt();
		System.out.println("Nhap name");
		name = new Scanner(System.in).nextLine();
		System.out.println("Nhap price");
		price = new Scanner(System.in).nextInt();
	}
	
	public void info() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
