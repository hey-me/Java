package ch06_Ŭ����;

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
		this("�׷���");
	}

	Car11(String a) {
		this("����", 500);
//		model = a;
	}

	Car11(String a, int c) {
		this("�ҳ�Ÿ", a, c);
	}

	Car11(String model, String b, int max) {
		this.model = model;
		color = b;
		maxSpeed = max;
	}

}