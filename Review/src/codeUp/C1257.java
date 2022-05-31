package codeUp;

import java.util.Scanner;

public class C1257 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 수 입력");
		int n1 = s.nextInt();
		System.out.print("두 번째 수 입력");
		int n2 = s.nextInt();
		int t = 0;

		if (n1 > n2) {
			t = n1;
			n1 = n2;
			n2 = t;
		}

		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}

		}

	}

}
