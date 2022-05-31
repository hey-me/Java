package ch10_예외;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D1013_03_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		try {
//		System.out.print("첫번쨰 숫자:");
//		int a=s.nextInt();
//		System.out.print("두번쨰 숫자:");
//		int b=s.nextInt();
//		System.out.print("세번쨰 숫자:");
//		int c=s.nextInt(); 					//같은 구간을 for문으로 사용 가능
//		System.out.println(a+b+c);
//		} catch(NumberFormatException e) {
//			System.out.println("정수를 입력하세요"); 
//		}
		
		int sum=0, num=0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+"번째 숫자 입력: ");
			try {
				num=s.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력하세요"); 
				s.next();
				i--;
				continue;
			}
			sum+=num;
		}
		System.out.println("3개 숫자 합: "+sum);
	}

}
