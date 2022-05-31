package ch07_상속;
public class D0915_1_상속ex_오버라이딩 {
	public static void main(String[] args) {

		B b = new B();
		b.aaa();
		b.bbb();
	}
}

class A {
	int num = 5;
	String name = "A";

	public A() {
		System.out.println("A클래스 생성자");
	}

	void aaa() {
		System.out.println("A클래스 aaa메소드");
	}

	void bbb() {
		System.out.println("A클래스 bbb메소드");
	}
}

class B extends A { // 자식클래스를 실행하면 부모클래스가 먼저 실행됨.
	public B() {
		super(); // A(); 부모클래스의 생성자임. 자바의 모든 클래스는 object클래스에 상속됨.
		System.out.println("B클래스 생성자");
	}
	
	@Override
	void aaa() { // A클래스의 메소드를 그대로 가져오고 { }안에만 변경. => 오버라이딩
		System.out.println("B클래스 aaa메소드");
	}

	@Override
	void bbb() {
		super.bbb(); // 부모클래스 호출. 필요없으면 지워도 됨. => 지우면 아래 문장만 호출
		System.out.println("B클래스 오버라이딩 메소드");
	}

}
