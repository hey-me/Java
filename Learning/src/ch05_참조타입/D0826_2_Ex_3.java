package ch05_����Ÿ��;

import java.util.Scanner;

public class D0826_2_Ex_3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] ar = new int[5];

		for (int i = 0; i < ar.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է� : ");
			ar[i] = s.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
