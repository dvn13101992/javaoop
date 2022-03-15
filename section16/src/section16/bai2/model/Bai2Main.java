package section16.bai2.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Bai2Main {
	public static void main(String[] args) {
		Product p = new Product();
		p.inupt();
		
		writeFile(p);
		readFile();
	}
	
	public static void writeFile(Product p) {
		FileOutputStream fo;
		try {
			fo = new FileOutputStream("product.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
			
			objectOutputStream.writeObject(p);
			
			fo.close();
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void readFile() {
		File file = new File("product.txt");
		
		if(file.exists()) {
			try {
				FileInputStream in = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(in);
				
				Product p = (Product) objectInputStream.readObject();
				p.info();
				
				in.close();
				objectInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
			System.out.println("File khong ton tai");
	}
}
