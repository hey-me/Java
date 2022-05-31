package ch06_클래스;

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
		System.out.print("시작 숫자 : ");
		int start = s.nextInt();
		System.out.print("종료 숫자 : ");
		int end = s.nextInt();
		calc(start, end);

	}

	private static void calc(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + "부터 " + end + "까지 합계 : " + sum);
	}
}
