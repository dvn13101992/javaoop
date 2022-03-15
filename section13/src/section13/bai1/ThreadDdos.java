package section13.bai1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ThreadDdos extends Thread {
	@Override
	public void run() {
		try {
			Dos();
		} catch (IOException e) {
			System.out.println("Co loi xay ra");
		}
	}

	public void Dos() throws IOException {
		URL url = new URL("http://qldt.utt.edu.vn/CMCSoft.IU.Web.info/login.aspx");
		//URL url = new URL("https://www.24h.com.vn/");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		System.out.println(Thread.currentThread().getName() + "-------------");
		for (int i = 0; i < urlCon.getHeaderFields().size(); i++) {
			System.out.println(urlCon.getHeaderFieldKey(i) + "=" + urlCon.getHeaderField(i));
		}
	}
}
