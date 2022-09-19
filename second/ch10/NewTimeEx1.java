package second.ch10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // 오늘의 날짜
		LocalTime now = LocalTime.now(); // 현재 시간

		LocalDate birthDate = LocalDate.of(1999, 12, 31); // 1999년 12월 31일
		LocalTime birthTime = LocalTime.of(23, 59, 59);

		System.out.println("today=" + today);
		System.out.println("now=" + now);
		System.out.println("birthDate=" + birthDate);
		System.out.println("birthTime=" + birthTime);

		System.out.println(birthDate.withYear(2000));
		System.out.println(birthDate.plusDays(1));
		System.out.println(birthDate.plus(1, ChronoUnit.DAYS));

		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));


	}
}
