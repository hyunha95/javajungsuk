package second.ch10;

import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9, 3); // 2005년 10월 3일 - Month는 0~11의 범위를 갖는다.

		Date day = cal.getTime(); // Calendar를 Date로 변환

	}
}
