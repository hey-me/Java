package ch03_������;

public class P121_�������� {

	public static void main(String[] args) {

//		 �������� (boolean Ÿ��)
// 			NOT���� ���� ! 
//			AND���� (����)  &
//				True & True => T
//				True & False =>F
//				False & True =>F
//				False& False =>F
//			OR���� (����)   | (shift + \)
//				True & True => T
//				True & False => T
//				False & True => T
//				False& False => F
//				&�� |�� �ϳ��� �յ� �� ���,
//				&&, || �ΰ��϶� �տ� False�� �ڿ� ��� ����.
//			XOR���� (���߿�...)

		int a = 65, b = 66;
		boolean c;

		c = ++a < b;

		System.out.println(a); // a=66
		System.out.println(b); // 66
		System.out.println(c); // False

		c = (a++ >= 60) & (b++ == 67); // a=66 b=67 //b++�϶��� b==67�� ���� ����ϹǷ� False
										// ++b�� ++b�� ��������Ͽ� 67==67�̹Ƿ� True
		c = (a++ >= 60) && (++b == 67); // a=66 b=66 /&& ..&�� 2���� �ڿ��� ���� ����.

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
