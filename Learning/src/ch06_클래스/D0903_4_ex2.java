package ch06_클래스;

import java.util.Scanner;

public class D0903_4_ex2 {

	public static void main(String[] args) {
		new Cd().input();

	}
}

class Cd {
	void input() {
		Scanner n = new Scanner(System.in);
		System.out.print("1수 입력");
		int a = n.nextInt();
		System.out.print("2수 입력");
		int b = n.nextInt();
		int[] ar = new int[b - a + 1];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + a;
		}
		int s = 0;
		System.out.println("홀수의 합 : " + odd(ar, s) + ", 짝수의 합 : " + even(ar, s));
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
