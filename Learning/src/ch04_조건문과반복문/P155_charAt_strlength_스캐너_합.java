package ch04_조건문과반복문;

import java.util.Scanner;

public class P155_charAt_strlength_스캐너_합 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("입력하세요.");
		String str = s.next();
		System.out.println(str.length());
		boolean isNum = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) { // '0', '9' 라고 안하고 0, 9라고 하면 출력시 숫자가 아니라고 나옴(false).
				isNum = false;
			}
		}
		if (isNum) {
			int sum = 0; // str="1234"
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i); // '1'=>35, '0'=>34
				sum = sum + (ch - '0');
			}
			System.out.println(str + "str의 합계 : " + sum);
		} else {
			System.out.println();
		}

	}

}
