package ch08_인터페이스.예제;

public class P395_ex_Vehicle_강제타입변환 {

	public static void main(String[] args) {
		Vehicle v = new Bus2();

		v.run();
//		v.checkFare();

		Bus2 b = (Bus2) v;

		b.run();
		b.checkFare();
	}

}


class Bus2 implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
