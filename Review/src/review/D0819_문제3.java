package review;

import java.util.Scanner;

public class D0819_문제3 {

	public static void main(String[] args) {
		// 'q'가 입력될 때까지 입력된 숫자의 합계를 출력하세요.
		System.out.println((int) ('q'));
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int num = s.nextInt();
		int sum = 0;
//		for (int i = 0; i < args.length; i++) {
//			sum += s.nextInt();
//		}
		while (num != 'q') {
			sum += s.nextInt();
		}
		System.out.println(sum);
	}

}
