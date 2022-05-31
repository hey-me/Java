package ch03_연산자.예제;

import java.util.Scanner;

public class P126_ex_ConditionalOperation {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = s.nextInt();
		
		
//		int score = 85;
//		char grade = (score > 90) ? 'A' : 'B'
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' :
			(score > 70) ? 'C' : (score > 60) ? 'D' : 'F');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	}

}
