package third.ch11;

import java.util.Stack;

public class StackEx1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");

		printStatus();

		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();

		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();

		goURL("codechobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back: " + back);
		System.out.println("forward: " + forward);

	}

	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}

	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());

	}
}
