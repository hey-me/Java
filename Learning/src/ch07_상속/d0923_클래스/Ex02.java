package ch07_���.d0923_Ŭ����;

public class Ex02 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX()); //�θ� Ŭ���� ȣ��..
		System.out.println("x=" + c.x); //�ڽ� Ŭ���� ȣ��..

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
