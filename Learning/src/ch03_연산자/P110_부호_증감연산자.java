package ch03_������;

public class P110_��ȣ_���������� {

	public static void main(String[] args) {

		byte b = 100; // X. byte result = -b; //��ȣ�����ڴ� �����ϸ� int�� ��.
		// O. byte result= (byte)-b; // O. int result = -b;

		int a = 10;
		int c = 0;

		c = ++a;
		System.out.println(c);
		System.out.println(a);
		// s=11, a=11
		// s=a++ => s=10, a=11 a�� s�� ���� ���� ��, a�� 1����. s�� 10, a�� 11

		int q = 10;
		int w = 0;
		int e = 5;
		w = ++q + ++e;
		System.out.println(w); // 17
		System.out.println(q); // 11
		System.out.println(e); // 6

	}

}
