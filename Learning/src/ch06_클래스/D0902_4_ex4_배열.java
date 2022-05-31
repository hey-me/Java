package ch06_클래스;

import java.util.Scanner;

public class D0902_4_ex4_배열 {

//	public static void main(String[] args) {
//
//		Scanner s = new Scanner(System.in);
//		System.out.print("n1입력");
//		int n1 = s.nextInt();
//		System.out.print("n2입력");
//		int n2 = s.nextInt();
//		System.out.print("n3입력");
//		int n3 = s.nextInt();
//		System.out.print("n4입력");
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
			System.out.print(i + 1 + "번째 num입력");
			num[i] = s.nextInt();
		}
		int max = maxArr(num);
		System.out.println(maxArr(num));
		System.out.println(max);

		maxArr(new int[5]); // int[] num = new int [5] 와 마찬가지.
		maxArr(new int[] { 1, 2, 3, 4, 5 }); // int[] num = new int[] {1,2,3,4,5}
		maxArr(num); // => 배열이 전부 maxArr로.
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
