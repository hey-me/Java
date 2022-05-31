package ch10_예외;

import java.util.Scanner;


public class D1013_03_03 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("첫번쨰 입력:");
		int a=s.nextInt();
		System.out.print("두번쨰 입력:");
		while(true) {
		try {
			int b=s.nextInt();
			System.out.println(a/b);
			
			break;
			} catch(ArithmeticException e) {	//java.lang패키지는 import를 안해도 쓸 수 있는 패키지임
				System.out.println("0을 입력할 수 없다");
			}
		}
	}

}
