package review;


public class D0813_ox문제 {

	public static void main(String[] args) {

//		1. 다음 중 출력시 셋 중에 결과가 다른 하나는 2번이다. 맞으면 O, 틀리면 X
//		1-
		System.out.println((float) 11 / 2);
//		2-
		System.out.println(11 / (float) 2);
//		3-
		System.out.println((float) (11 / 2));
//		답 : X

//		2. 맞으면 O, 틀리면 X
		System.out.println("java");
		//System.out.println("ja" + va);
		//System.out.println(ja + "va");
		System.out.println("j" + "ava");

//		출력시
//		java
//		java
//		java
//		java
//		답 : X
//
//		3. 맞으면 O, 틀리면 X
		int num1 = 3, num2 = 5;
		double result = num1 / num2;
		System.out.println(result);

//		출력시
//		0.6
//		답 : X

//		4. 맞으면 O, 틀리면 X
		int x = 10;
		int y = 5;
		x++;
		y--;

		System.out.println(5 + y--);
		System.out.println(3 + ++x);
		System.out.println(y-- + ++x);
		System.out.println(x);
		System.out.println(y);
		int z = x % y;
		System.out.println(z);

//		z=0
//		답 = X

		
//		5. 맞으면 O, 틀리면 X
		int a = 5, b = 1;
		System.out.println((a == 5) && (b == 5));
		System.out.println((a == 5) || (b == 5));
		System.out.println(!(a == 5));

//		출력시
//		false
//		true
//		false
//		답 O  
	}

}
