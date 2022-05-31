package baekJoon;

import java.util.Scanner;

public class Bfor_10871 {

	public static void main(String[] args) {
//		정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		Scanner s = new Scanner(System.in);
		System.out.print("N 입력");
		int N = s.nextInt();
		System.out.print("X입력");
		int X = s.nextInt();
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print(i + 1 + "번쨰 수 입력");
			num[i] = s.nextInt();

		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] < X) {
				System.out.print(num[i] + " ");
			}
		}
	}

}
