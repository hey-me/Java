package codeUp;

import java.util.Scanner;

public class C1259아님 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("주민번호를 -를 사용해 입력");
		String str = s.next();
		for (int i = 0; i < str.length(); i++) {
			if (i != 6) {
				System.out.print(str.charAt(i));
			}
		}
		
		
	}
}
