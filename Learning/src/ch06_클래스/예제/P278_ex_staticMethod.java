package ch06_Ŭ����.����;

public class P278_ex_staticMethod {

	public static void main(String[] args) {
		Car12 car = new Car12();
		car.speed = 60;
		car.run();

	}

}

class Car12 {
	int speed;

	void run() {
		System.out.println(speed + "�� �޸��ϴ�.");
	}

}