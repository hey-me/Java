package ch07_상속.예제;

public class P346_ex_Vehicle_매개변수의다향성 {

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
		System.out.println("차량이 달립니다.");
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
		System.out.println("버스가 달립니다.");
	}
}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("택시가 달립니다.");
	}
}