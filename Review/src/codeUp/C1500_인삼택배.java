package codeUp;

import java.util.Scanner;

public class C1500_�λ��ù� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�λ�� ũ�� k");
		int k = s.nextInt();
		System.out.print("�ù谡 ���µ� �ɸ��� ��¥ n");
		int n = s.nextInt();
		int[] kk = new int[k * k];

		for (int i = 0; i < k; i++) {
			System.out.println(i + 1 + "��° �λ�� ���� �Է�");
			kk[i] = s.nextInt();
		}
		//.......
	}

}
