package ch03_연산자;

public class P110_부호_증감연산자 {

	public static void main(String[] args) {

		byte b = 100; // X. byte result = -b; //부호연산자는 연산하면 int가 됨.
		// O. byte result= (byte)-b; // O. int result = -b;

		int a = 10;
		int c = 0;

		c = ++a;
		System.out.println(c);
		System.out.println(a);
		// s=11, a=11
		// s=a++ => s=10, a=11 a를 s에 먼저 대입 후, a에 1더함. s는 10, a는 11

		int q = 10;
		int w = 0;
		int e = 5;
		w = ++q + ++e;
		System.out.println(w); // 17
		System.out.println(q); // 11
		System.out.println(e); // 6

	}

}
