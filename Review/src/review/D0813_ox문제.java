package review;


public class D0813_ox���� {

	public static void main(String[] args) {

//		1. ���� �� ��½� �� �߿� ����� �ٸ� �ϳ��� 2���̴�. ������ O, Ʋ���� X
//		1-
		System.out.println((float) 11 / 2);
//		2-
		System.out.println(11 / (float) 2);
//		3-
		System.out.println((float) (11 / 2));
//		�� : X

//		2. ������ O, Ʋ���� X
		System.out.println("java");
		//System.out.println("ja" + va);
		//System.out.println(ja + "va");
		System.out.println("j" + "ava");

//		��½�
//		java
//		java
//		java
//		java
//		�� : X
//
//		3. ������ O, Ʋ���� X
		int num1 = 3, num2 = 5;
		double result = num1 / num2;
		System.out.println(result);

//		��½�
//		0.6
//		�� : X

//		4. ������ O, Ʋ���� X
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
//		�� = X

		
//		5. ������ O, Ʋ���� X
		int a = 5, b = 1;
		System.out.println((a == 5) && (b == 5));
		System.out.println((a == 5) || (b == 5));
		System.out.println(!(a == 5));

//		��½�
//		false
//		true
//		false
//		�� O  
	}

}
