package baekJoon;

import java.util.Scanner;

public class B�迭_1546 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �� �Է�");
		int n = s.nextInt();
		int[] N = new int[n];
		for (int i = 0; i < N.length; i++) {
			System.out.print("���� �Է�");
			N[i] = s.nextInt();
		}
		int max = 0;
		for (int i = 0; i < N.length; i++) {
			if (N[i] > max) {
				max = N[i];
			}
		}
		double sum = 0;
		for (int i = 0; i < N.length; i++) {
			sum += (double) N[i] / max * 100;
		}
		System.out.println(sum / n);
	}

}
