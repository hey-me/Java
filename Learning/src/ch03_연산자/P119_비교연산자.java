package ch03_연산자;

public class P119_비교연산자 {

	public static void main(String[] args) {

		
//		**비교연산자에서 연산 수행하기 전에 피연산자의 타입을 일치시킴
		
		int a=65;
		int b=66;
		boolean c;
		c=a==b; // a==b를 먼저 확인, 따라서 false
		c=a>=b; //false

		c = a!=b; //(a와 b가 같지 않은가?) 
		
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // T   비교연산자에서 연산 수행하기 전에 피연산자의 타입을 일치시킴

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // F
		System.out.println((float) v4 == v5); // T
		System.out.println(v4 == (double) v5); // F
		
	}

}
