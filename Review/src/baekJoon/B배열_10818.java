package baekJoon;

import java.util.Scanner;

public class B배열_10818 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("정수의 개수는?");
		int N = s.nextInt();
		int[] ar = new int[N];

		for (int i = 0; i < ar.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			ar[i] = s.nextInt();
		}

		int max = 0;
		int min = 0;
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
			if (min > ar[i]) {
				min = ar[i];
			}

		}
		System.out.print(min + " " + max);

	}

}
