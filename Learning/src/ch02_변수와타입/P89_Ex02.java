package ch02_������Ÿ��;

import java.util.Scanner;

public class P89_Ex02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// �Ҽ������� 4�ڸ� �� �Է�
		System.out.print("ù��° �� : ");
		double n1 = s.nextDouble();
		System.out.print("�ι�° �� : ");
		float n2 = s.nextFloat();

		// ��µǴ� ���� �Ҽ������� 3�ڸ���
		System.out.printf("�� ���� �� : %.3f\n", n1 + n2);
		System.out.printf("�� ���� �� : %.3f\n", n1 - n2);
		System.out.printf("�� ���� �� : %.3f\n", n1 * n2);
		System.out.printf("�� ���� ������ : %.3f", n1 / n2);

	}

}
