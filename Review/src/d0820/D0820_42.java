package d0820;

import java.util.Scanner;

public class D0820_42 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("단을 입력");
		int dan = s.nextInt();

		for (int i = 9; i >= 1; i--) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}

}
