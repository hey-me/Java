package review;

import java.util.Scanner;


public class Test1_9_re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("입력");
		int a = s.nextInt();
		
		char b = (a>=97) ? (char)(a-32) : (a<=64) ? (char)(a+32) : (char)(a);
		// 영문자 추가하려면 논리연산자 사용
		System.out.println(b);
		
		
//		if (a<97) {
//			System.out.println(a+32);
//			
//		}	else {
//			System.out.println(a);
//		}
		
	}

}
