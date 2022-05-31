package ch06_클래스;

import java.util.Scanner;

public class D0902_4_ex3_계산 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("A 입력");
		int a = s.nextInt();
		System.out.println("B 입력");
		int b = s.nextInt();

		calc(a, b);

	}

	private static void calc(int a, int b) {
		System.out.println("A+B=" + (a + b));
		System.out.println("A-B=" + (a - b));
		System.out.println("A*B=" + a * b);
		System.out.println("A/B=" + a / b);

	}
	
//	private static int[] calcArr(int a, int b) {
//	}

	
	
	
}
