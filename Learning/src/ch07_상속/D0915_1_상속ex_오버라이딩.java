package ch07_���;
public class D0915_1_���ex_�������̵� {
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
		System.out.println("AŬ���� ������");
	}

	void aaa() {
		System.out.println("AŬ���� aaa�޼ҵ�");
	}

	void bbb() {
		System.out.println("AŬ���� bbb�޼ҵ�");
	}
}

class B extends A { // �ڽ�Ŭ������ �����ϸ� �θ�Ŭ������ ���� �����.
	public B() {
		super(); // A(); �θ�Ŭ������ ��������. �ڹ��� ��� Ŭ������ objectŬ������ ��ӵ�.
		System.out.println("BŬ���� ������");
	}
	
	@Override
	void aaa() { // AŬ������ �޼ҵ带 �״�� �������� { }�ȿ��� ����. => �������̵�
		System.out.println("BŬ���� aaa�޼ҵ�");
	}

	@Override
	void bbb() {
		super.bbb(); // �θ�Ŭ���� ȣ��. �ʿ������ ������ ��. => ����� �Ʒ� ���常 ȣ��
		System.out.println("BŬ���� �������̵� �޼ҵ�");
	}

}
