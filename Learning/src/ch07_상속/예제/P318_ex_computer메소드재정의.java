package ch07_���.����;

public class P318_ex_computer�޼ҵ������� {

	public static void main(String[] args) {

		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();
		System.out.println("������ : " + computer.areaCircle(r));
	}
}

//�θ� Ŭ����
class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator ��ü�� areaCircle() ����");
		return 3.14159 * r * r;
	}
}

//�ڽ� Ŭ����
class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}