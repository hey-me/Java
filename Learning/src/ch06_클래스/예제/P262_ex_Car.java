package ch06_Ŭ����.����;

public class P262_ex_Car {

	public static void main(String[] args) {

		CarExample myCar = new CarExample();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ� : " + speed + "km/h");
	}

}

class CarExample {

	int speed;

	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}

	void run() {
		for (int i = 10; i <= 50; i++) {
			speed = i;
			System.out.println("�޸��ϴ�. (�ü�: " + speed + "km/h)");
		}
	}
}
