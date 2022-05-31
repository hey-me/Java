package ch03_연산자.예제;

public class P121_ex_CompareOperator {

	public static void main(String[] args) {

		//*1
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // T 비교연산자에서 연산 수행하기 전에 피연산자의 타입을 일치시킴

			// 추가
			double vv = v2;
			System.out.println(vv);
		
		//*2
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // F
		System.out.println((float) v4 == v5); // T
		System.out.println(v4 == (double) v5); // F

			//추가
			double vvv=v5;
			System.out.println(v4);
			System.out.println(v5);
			System.out.println(vvv); //오차값 발생하므로 위에서 False나옴

	}

}
