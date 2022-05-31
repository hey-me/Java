package d0820;

import java.util.Scanner;

public class D0820_45_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("랜덤 값 입력!");
		int n = s.nextInt();
		int d = (int) (Math.random() * 100) + 1;

		while (true) {
			if (n > d) {
				System.out.println("틀렸습니다. 값이 더 작습니다.");
				System.out.println("값 입력 : ");
				n = s.nextInt();
			}
			if (n < d) {
				System.out.println("틀렸습니다. 값이 더 큽니다.");
				System.out.println("값 입력 : ");
				n = s.nextInt();
			}
			if (n == d) {
				System.out.println("정답");
				break;
			}

		}

	}
}
