package ch07_���.����;

public class P319_ex_airplane_superȣ�� {

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
		System.out.println("�����մϴ�.");
	}
	void fly() {
		System.out.println("�Ϲݺ����մϴ�.");
	}
	void takeOff() {
		System.out.println("�̷��մϴ�.");
	}
}

class SupersonicAirplane extends Airplane {
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	int flyMode = NORMAL;

	@Override
	void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			super.fly();
		}
	}

}