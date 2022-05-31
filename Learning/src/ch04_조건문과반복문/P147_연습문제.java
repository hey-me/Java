package ch04_조건문과반복문;

import java.util.Scanner;

public class P147_연습문제 {

	public static void main(String[] args) {
//		<입력>
//		필기점수 : 000
//		실기점수 : 000
//		<출력>
//		총점 : 000
//		평균 : 000
//		결과 : 합격 or 불합격
//		결과는 필기가 40점 이상이고 실기가 40점 이상이고 평균이 60점 이상이면 합격, 그렇지 않으면 불합격

		Scanner s = new Scanner(System.in);
		System.out.print("필기점수 :");
		int grade1 = s.nextInt();
		System.out.print("실기점수 :");
		int grade2 = s.nextInt();

		int num1 = grade1 + grade2;
		double num2 = (double) num1 / 2;
		System.out.println("총점 : " + num1);
		System.out.println("평균 : " + num2);

//		if (num2 >= 60) {
//			if (grade1 >= 40 & grade2 >= 40) {
//				System.out.println("결과 : 합격");
//			} else {
//				System.out.println("결과 : 불합격");
//			}
//		} else {
//			System.out.println("결과 : 불합격");

		if (grade1 >= 40 && grade2 >= 40 && num2 >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

}
