package ch05_����Ÿ��;

import java.util.Scanner;

public class P200_�迭_Ȯ�ι���6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����>");

			int selectNo = Integer.parseInt(s.next());

			if (selectNo == 1) {
				System.out.print("�л�����?");
				studentNum = s.nextInt();
				System.out.println("�л���> " + studentNum);

			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "�� �л� ������?");
					scores[i] = s.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}

			} else if (selectNo == 4) {
				int max = 0, sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + (double) sum / studentNum);

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");

	}
}
