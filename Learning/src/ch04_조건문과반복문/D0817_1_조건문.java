package ch04_조건문과반복문;

public class D0817_1_조건문 {

	public static void main(String[] args) {

//	*	if 조건식에 올 수 있는 요소 
//			-true / false 값을 산출하는 연산식
//			-boolean 타입 변수
//		
//		조건식이 true일때는 if 블록 실행
//		조건식이 false일때는 else 블록 실행

//	*	if-else if-else문
//		조건식이 여러개인 if문

		// * if //
		int a = 10, b = 0;

		if (a >= 11) {
			a++;
		}
		b = b + a;
//				위와 동일
//				if (a>=11)
//					a++;   하나만 실행할 경우 중괄호로 묶어주지 않아도 됨.
//					b=b+a;
		System.out.println(a);
		System.out.println(b);

		// * if-else //
		int c = 10, d = 0;
		d = c % 2;
		String result = "";

		if (c == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println(result);

		// * if-else if-else // 4개의 실행문이 모두 if문 안에 있으므로 하나만 실행 => 선택문이다~
		int score = 75;
		if (score >= 80) {
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("등급은 F입니다.");
		}

		// * Math.random() .....Math.PI(파이값)..Math.E(e값)
//			0.0과 0.1 사이에 속하는 double 타입의 난수 하나를 리턴함.(랜덤한 수)
//			0.0 <= Math.random() < 1.0

		// start 부터 시작하는 n개의 정수 중에서 임의의 정수를 하나 얻기 위한 연산식
//				int num = (int) (Math.random() * n ) + start;	

//			ex) 1~10사이의 정수
//				0.0 *10 <=        Math.random() * 10	< 1.0 *10
//				(int)0.0<= (int) (Math.random() * 10)   < (int)10.0
//				0+1		<= (int) (Math.random() * 10) + 1 < 10+1
//				1		<= (int) (Math.random() * 10) + 1 < 11
//			ex) 주사위 번호 (1~6)
//				int num = (int) (Math.random() * 6) + 1;
	}

}
