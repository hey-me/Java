package ch03_������.����;

import java.util.Scanner;

public class P126_ex_ConditionalOperation {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = s.nextInt();
		
		
//		int score = 85;
//		char grade = (score > 90) ? 'A' : 'B'
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' :
			(score > 70) ? 'C' : (score > 60) ? 'D' : 'F');
		System.out.println(score + "���� " + grade + "����Դϴ�.");
		
	}

}
