package ch06_Ŭ����;

public class D0902_3_������_ex {

	public static void main(String[] args) {
		Abc a = new Abc();
		a.add(5, 10);
		System.out.println(a.add(5, 10));

		new Abc(); // �����ϰ� �÷��� ��.
		new Abc().add(5, 10); // �ּ� ���� ���ص� �޼ҵ� ȣ�� ����.
		System.out.println(new Abc().add(5, 10)); // �ѹ��� ������ �������� a�� ���� ���� ���ϰ� ���.
	}
}

class Abc {
	int add(int a, int b) {
		return a + b;
	}
}

// 	�ν��Ͻ�ȭ => Ŭ������ �޸𸮿� �ø��� �ν��Ͻ�ȭ �Ѵٰ� ǥ��.
// 	�ν��Ͻ� instance  = ��ü