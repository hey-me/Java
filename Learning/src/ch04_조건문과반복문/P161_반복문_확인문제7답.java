package ch04_조건문과반복문;

import java.util.Scanner;

public class P161_반복문_확인문제7답 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner s = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			//String str1 = s.nextLine();
			int str = Integer.parseInt(s.nextLine());
			switch (str) {
			case 1:
				System.out.print("예금액>");
				balance += Integer.parseInt(s.nextLine());
				break;
			case 2:
				System.out.print("출금액>");
				balance -= Integer.parseInt(s.nextLine());
				break;
			case 3:
				System.out.println("잔고>"+balance);
				break;
			default:
				System.out.println();
				run=false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
