package ch06_Ŭ����;

import java.util.Scanner;

public class D0903_4_ex2 {

	public static void main(String[] args) {
		new Cd().input();

	}
}

class Cd {
	void input() {
		Scanner n = new Scanner(System.in);
		System.out.print("1�� �Է�");
		int a = n.nextInt();
		System.out.print("2�� �Է�");
		int b = n.nextInt();
		int[] ar = new int[b - a + 1];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + a;
		}
		int s = 0;
		System.out.println("Ȧ���� �� : " + odd(ar, s) + ", ¦���� �� : " + even(ar, s));
	}

	int odd(int[] ar, int s) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 1) {
				s += ar[i];
			}
		}
		return s;
	}

	int even(int[] ar, int s) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				s += ar[i];
			}
		}
		return s;
	}

}
