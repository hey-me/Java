package ch08_인터페이스.예제;

public class P397_ex_Driver_객체타입확인 {

	public static void main(String[] args) {
		
		Driver2 d = new Driver2();
		
		Bus2 b = new Bus2();
		Taxi t = new Taxi();
		
		d.drive(b);
		d.drive(t);
	}

}

class Driver2 {
	void drive(Vehicle v) {
		if (v instanceof Bus2) {
			Bus2 b = (Bus2) v;
			b.checkFare();  //이건 Bus()에만 있는 것이므로 유효성검사하고..하기
		}
		v.run();
	}
}