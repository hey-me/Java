package ch02_������Ÿ��;

public class Ex03_���� {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;
		// ������ x,y�� ���� ���� �����̱� ������ int x,y;���� �ᵵ ������.
		System.out.println("x : " + x + ", y : " + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y : " + y);
		/*
		 * ������ ���� �ֱٿ� �Էµ� ������ ���� ��������(���簰�� �������� ��������) int z = x*2; int q=5; x = q;
		 * System.out.println("z:" + z + ", x:" + x);
		 */

		int a = 1, b = 2, c = 3, d = 4;
		int tem = a;
		a = b;
		b = c;
		c = d;
		d = tem;
		System.out.println("a : " + a + ", b : " + b + ", c : " + c + ", d : " + d);
		// ���� ��Ȳ���� ��쿡�� a�� ���� ������ �����ߴ� ���� �ٸ��� ������ �ٸ� �����ٰ� �����ص� ���� ����ؾ��Ѵ�.

	}

}
