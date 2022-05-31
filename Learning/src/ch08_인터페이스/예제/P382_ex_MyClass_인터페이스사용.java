package ch08_인터페이스.예제;

public class P382_ex_MyClass_인터페이스사용 {

	public static void main(String[] args) {
		System.out.println("1)----------");

		Myclass20 myclass1 = new Myclass20();
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(5);

		System.out.println("2)----------");

		Myclass20 myclass2 = new Myclass20(new Audio20());
//		myclass2.rc.turnOn();

		System.out.println("3)----------");

		Myclass20 myclass3 = new Myclass20();
		myclass3.methodA();

		System.out.println("4)----------");

		Myclass20 myclass4 = new Myclass20();
		myclass4.methodB(new Television20());
	}
}

class Myclass20 {
	RemoteControl20 rc = new Television20();
	Myclass20() {
	}

	Myclass20(RemoteControl20 rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodA() {
		RemoteControl20 rc = new Audio20();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl20 rc) {
		rc.turnOn();
		rc.setVolume(5);
	}

}