package ch08_�������̽�.����;

public class P389_ex_Tire_�ʵ������ {

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
		System.out.println("�ѱ�Ÿ�̾ �������ϴ�.");
	}
}

class KumhoTire implements Tire {
	@Override
	public void roll() {
		System.out.println("��ȣŸ�̾ �������ϴ�");
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
