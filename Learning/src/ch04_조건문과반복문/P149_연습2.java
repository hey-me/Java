package ch04_조건문과반복문;

import java.util.Scanner;

public class P149_연습2 {

	public static void main(String[] args) {

//		구구단의 단을 Scanner에 입력받고 입력받은 단을 출력
//		입력받은 수 : 5
//		시작 : 3
//		종료 : 8
//		5*3 =15
//		5*4 =20....
//		5*8 = 40
		
		Scanner s= new Scanner(System.in);
		System.out.print("입력받은 수");
		int n1 = s.nextInt();
		System.out.print("시작");
		int n2 = s.nextInt();
		System.out.print("종료");
		int n3 = s.nextInt();
		
		int max = n2>n3 ? n2 : n3 ;
		int min = n2>n3 ? n3 : n2 ;
		for (int i = min  ; i <= max; i++) {
			System.out.printf("%d * %d = %d\n", n1 , i , n1*i);
		}
	
	
	}

}
