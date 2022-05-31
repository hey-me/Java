package ch06_클래스.예제;

public class P262_ex_Car {

	public static void main(String[] args) {

		CarExample myCar = new CarExample();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}

}

class CarExample {

	int speed;

	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() {
		for (int i = 10; i <= 50; i++) {
			speed = i;
			System.out.println("달립니다. (시속: " + speed + "km/h)");
		}
	}
}
