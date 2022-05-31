package d0820;

import java.util.Scanner;

public class D0820_33 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("영문대문자 1글자를 입력하세요");
		String str = s.next();
		char ch = str.charAt(0);

		for (char i = 'A'; i <= ch; i++) {
			System.out.println(i);
		}

	}

}
