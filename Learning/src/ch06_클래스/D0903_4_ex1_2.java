package ch06_클래스;

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
		System.out.print("시작 숫자 : ");
		int start = s.nextInt();
		System.out.print("종료 숫자 : ");
		int end = s.nextInt();
		int[] ar = { start, end };
		return ar;

	}

	void calc(int[] ar) {
		int sum = 0;
		for (int i = ar[0]; i <= ar[1]; i++) {
			sum += i;
		}
		System.out.println(ar[0] + "부터 " + ar[1] + "까지 합계 : " + sum);
	}
}