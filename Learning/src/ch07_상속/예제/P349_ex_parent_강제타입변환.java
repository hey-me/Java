package ch07_상속.예제;

public class P349_ex_parent_강제타입변환 {

	public static void main(String[] args) {
		Parent1 parent = new Child1();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();
		
		Child1 child = (Child1) parent;
		child.field2 = "yyy";
		child.method3();
	}
}

class Parent1 {
	String field1;
	
	void method1() {
		System.out.println("Parent - method1()");
	}
	
	void method2() {
		System.out.println("Parent - method2()");
	}
}

class Child1 extends Parent1 {
	String field2;
	
	void method3() {
		System.out.println("Child - method3()");
	}
}