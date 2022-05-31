package ch04_조건문과반복문;

public class P146_조건문_확인문제 {

	public static void main(String[] args) {

//	*	1 - if, switch
//		
//	*	2 - o,o,o,x
//	
//	*	3 - 등급은 B입니다.
		int score = 85;
		System.out.print("등급은 ");
		if (score < 70) {
			System.out.print("D");
		} else if (score < 80) {
			System.out.print("C");
		} else if (score < 90) {
			System.out.print("B");
		} else {
			System.out.print("A");
		}
		System.out.println("입니다.");

//	*	4 - 어떤 혜택을 원하세요?
//			우수회원 혜택을 받으실 수 있습니다.
//			일반회원 혜택을 받으실 수 있습니다.
//			감사합니다.
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'C';
		switch (grade) {
			case 'A': case 'a': System.out.println("VVIP 혜택을 받으실 수 있습니다.");
			case 'B': case 'b': System.out.println("VIP 혜택을 받으실 수 있습니다.");break;
			case 'C': case 'c': System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
			case 'D': case 'd': System.out.println("일반 회원 혜택을 받으실 수 있습니다.");break;
			default:System.out.println("혜택이 없습니다.");
			}
		System.out.println("감사합니다.");
	}

}
