package baekJoon;

import java.util.Scanner;

public class Bfor_2438 {

	public static void main(String[] args) {
//		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		Scanner s = new Scanner(System.in);
		System.out.print("N : ");
		int N = s.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
