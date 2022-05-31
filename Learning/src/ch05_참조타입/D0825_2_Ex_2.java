package ch05_참조타입;

import java.util.Scanner;

public class D0825_2_Ex_2 {

	public static void main(String[] args) {

//		3. 영문소문자와 숫자를 Scanner로 입력받아 암호문을 출력하세요.
//		- 출력예시
//		 입력데이터 : acd214
//		 암호문 : `!@ewt

		Scanner s = new Scanner(System.in);
		System.out.print("영문소문자와 숫자를 입력");
		String input = s.next();
		String result = "";

		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };

		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
//				int index = ch - 'a';
//				result += abcCode[index];
				result += abcCode[ch - 'a'];
			}
			if (ch >= '0' && ch <= '9') {
				int index = ch - '0';
//				result += numCode[index];
				result += numCode[ch - '0'];
			}
		}
		System.out.println(result);
	}

}
