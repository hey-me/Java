package ch06_Ŭ����;

import java.util.Scanner;

public class D0902_4_ex3_��� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("A �Է�");
		int a = s.nextInt();
		System.out.println("B �Է�");
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
