package ch06_Ŭ����;

public class P269_4_�޼ҵ�Ȯ�ι���4 {

	public static void main(String[] args) {

		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
//		��������.�޼ҵ�
	}

}
/*	�����ε�
		�̸��� ���� �޼ҵ带 ���� �� ����� ��.
		�Ű����� �پ��ϰ� �޾� ó���� �� �ֵ��� �ϱ� ����.
		�Ű� ������ Ÿ��, ����, ���� �� �ϳ��� �޶�� ��.
*/

class Printer {

	void println(int a) {
		System.out.println(a);
	}

	void println(boolean a) {
		System.out.println(a);
	}

	void println(double a) {
		System.out.println(a);
	}

	void println(String a) {
		System.out.println(a);
	}

}
