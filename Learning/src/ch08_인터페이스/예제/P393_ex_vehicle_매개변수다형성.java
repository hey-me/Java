package ch08_�������̽�.����;

public class P393_ex_vehicle_�Ű����������� {

	public static void main(String[] args) {
		Driver d = new Driver();

		Bus b = new Bus();
		Taxi t = new Taxi();

		d.drive(b);
		d.drive(t);
	}

}

class Driver {
	void drive(Vehicle v) {
		v.run();
	}
}

interface Vehicle {
	void run();
}

class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}

class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}
