package ch06_클래스.예제;

public class P273_ex_instance_this {

	public static void main(String[] args) {

		Carr myCar = new Carr("포르쉐");
		Carr yourCar = new Carr("벤츠");
		Carr ohoh = new Carr();

		myCar.run();
		yourCar.run();
	}
}

class Carr {

	Carr() {
	}

	String model;
	int speed;

	Carr(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			setSpeed(i);
			System.out.println(model + "가 달립니다.(시속:" + speed + "km/h)");
		}
	}
}