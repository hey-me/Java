package ch04_조건문과반복문.예제;

public class P143_ex_SwitchChar {

	public static void main(String[] args) {

		
		
		char grade = 'B';

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
