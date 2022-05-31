package ch04_조건문과반복문;

import java.util.Scanner;

public class P149_연습 {

	public static void main(String[] args) {

		
//		두 수를 입력받아 순서대로 출려가세요 
//	예)	첫 번째 수 : 5
//		두 번째 수 : 13
//		결과 : 5 6 7 8 9 10 11 12 13
//		
//	예)	첫 번째 수 : 10
//		두 번째 수 : 6
//		결과 : 6 7 8 9 10
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("첫 번째 수는?");
		int n1 = s.nextInt();
		System.out.println("두 번째 수는?");
		int n2 = s.nextInt();
		
		int n3 = n1>n2 ? n1 : n2;	 //n3을 max
		int n4 = n1>n2 ? n2 : n1;	 //n4를 min
		for (int i = n4 ; i <= n3; i++) {
			System.out.print(i + " ");
			//System.out.printf("%d " ,i);
		}
		
		
		
		
		
		
		
		
	}

}
