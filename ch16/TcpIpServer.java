package ch16;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.net.ServerSocket;

public class TcpIpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			// 서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비되었습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}

		while(true) {
			try {

			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 현재시간을 문자열로 반환하는 함수
	static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
		return sdf.format(new Date());

	}
}
