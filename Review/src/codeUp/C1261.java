package codeUp;

import java.util.Scanner;

public class C1261 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("1입력");
		int a = s.nextInt();
		System.out.print("2입력");
		int b = s.nextInt();
		System.out.print("3입력");
		int c = s.nextInt();
		int five = 0, t;

		five = a > b ? b : a;
		five = b > c ? c : b;
		five = a > c ? c : a;

		if (a % 5 == 0) {
			System.out.println(a);
			System.exit(0);
		}
		if (b % 5 == 0) {
			System.out.println(b);
			System.exit(0);
		}
		if (c % 5 == 0) {
			System.out.println(c);
			System.exit(0);
		} else {
			System.out.println(0);
		}

	}

}
