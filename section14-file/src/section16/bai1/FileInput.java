package section16.bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {
	public static void main(String[] args) {
		writeFile("Hello Java");
		readFile();
	}

	public static void writeFile(String content) {
		try {
			FileOutputStream fo = new FileOutputStream("helloJava.txt");
			byte[] bArr = content.getBytes();

			fo.write(bArr);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readFile() {
		File file = new File("helloJava.txt");

		if (file.exists()) {
			try {
				FileInputStream fi = new FileInputStream(file);
				int c = fi.read();
				String content = "";
				while(c != -1) {
					content += String.valueOf((char)c);

					c = fi.read();
				}
				System.out.println(content);
				writeFile(content + ". Im here");
				fi.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		} else
			System.out.println("File khong ton tai");

	}
}
