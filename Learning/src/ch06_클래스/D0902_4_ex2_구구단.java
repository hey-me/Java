package ch06_Ŭ����;

import java.util.Scanner;

public abstract class D0902_4_ex2_������ {

	public static void main(String[] args) {

	// �Է��� ���� ������ ���
		Scanner s = new Scanner(System.in);
		System.out.print("��� �� : ");
		int dan = s.nextInt();
		gugudan(dan);
	}

	private static void gugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}

}
