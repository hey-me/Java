package ch07_상속.예제;

public class P360_ex_Phone_추상클래스선언 {

	public static void main(String[] args) {
//		Phone10 phone = new Phone10();
		SmartPhone10 smartPhone = new SmartPhone10("홍길동");
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
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

class SmartPhone10 extends Phone10{
	SmartPhone10(String owner){
		super(owner);
	}
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}