package ch05_참조타입;

import java.util.Scanner;

public class P200_배열_확인문제6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(s.next());

			if (selectNo == 1) {
				System.out.print("학생수는?");
				studentNum = s.nextInt();
				System.out.println("학생수> " + studentNum);

			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "번 학생 점수는?");
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
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double) sum / studentNum);

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}
}
