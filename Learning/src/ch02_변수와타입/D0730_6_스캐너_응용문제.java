package ch02_������Ÿ��;
import java.util.Scanner;

public class D0730_6_��ĳ��_���빮�� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		�̻�, ���� ����ϱ�
//		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
//		int a = s.nextInt();
//
//		if (a >= 50) {
//			System.out.println("50�̻��� �����Դϴ�.");
//		} else {
//			System.out.println("50������ �����Դϴ�.");
//		}

//		¦��, Ȧ�� ����ϱ�
//		if (a % 2 > 0) {
//			System.out.println("���� " + a + "�� Ȧ���Դϴ�.");
//		} else {
//			System.out.println("���� " + a + "�� ¦���Դϴ�.");
//		}

//		�� ���� ������ �Է¹ް� ū ������ ���� �� ����
//		System.out.print("���� �ϳ��� �Է����ּ��� : ");
//		int x = s.nextInt();
//		System.out.print("���� �ϳ��� �Է����ּ��� : ");
//		int y = s.nextInt();
//		if (x > y) {
//			System.out.println(x - y);
//		} else {
//			System.out.println(y - x);
//		}
		
//		�ڽ��� bmi �����ϱ�
		System.out.print("Ű�� �Է����ּ���(cm�� �ƴ� m�� �����ּ���) : ");
		double a = s.nextDouble();
		System.out.print("�����Ը� �Է����ּ��� : ");
		double b = s.nextDouble();
		double c = (b/(a*a));
		System.out.print("����� bmi�� "+c);
		
		if(c>23) {
			System.out.println("����� ��ü���Դϴ�. ��ϼ���.");
		}else {
			System.out.println("�����̽ó׿�. ���");
		}
		
	}

}
