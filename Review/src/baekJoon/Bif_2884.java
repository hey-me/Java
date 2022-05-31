package baekJoon;

import java.util.Scanner;

public class Bif_2884 {

	public static void main(String[] args) {

//		45분 일찍 알람설정하기
		Scanner s = new Scanner(System.in);
		System.out.print("시 :");
		int h = s.nextInt();
		System.out.print("분 :");
		int m = s.nextInt();

		if (h != 0 && m >= 45) {
			System.out.print(h + " ");
			System.out.println(m - 45);
		}
		if (h != 0 && m < 45) {
			System.out.print(h - 1 + " ");
			System.out.println(60 - (45 - m));
		}
		if (h == 0 && m < 45) {
			System.out.print("23 ");
			System.out.println(60 - (45 - m));
		}

	}

}
