package second.ch10;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateFormatEx1 {
	public static void main(String[] args) {
		Date today = new Date();
		LocalDateTime now = LocalDateTime.now();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		String result = sdf1.format(today);
		result = sdf2.format(today);
		System.out.println(result);

	}
}
