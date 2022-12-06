package third.ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. 문자열 source에서 "broken"을 m.find()로 찾은 후 처음으로 m.appendReplacement(sb, "drunken");가 호출되면 source의 시작부터
 * "broken"을 찾은 위치까지의 내용에 "drunken"을 더해서 저장한다.
 * 	- sb에 저장된 내용 : "A drunken"
 * 2. m.find()는 첫 번째로 발견된 위치의 끝에서부터 다시 검색을 시작하여 두 번째 "broken"을 찾게 된다. 다시 m.appendReplaceMent(sb, "drunken");가 호출
 *  - sb에 저장된 내용 : "A drunken hand works, but not a drunken"
 * 3. m.appendTail(sb);이 호출되면 마지막으로 치환된 이후의 부분을 sb에 덧붙인다.
 *  - sb에 저장된 내용 : "A drunken hand works, but not a drunken heart."
 */
public class RegularEx4 {
	public static void main(String[] args) {
		String source = "A broken hand works, but not a broken heart.";
		String pattern = "broken";
		StringBuffer sb = new StringBuffer();

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		System.out.println("source:"+source);

		int i = 0;
		while(m.find()) {
			System.out.println(++i + "번째 매칭:" + m.start() + "~" + m.end());
			// broken을 drunken으로 치환하여 sb에 저장한다.
			m.appendReplacement(sb, "drunken");
		}
		m.appendTail(sb);
		System.out.println("Replacement count : " + i);
		System.out.println("result : " + sb.toString());
	}
}
