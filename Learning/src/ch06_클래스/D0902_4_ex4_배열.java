package ch06_Ŭ����;

import java.util.Scanner;

public class D0902_4_ex4_�迭 {

//	public static void main(String[] args) {
//
//		Scanner s = new Scanner(System.in);
//		System.out.print("n1�Է�");
//		int n1 = s.nextInt();
//		System.out.print("n2�Է�");
//		int n2 = s.nextInt();
//		System.out.print("n3�Է�");
//		int n3 = s.nextInt();
//		System.out.print("n4�Է�");
//		int n4 = s.nextInt();
//
//		System.out.println(max(n1, n2, n3, n4));
//		;
//
//	}
//
//	private static int max(int n1, int n2, int n3, int n4) {
//		int max = 0;
//		if (n1 > n2) {
//		} //
//		return max;
//	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] num = new int[4];
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "��° num�Է�");
			num[i] = s.nextInt();
		}
		int max = maxArr(num);
		System.out.println(maxArr(num));
		System.out.println(max);

		maxArr(new int[5]); // int[] num = new int [5] �� ��������.
		maxArr(new int[] { 1, 2, 3, 4, 5 }); // int[] num = new int[] {1,2,3,4,5}
		maxArr(num); // => �迭�� ���� maxArr��.
	}

	private static int maxArr(int[] num) {
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		return max;

	}

}
