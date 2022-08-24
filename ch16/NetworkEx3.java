package ch16;

import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {
	public static void main(String[] args) {
		URL url = null;
		String address = "http://www.codechobo.com/sample/hello.html";

		try {
			url = new URL(address);
			URLConnection conn = url.openConnection(); // URLConnection openConnection() : URL과 연결된 URLConnection을 얻는다.

			System.out.println("conn.toString() : " + conn);
			System.out.println("getAllowUserInteraction() : " + conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout() : " + conn.getConnectTimeout());
//			System.out.println("getContent() : " + conn.getContent());

			System.out.println("getCOntentEncoding() : " + conn.getContentEncoding());
			System.out.println("getContentType() : " + conn.getContentType());
			System.out.println("getDate() : " + conn.getDate());
//			System.out.println("getDefaultAllowUserInteraction() : " + conn.getDefaultAllowuserInteraction());
			System.out.println("getDefaultUseCaches() : " + conn.getDefaultUseCaches());
			System.out.println("getDoInput() : " + conn.getDoInput());
			System.out.println("getDoOutput() : " + conn.getDoOutput());
			System.out.println("getExpiration() : " + conn.getExpiration());
			System.out.println("getHeaerFields() : " + conn.getHeaderFields());
			System.out.println("getIfModifiedSince() : " + conn.getIfModifiedSince());
			System.out.println("getLastModified() : " + conn.getLastModified());
			System.out.println("getURL() : " + conn.getURL());
			System.out.println("getUseCaches() : " + conn.getUseCaches());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
