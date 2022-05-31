package baekJoon;

import java.util.Scanner;

public class B문자열_숫자의합11720 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("숫자의 개수는?");
		int N = s.nextInt();

		System.out.print("숫자 입력");
		String str = s.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
