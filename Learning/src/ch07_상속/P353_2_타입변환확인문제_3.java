package ch07_���;

public class P353_2_Ÿ�Ժ�ȯȮ�ι���_3 {

	public static void main(String[] args) {
//		B b = new B();
		B5 b =new B5();

		method(new B5());

	}

	static void method(B5 b) {
	}

}

class A5 {
}

class B5 extends A5 {
}

class D extends B5 {
}

class E extends B5 {
}

class C extends A5 {
}

class F extends C {
}