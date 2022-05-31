package ch07_���.����;

public class P340_ex_Tire_CarŬ���� {
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
			System.out.println(location + "Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}
	}
}

class Car1 {
	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);
	
	int run () {
		System.out.println("[�ڵ����� �޸��ϴ�]");
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
		System.out.println("[�ڵ����� ����ϴ�]");
	}
	
}