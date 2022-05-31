package ch08_인터페이스.예제;

public class P393_ex_vehicle_매개변수다형성 {

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
		System.out.println("버스가 달립니다.");
	}
}

class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
