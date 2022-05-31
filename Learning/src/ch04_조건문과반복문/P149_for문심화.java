package ch04_조건문과반복문;

import java.util.Scanner;

public class P149_for문심화 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.print("단을 입력 : ");
		int dan = s.nextInt();
		
		
//		for (int i = 1; i < 10; i++) {
//			System.out.println("5 * "+i +" = "+ i*5 );
//			System.out.printf("5 * %d = %2d\n", i , i*5 );
			
		for (int j = 0; j < 10; j++) {
			System.out.printf("%d * %d = %3d\n", dan, j, dan*j);
		}
			
		
		}
		
	}

