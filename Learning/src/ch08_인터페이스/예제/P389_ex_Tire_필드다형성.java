package ch08_인터페이스.예제;

public class P389_ex_Tire_필드다형성 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		myCar.run();
	}
}

interface Tire {
	void roll();
}

class HankookTire implements Tire {
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
}

class KumhoTire implements Tire {
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다");
	}
}

class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
