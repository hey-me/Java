package baekJoon;

import java.util.Scanner;

public class Bif_9498 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("시험 점수를 입력");
		int score = s.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println("점수는 " + score + "점, 등급은 A입니다.");
		}
		if (score >= 80 && score < 90) {
			System.out.println("점수는 " + score + "점, 등급은 B입니다.");
		}
		if (score >= 70 && score < 80) {
			System.out.println("점수는 " + score + "점, 등급은 C입니다.");
		}
		if (score >= 60 && score < 70) {
			System.out.println("점수는 " + score + "점, 등급은 D입니다.");
		}
		if (score < 60) {
			System.out.println("점수는 " + score + "점, 등급은 F입니다.");
		}

	}

}
