package ch06_Ŭ����;

import java.util.Scanner;

public class D0903_4_ex1_2 {

	public static void main(String[] args) {
		Bcd bcd = new Bcd();
		int[] ar = bcd.input();
		bcd.calc(ar);

	}

}

class Bcd {

	int[] input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int start = s.nextInt();
		System.out.print("���� ���� : ");
		int end = s.nextInt();
		int[] ar = { start, end };
		return ar;

	}

	void calc(int[] ar) {
		int sum = 0;
		for (int i = ar[0]; i <= ar[1]; i++) {
			sum += i;
		}
		System.out.println(ar[0] + "���� " + ar[1] + "���� �հ� : " + sum);
	}
}