package section16.bai2.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Bai2Main2 {
	public static void main(String[] args) {
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		Product[] pArr = new Product[a];
		for(int i = 0; i < pArr.length; i++) {
			pArr[i] = new Product();
			pArr[i].inupt();
		}


		writeFile(pArr);
		readFile();
	}

	public static void writeFile(Product[] pArr) {
		FileOutputStream fo;
		try {
			fo = new FileOutputStream("productArr.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

			objectOutputStream.writeObject(pArr);

			fo.close();
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readFile() {
		File file = new File("productArr.txt");

		if (file.exists()) {
			try {
				FileInputStream in = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(in);

				Product[] pArr = (Product[]) objectInputStream.readObject();
				for(Product p : pArr) {
					p.info();
				}
				in.close();
				objectInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			System.out.println("File khong ton tai");
	}
}
