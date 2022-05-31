package baekJoon;

import java.util.Scanner;

public class Bif_2753 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("연도를 입력하세요");
		int year = s.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			year = 1;
		}
		if (year % 400 == 0) {
			year = 1;
		} else {
			year = 0;
		}
		
		System.out.println(year);
	}

}
