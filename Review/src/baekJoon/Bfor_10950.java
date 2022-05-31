package baekJoon;

import java.util.Scanner;

public class Bfor_10950 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("테스트 케이스 : ");
		int T = s.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.print("A : ");
			int A = s.nextInt();
			System.out.print("B : ");
			int B = s.nextInt();
			System.out.println(A + B);

		}

	}

}
