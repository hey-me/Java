package ch03_������;

public class P119_�񱳿����� {

	public static void main(String[] args) {

		
//		**�񱳿����ڿ��� ���� �����ϱ� ���� �ǿ������� Ÿ���� ��ġ��Ŵ
		
		int a=65;
		int b=66;
		boolean c;
		c=a==b; // a==b�� ���� Ȯ��, ���� false
		c=a>=b; //false

		c = a!=b; //(a�� b�� ���� ������?) 
		
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // T   �񱳿����ڿ��� ���� �����ϱ� ���� �ǿ������� Ÿ���� ��ġ��Ŵ

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // F
		System.out.println((float) v4 == v5); // T
		System.out.println(v4 == (double) v5); // F
		
	}

}
