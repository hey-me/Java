package d0820;

import java.util.Scanner;

public class D0820_19 {

	public static void main(String[] args) {

	
		Scanner s = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요.(111111-1111111)");
		String str = s.nextLine();

		char a = str.charAt(7);
		String b = (a == '1' || a == '3') ? " 남자" : " 여자";
		String c = (a == '1' || a == '2') ? "2000년 이전" : "2000년 이후";
		System.out.println(c + b);

	}

}
