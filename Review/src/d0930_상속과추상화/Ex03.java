package d0930_��Ӱ��߻�ȭ;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); //ȯ��
		toDollar.run();
	}

}

abstract class Converter {
	abstract protected double convert (double src);
	abstract protected String getSrcString ();
	abstract protected String getDestString ();
	protected double ratio;
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(getSrcString() + "�� "+ getDestString() + "�� �ٲߴϴ�. ");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ��� : "+res + getDestString() + " �Դϴ�.");
		scanner.close();  //���� �����.. �ݵ�� �ݾƾߵ�. ���߿� ���ϴ�.�Ф�
	}
}

class Won2Dollar extends Converter {
//	Won2Dollar() {}
	Won2Dollar(double val) {
		ratio = val;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		return "��";
	}
	@Override
	protected String getDestString() {
		return "�޷�";
	}
} 