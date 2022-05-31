package ch07_상속.예제;

public class P363_ex_animal_추상메소드와재정의 {

	public static void main(String[] args) {

		Dog10 dog = new Dog10();
		Cat10 cat = new Cat10();
		dog.sound();
		cat.sound();
		System.out.println("-------");

		//변수의 자동 타입 변환
		Animal10 animal = null;
		animal = new Dog10();
		animal.sound();
		animal = new Cat10();
		animal.sound();
		System.out.println("-------");
		
		//메소드의 다형성
		animalSound(new Dog10());
		animalSound(new Cat10());
	}

	static void animalSound(Animal10 animal) {
		animal.sound();
	}

}

abstract class Animal10 {
	String kind;

	void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	abstract void sound();
}

class Dog10 extends Animal10 {
	Dog10() {
		this.kind = "포유류";
	}

	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat10 extends Animal10 {
	Cat10() {
		this.kind = "포유류";
	}

	@Override
	void sound() {
		System.out.println("야옹");
	}
}