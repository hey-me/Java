package ch07_���;

public class D0915_1_���ex2 {

	public static void main(String[] args) {

		BB b = new BB();
		b.aaa();
		b.bbb();
		
		AA a= new AA();
		a.aaa();
	}
}

class AA {
	int num = 5;
	String name = "A";

	public AA() {
		System.out.println("AŬ���� ������");
	}

	void aaa() {
		System.out.println("AŬ���� aaa�޼ҵ�");
	}

	void bbb() {
		System.out.println("AŬ���� bbb�޼ҵ�");
	}
}

class BB extends AA { // �ڽ�Ŭ������ �����ϸ� �θ�Ŭ������ ���� �����.
	public BB() {
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
		System.out.println("BŬ���� bbb�������̵� �޼ҵ�");
	}

}




