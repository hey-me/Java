package ch04_조건문과반복문;

public class P134_if문 {

	public static void main(String[] args) {

		// if //
		int a = 10, b = 0;

		if (a >= 11) {
			a++;
		}
		b = b + a;
//		위와 동일
//		if (a>=11)
//			a++;   하나만 실행할 경우 중괄호로 묶어주지 않아도 됨.
//			b=b+a;
		System.out.println(a);
		System.out.println(b);

		
		// if-else //
		int c = 10, d = 0;
		d = c % 2;
		String result = "";

		if (c == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println(result);

		
		// if-else if-else // 4개의 실행문이 모두 if문 안에 있으므로 하나만 실행 => 선택문이다~
		int score = 75;
		if (score >= 80) {
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("등급은 B입니다.");
		} else if (score >=70)	{
			System.out.println("등급은 C입니다.");
		} else	{
			System.out.println("등급은 F입니다.");
		}
		
		//	Math.random()
//			0.0과 0.1 사이에 속하는 double 타입의 난수 하나를 리턴함.(랜덤한 수)
//			0.0 <= Math.random() <0
	}
}
