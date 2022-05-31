package ch06_클래스;

import java.util.Scanner;

public class D0902_4_메소드실습 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("생년 입력");
		int a = s.nextInt();
		System.out.println(age(a));

	}

	private static int age(int a) {
		int age = 2021 - a + 1;
		return age;
	}

}
