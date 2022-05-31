package ch06_Ŭ����.����;

public class P280_ex_singleton {

	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
//		Singleton obj3 = new Singleton(); => private �̶� static�� getInstance�� ����� ���.

		if (obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}

}

class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton;
	}
}