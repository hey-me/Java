package ch07_���.����;

public class P346_ex_Vehicle_�Ű������Ǵ��⼺ {

	public static void main(String[] args) {

		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);

	}
}

class Vehicle {
	void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}

class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

class Bus extends Vehicle {
	@Override
	void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}