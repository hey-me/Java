package ch07_상속.예제;
public class P322_ex_final {
	public static void main(String[] args) {
	}}

//final 상속 불가능
final class Member {}
class VeryImportantPerson // extends Member{} final은 상속 불가능
{}

//final 재정의 불가능
class Car {
	int speed;
	void speedUp() {
		speed += 1;
	}
	void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}

class SportCar extends Car {
	@Override
	void speedUp() {
		speed += 10;
	}
	
	//불가.. final메소드는 안됨.
	@Override 
	void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}