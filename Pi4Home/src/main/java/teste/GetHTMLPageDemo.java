package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetHTMLPageDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.xe.com/?c=USD");

			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (MalformedURLException e) {
			System.err.println("Deu merda!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
