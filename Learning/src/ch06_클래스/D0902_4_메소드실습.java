package ch06_Ŭ����;

import java.util.Scanner;

public class D0902_4_�޼ҵ�ǽ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�");
		int a = s.nextInt();
		System.out.println(age(a));

	}

	private static int age(int a) {
		int age = 2021 - a + 1;
		return age;
	}

}
