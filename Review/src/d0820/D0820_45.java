package d0820;

import java.util.Scanner;


public class D0820_45 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("랜덤 값 입력!");
		int n = s.nextInt();
		int d = (int) (Math.random() * 100) + 1;

		if (n != d) {
			while (true) {
				System.out.print("다시 시도하세요\n");
				System.out.print("입력");
				n = s.nextInt();
				d= (int) (Math.random() * 100) + 1;
			}
		}
		if (n == d) {
			System.out.println("정답");
		}

	}
}
