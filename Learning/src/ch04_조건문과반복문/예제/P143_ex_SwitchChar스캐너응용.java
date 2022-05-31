package ch04_조건문과반복문.예제;

import java.util.Scanner;

public class P143_ex_SwitchChar스캐너응용 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("학점 입력 : ");
//		String num = s.next();
//		char grade = num.charAt(0);
		char grade = s.next().charAt(0); // 위 두 줄을 하나로 하면! s.next().charAt(0)

//		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원 입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원 입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}
}
