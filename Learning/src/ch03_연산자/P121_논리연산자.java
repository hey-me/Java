package ch03_연산자;

public class P121_논리연산자 {

	public static void main(String[] args) {

//		 논리연산자 (boolean 타입)
// 			NOT연산 부정 ! 
//			AND연산 (논리곱)  &
//				True & True => T
//				True & False =>F
//				False & True =>F
//				False& False =>F
//			OR연산 (논리합)   | (shift + \)
//				True & True => T
//				True & False => T
//				False & True => T
//				False& False => F
//				&나 |가 하나면 앞뒤 다 계산,
//				&&, || 두개일때 앞에 False면 뒤에 계산 안함.
//			XOR연산 (나중에...)

		int a = 65, b = 66;
		boolean c;

		c = ++a < b;

		System.out.println(a); // a=66
		System.out.println(b); // 66
		System.out.println(c); // False

		c = (a++ >= 60) & (b++ == 67); // a=66 b=67 //b++일때는 b==67을 먼저 계산하므로 False
										// ++b면 ++b를 먼저계산하여 67==67이므로 True
		c = (a++ >= 60) && (++b == 67); // a=66 b=66 /&& ..&가 2개면 뒤에꺼 연산 안함.

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		c = (a++ >= 70) & (b++ == 67);
		c = (++a >= 70) && (++b > 67);
		c = (++a <= 70) && (++b > 67);
		
		c= (a++>=60) | ((b++==67));
		c= (a++>=60) || ((b++==67));
		
		
	}

}
