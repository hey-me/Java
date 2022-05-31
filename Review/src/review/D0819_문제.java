package review;

import java.util.Scanner;

public class D0819_문제 {

	public static void main(String[] args) {

		//d영어 대문자를 입력받아 입력받은 문자부터 Z까지 출력되게 하시오
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("영문대문자를 입력하세요.");
		String str = s.nextLine();
		char ch = str.charAt(0);
		
		for (char i = ch ; i <= 'Z'; i++) {
			System.out.println(i);
		}
		
	}

}
