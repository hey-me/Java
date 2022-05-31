package codeUp;

import java.util.Scanner;

public class C1224_분수비교 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();

		if (((double) a / b) > ((double) c / d)) {
			System.out.println(">");
		} else if (((double) a / b) == ((double) c / d)) {
			System.out.println("=");
		} else if (((double) a / b) < ((double) c / d)) {
			System.out.println("<");
		}
	}

}
