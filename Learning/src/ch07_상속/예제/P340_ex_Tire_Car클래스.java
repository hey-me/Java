package ch07_상속.예제;

public class P340_ex_Tire_Car클래스 {
}

class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}
}

class Car1 {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	int run () {
		System.out.println("[자동차가 달립니다]");
		if (frontLeftTire.roll()==false) {
			stop(); return 1;
		}
		if (frontRightTire.roll()==false) {
			stop(); return 2;
		}
		if (backLeftTire.roll()==false) {
			stop(); return 3;
		}
		if (backRightTire.roll()==false) {
			stop(); return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
	
}