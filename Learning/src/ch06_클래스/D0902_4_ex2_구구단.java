package ch06_클래스;

import java.util.Scanner;

public abstract class D0902_4_ex2_구구단 {

	public static void main(String[] args) {

	// 입력한 단의 구구단 출력
		Scanner s = new Scanner(System.in);
		System.out.print("출력 단 : ");
		int dan = s.nextInt();
		gugudan(dan);
	}

	private static void gugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}

}
