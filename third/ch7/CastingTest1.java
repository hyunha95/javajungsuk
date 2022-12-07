package third.ch7;

public class CastingTest1 {
	public static void main(String[] args) {
		Car1 car = null;
		FireEngine1 f3 = new FireEngine1();
	}
}

class Car1 {
	String color;
	int door;
	void drive() {
		System.out.println("drive");
	}
	void stop() {
		System.out.println("stop!!");
	}
}
class FireEngine1 extends Car1 {
	void water() {
		System.out.println("water!!!");
	}
}