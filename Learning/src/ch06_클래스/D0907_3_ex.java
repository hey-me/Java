package ch06_클래스;

public class D0907_3_ex {

	public static void main(String[] args) {

		Car11 c = new Car11();
		System.out.println(c.model);
		System.out.println(c.color);
		System.out.println(c.maxSpeed);
//		System.out.println(c.model);
	}
}

class Car11 {
	String model;
	String color;
	int maxSpeed;

	Car11() {
		this("그랜저");
	}

	Car11(String a) {
		this("빨강", 500);
//		model = a;
	}

	Car11(String a, int c) {
		this("소나타", a, c);
	}

	Car11(String model, String b, int max) {
		this.model = model;
		color = b;
		maxSpeed = max;
	}

}