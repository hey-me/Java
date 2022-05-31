package ch07_상속.예제;

public class P351_ex_instanceof_객체타입확인 {
	
	static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child 로 변환 성공");
		} else {
			System.out.println("method2 - Child 로 변환하지 않음");
		}
	}

	static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child 로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);

		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}

class Parent {}

class Child extends Parent {}
