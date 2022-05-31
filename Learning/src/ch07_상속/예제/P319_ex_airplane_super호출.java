package ch07_상속.예제;

public class P319_ex_airplane_super호출 {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}

class Airplane {
	void land() {
		System.out.println("착륙합니다.");
	}
	void fly() {
		System.out.println("일반비행합니다.");
	}
	void takeOff() {
		System.out.println("이륙합니다.");
	}
}

class SupersonicAirplane extends Airplane {
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	int flyMode = NORMAL;

	@Override
	void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}

}