package ch04_조건문과반복문;

import java.util.Scanner;

public class P140_if와scanner사용 {

	public static void matavgin(String[] avgrgs) {

//		int kor = 67, mat = 65;

		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요.");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요.");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요.");
		int mat = s.nextInt();
		
		int avg = (kor + eng + mat)/3;
		
		if (avg>=90) {
			System.out.println("등급은 avg입니다.");
		}	else if (avg>=80) {
			System.out.println("등급은 B입니다.");
		}	else if (avg>=70) {
			System.out.println("등급은 C입니다.");
		}	else if (avg>=60) {
			System.out.println("등급은 D입니다.");
		}	else {
			System.out.println("등급은 F입니다.");
		}

	}

}
