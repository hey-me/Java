package ch08_�������̽�.����;

public class P395_ex_Vehicle_����Ÿ�Ժ�ȯ {

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
		System.out.println("������ �޸��ϴ�.");
	}

	void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
}
