package ch05_참조타입;

import java.util.Scanner;

public class D0825_2_배열_연습문제5 {

	public static void main(String[] args) {

//		5. Scanner로 남겨줄 금액을 입력받고 필요한 동전의 개수를 출력하세요.
//		   - 동전의 종류는 500, 100, 50, 10, 5, 1 총 6종류
//		   - 출력형식
//		     입력받은 금액 : 737
//		     500원 개수 : 1
//		     100원 개수 : 2
//		     50원 개수 : 0
//		     10원 개수 : 3
//		     5원 개수 : 1
//		     1원 개수 : 2
//	**	
		Scanner s = new Scanner(System.in);
		System.out.print("남겨 줄 금액을 입력하세요.");
		int n = s.nextInt();
		int amout = n;
		int[] don = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = new int[6];

		for (int i = 0; i < don.length; i++) {

			cnt[i] = n / don[i];
			n = n % don[i];

		}
		System.out.println("입력 받은 금액 : " + amout);
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(don[i] + "의 개수는 : " + cnt[i] + "개");
		}

//	**	배열 안쓰고...
//		Scanner s = new Scanner(System.in);
//		System.out.print("남겨 줄 금액을 입력하세요.");
//		int n = s.nextInt();
//		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
////		for (int i = 0; i < 6; i++) {
////
////		}
//		if (n >= 500) {
//			n1 = n / 500;
//			n2 = n % 500 / 100;
//			n3 = n % 500 % 100 / 50;
//			n4 = n % 500 % 100 % 50 / 10;
//			n5 = n % 500 % 100 % 50 % 10 / 5;
//			n6 = n % 500 % 100 % 50 % 10 % 5;
//		}
//		System.out.println("500원의 개수 : " + n1);
//		System.out.println("100원의 개수 : " + n2);
//		System.out.println("50원의 개수 : " + n3);
//		System.out.println("10원의 개수 : " + n4);
//		System.out.println("5원의 개수 : " + n5);
//		System.out.println("1원의 개수 : " + n6);

	}

}
