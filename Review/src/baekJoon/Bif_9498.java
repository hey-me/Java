package baekJoon;

import java.util.Scanner;

public class Bif_9498 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ �Է�");
		int score = s.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println("������ " + score + "��, ����� A�Դϴ�.");
		}
		if (score >= 80 && score < 90) {
			System.out.println("������ " + score + "��, ����� B�Դϴ�.");
		}
		if (score >= 70 && score < 80) {
			System.out.println("������ " + score + "��, ����� C�Դϴ�.");
		}
		if (score >= 60 && score < 70) {
			System.out.println("������ " + score + "��, ����� D�Դϴ�.");
		}
		if (score < 60) {
			System.out.println("������ " + score + "��, ����� F�Դϴ�.");
		}

	}

}
