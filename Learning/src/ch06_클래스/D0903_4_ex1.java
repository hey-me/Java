package ch06_Ŭ����;

import java.util.Scanner;

public class D0903_4_ex1 {

	public static void main(String[] args) {
		Bcde b = new Bcde();

		b.input();

	}

}

class Bcde {
	static void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int start = s.nextInt();
		System.out.print("���� ���� : ");
		int end = s.nextInt();
		calc(start, end);

	}

	private static void calc(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + "���� " + end + "���� �հ� : " + sum);
	}
}
