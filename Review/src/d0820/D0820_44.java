package d0820;

import java.util.Scanner;

public class D0820_44 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		String str = s.next();
		char g1 = str.charAt(0);
		char g2 = str.charAt(1);
		String t = (g2 >= '8' && g2 <= '9') ? "+" : (g2 <= '4' && g2 >= '0') ? "-" : "";
		if (g1 == '9') {
			str = "A";
		} else if (g1 == '8') {
			str = "B";
		} else if (g1 == '7') {
			str = "C";
		} else {
			str = "F";
		}
		System.out.println(t + str);

	}

}
