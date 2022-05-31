package ch02_변수와타입;

import java.util.Scanner;

public class P89_Ex02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 소수점이하 4자리 수 입력
		System.out.print("첫번째 수 : ");
		double n1 = s.nextDouble();
		System.out.print("두번째 수 : ");
		float n2 = s.nextFloat();

		// 출력되는 값은 소수점이하 3자리로
		System.out.printf("두 수의 합 : %.3f\n", n1 + n2);
		System.out.printf("두 수의 차 : %.3f\n", n1 - n2);
		System.out.printf("두 수의 곱 : %.3f\n", n1 * n2);
		System.out.printf("두 수의 나눗셈 : %.3f", n1 / n2);

	}

}
