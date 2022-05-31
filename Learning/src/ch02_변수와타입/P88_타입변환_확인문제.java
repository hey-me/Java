package ch02_변수와타입;

public class P88_타입변환_확인문제 {

	public static void main(String[] args) {

	// *연습문제1
		// 변수 num의 값 중에서 백의 자리 이하를 버리는 코드를 만드시오.
		// 만일 변수의 값이 '456'이라면 '400'이 되고, '111'이면 '100'이 된다.

		int num = 333;
		System.out.println(num / 100 * 100);

	// *연습문제2
		// num의 값 중에서 1의 자리만 1로 바꾸는 코드이다.
		// 333이라면 331, 777이라면 771이 된다.

		System.out.println(num / 10 * 10 + 1);

	// *연습문제3
		// 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오
		// c=30, ch=C, f=1.5, l=27000000000, result=true

		byte a = 10;
		byte b = 20;
		// byte c=a+b;
		byte c = (byte) (a + b);  //윗 줄 대신
		char ch = 'A';
		// ch=ch+2;
		ch = (char) (ch + 2);    //윗 줄 대신
		float f = (float)3 / 2; //(float)추가  //계산하면서 int로 되어 1이 나오는데 1.5로 만들기 위해
		long l = 3000 * 3000 * 3000L;   //L추가
		float f2 = 0.1f;
		double d = 0.1; 	
		//double d = (float)0.1; 	//(float)추가하여 false를 true로
		//boolean result = d == f2;   //d를 float으로 형변환함.
		boolean result = (float)d == f2;
		
		System.out.println("c=" + c);
		System.out.println("c=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);

	}

}
