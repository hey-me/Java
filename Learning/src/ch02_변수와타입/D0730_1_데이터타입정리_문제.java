package ch02_������Ÿ��;

public class D0730_1_������Ÿ������_���� {

	public static void main(String[] args) {

		/*
		 * System.out.println('A'+1); System.out.println('A'+"1");
		 * System.out.println("A"+1); System.out.println(5+"����"+1);
		 * System.out.println('B'+'C');
		 * 
		 * 
		 * 1. 'A'�� ���� A�� �ڵ尪�� 65 + 1 2. 'A'�� ���� A�� �ڵ尪������ ���� 1�� ""�ȿ� �ֱ� ������ String�� �Ǿ�
		 * �����ϴ� ���Ҹ� �Ѵ�. 3. String A�� �ֱ� ������ ���Ḹ �Ѵ�. 4. String ���� ������ ���Ḹ �Ѵ�. 5. ���� 'B' ��
		 * 'C' �� �ڵ尪�� ���ͼ� �Ǽ� + �Ǽ� �̱� ������ ������ �Ѵ�.
		 */
		// 66, A1, A1, 5����1, 133

		int a = 5, b = 10, c = 15, d = 20;
		char c1 = 'A', c2 = 'B', c3 = 'C';

		System.out.println(a + b);
		System.out.println('A' + b);
		System.out.println(a + c1);
		System.out.println(b + "" + c2);
		System.out.println(a + c2 + b);
		System.out.println("a" + b + c3);
		System.out.println(a + b + c + d + "d" + d);
		// ��ȣ�ȿ� �ִ� �Ŀ� ""�� �ִٰ� ������ String�� �Ǵ°� �ƴ϶� ������� ����� �ϸ鼭 String�� �����ºκп��� ������ �ǹ̷�
		// �ٲ��.

		// 15, 75, 70, 10B, 81, a10C, 50d20

		/*
		 * ������ Ÿ�� -String => ���ڿ� -���� => byte : 1 byte = 8 bit => short : 2 byte = 16 bit
		 * => char : 2 byte = 16 bit ( ����ǥ�� ����, �����ڵ� ) => int : 4 byte = 32 bit ( ���� Ÿ����
		 * ��ǥ���� ���� ) => long : 8 byte = 64 bit ( �� ��� �ڿ� L�� �پ�� �ν��� �����ϴ�. ) ������ ũ�Ⱑ �۾Ƶ�
		 * �ڿ� L�� ���̸� long Ÿ���� �ȴ�.
		 * 
		 * -�Ǽ� => float : 4 byte = 32 bit ( ������ long ó�� float�� �ڿ� f�� �پ�� �ν��� �����ϴ�. ) =>
		 * double : 8 byte = 64 bit ( �⺻���� ����Ѵ�. )
		 */

//		float x = 100;
//		float y = 1.5F;
//		double z = 1.5;

	}

}
