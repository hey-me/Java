package ch07_���.����;

public class P360_ex_Phone_�߻�Ŭ�������� {

	public static void main(String[] args) {
//		Phone10 phone = new Phone10();
		SmartPhone10 smartPhone = new SmartPhone10("ȫ�浿");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}

abstract class Phone10 {
	String owner;

	public Phone10(String owner) {
		this.owner = owner;
	}
	
	void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}

class SmartPhone10 extends Phone10{
	SmartPhone10(String owner){
		super(owner);
	}
	void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}