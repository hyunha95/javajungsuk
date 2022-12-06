package third.ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. 정규식을 매개변수로 Pattern클래스의 static메서드인 Pattern compile(String regex)을 호출하여 Pattern인스턴스를 얻는다.
 *   Pattern p = Pattern.compile("c[a-z]");
 * 2. 정규식으로 비교할 대상을 매개변수로 Pattern클래스의 Matcher matcher(CharSequence input)를 호출해서 Matcher인스턴스를 얻는다.
 *   Matcher m = p.matcher(data[i]);
 * 3. Matcher인스턴스에 boolean matches()를 호출해서 정규식에 부합하는지 확인한다.
 *   if(m.matches())
 */
public class RegularEx3 {
	public static void main(String[] args) {
		String source = "HP:011-1111-1111, HOME:02-999-9999";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);

		int i = 0;
		while(m.find()){
			System.out.println(++i + ": " + m.group(2) + " -> " + m.group(1)
								+ ", " + m.group(2) + ", " + m.group(3));
		}
	}
}
