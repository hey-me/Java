package ch04_���ǹ����ݺ���;

import java.util.Scanner;

public class P147_�������� {

	public static void main(String[] args) {
//		<�Է�>
//		�ʱ����� : 000
//		�Ǳ����� : 000
//		<���>
//		���� : 000
//		��� : 000
//		��� : �հ� or ���հ�
//		����� �ʱⰡ 40�� �̻��̰� �ǱⰡ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�, �׷��� ������ ���հ�

		Scanner s = new Scanner(System.in);
		System.out.print("�ʱ����� :");
		int grade1 = s.nextInt();
		System.out.print("�Ǳ����� :");
		int grade2 = s.nextInt();

		int num1 = grade1 + grade2;
		double num2 = (double) num1 / 2;
		System.out.println("���� : " + num1);
		System.out.println("��� : " + num2);

//		if (num2 >= 60) {
//			if (grade1 >= 40 & grade2 >= 40) {
//				System.out.println("��� : �հ�");
//			} else {
//				System.out.println("��� : ���հ�");
//			}
//		} else {
//			System.out.println("��� : ���հ�");

		if (grade1 >= 40 && grade2 >= 40 && num2 >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
	}

}
