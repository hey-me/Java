package codeUp;

import java.util.Scanner;

public class C1259 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�");
		int n = s.nextInt();
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
