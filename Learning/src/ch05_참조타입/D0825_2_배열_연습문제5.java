package ch05_����Ÿ��;

import java.util.Scanner;

public class D0825_2_�迭_��������5 {

	public static void main(String[] args) {

//		5. Scanner�� ������ �ݾ��� �Է¹ް� �ʿ��� ������ ������ ����ϼ���.
//		   - ������ ������ 500, 100, 50, 10, 5, 1 �� 6����
//		   - �������
//		     �Է¹��� �ݾ� : 737
//		     500�� ���� : 1
//		     100�� ���� : 2
//		     50�� ���� : 0
//		     10�� ���� : 3
//		     5�� ���� : 1
//		     1�� ���� : 2
//	**	
		Scanner s = new Scanner(System.in);
		System.out.print("���� �� �ݾ��� �Է��ϼ���.");
		int n = s.nextInt();
		int amout = n;
		int[] don = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = new int[6];

		for (int i = 0; i < don.length; i++) {

			cnt[i] = n / don[i];
			n = n % don[i];

		}
		System.out.println("�Է� ���� �ݾ� : " + amout);
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(don[i] + "�� ������ : " + cnt[i] + "��");
		}

//	**	�迭 �Ⱦ���...
//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �� �ݾ��� �Է��ϼ���.");
//		int n = s.nextInt();
//		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
////		for (int i = 0; i < 6; i++) {
////
////		}
//		if (n >= 500) {
//			n1 = n / 500;
//			n2 = n % 500 / 100;
//			n3 = n % 500 % 100 / 50;
//			n4 = n % 500 % 100 % 50 / 10;
//			n5 = n % 500 % 100 % 50 % 10 / 5;
//			n6 = n % 500 % 100 % 50 % 10 % 5;
//		}
//		System.out.println("500���� ���� : " + n1);
//		System.out.println("100���� ���� : " + n2);
//		System.out.println("50���� ���� : " + n3);
//		System.out.println("10���� ���� : " + n4);
//		System.out.println("5���� ���� : " + n5);
//		System.out.println("1���� ���� : " + n6);

	}

}
