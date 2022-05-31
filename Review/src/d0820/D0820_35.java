package d0820;

import java.util.Scanner;

public class D0820_35 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("영문 소문자를 1글자 입력하세요");
		String str = s.next();
		char ch = str.charAt(0);
		
		for (char i = 'z'; i >= ch ; i--) {
			System.out.println(i);
		}
		
	}

}
