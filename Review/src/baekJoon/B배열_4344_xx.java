package baekJoon;

import java.util.Scanner;

public class B�迭_4344_xx {

	public static void main(String[] args) {
//		�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
//	���� �Է�
// 		5
//		5 50 50 70 80 100
//		7 100 95 90 80 70 60 50
//		3 70 90 80
//		3 70 90 81
//		9 100 99 98 97 96 95 94 93 91
//	���� ���
// 		40.000%
//		57.143%
//		33.333%
//		66.667%
//		55.556%

		Scanner s = new Scanner(System.in);
		System.out.print("���̽� �� �Է�");
		int caseNum = s.nextInt();
		double[] rate = new double[caseNum];

		for (int i = 0; i < caseNum; i++) {
			int sum = 0;
			int cnt = 0;
			System.out.print("�л� �� �Է�");
			int stu = s.nextInt();
			int[] score = new int[stu];

			for (int j = 0; j < stu; j++) {
				System.out.print(j + 1 + "��° �л� ���� �Է�");
				score[j] = s.nextInt();
				sum += score[j];
			}
			for (int j = 0; j < score.length; j++) {
				if (score[j] > (double) sum / stu) {
					cnt++;
				}

			}
			rate[i] = (double) cnt / stu * 100;

		}
		for (int j = 0; j < rate.length; j++) {
			System.out.printf("%.3f%%\n", rate[j]);
		}

	}
}
