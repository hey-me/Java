package ch08_�������̽�.����;

public class P397_ex_Driver_��üŸ��Ȯ�� {

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
			b.checkFare();  //�̰� Bus()���� �ִ� ���̹Ƿ� ��ȿ���˻��ϰ�..�ϱ�
		}
		v.run();
	}
}