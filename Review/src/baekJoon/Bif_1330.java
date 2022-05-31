package baekJoon;

import java.util.Scanner;

public class Bif_1330 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("A 입력 ");
		int a = s.nextInt();
		System.out.print("B 입력 ");
		int b = s.nextInt();

		if (a > b) {
			System.out.println(">");
		}
		if (a < b) {
			System.out.println("<");
		}
		if (a == b) {
			System.out.println("==");
		}

	}

}
