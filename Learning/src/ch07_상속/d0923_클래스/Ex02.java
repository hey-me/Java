package ch07_상속.d0923_클래스;

public class Ex02 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX()); //부모 클래스 호출..
		System.out.println("x=" + c.x); //자식 클래스 호출..

	}
}

class Parent {
	int x = 100; //200

	Parent() { //3
		this(200);
	}

	Parent(int x) { //4
		this.x = x;
	}

	int getX() { //5
		return x;
	}
}

class Child extends Parent {
	int x = 3000; //1000

	Child() { //1
		this(1000);
	}

	Child(int x) { //2
		this.x = x;
	}
}
