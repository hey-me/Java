package ch02_������Ÿ��;

public class P88_Ÿ�Ժ�ȯ_Ȯ�ι��� {

	public static void main(String[] args) {

	// *��������1
		// ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ带 ����ÿ�.
		// ���� ������ ���� '456'�̶�� '400'�� �ǰ�, '111'�̸� '100'�� �ȴ�.

		int num = 333;
		System.out.println(num / 100 * 100);

	// *��������2
		// num�� �� �߿��� 1�� �ڸ��� 1�� �ٲٴ� �ڵ��̴�.
		// 333�̶�� 331, 777�̶�� 771�� �ȴ�.

		System.out.println(num / 10 * 10 + 1);

	// *��������3
		// �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�
		// c=30, ch=C, f=1.5, l=27000000000, result=true

		byte a = 10;
		byte b = 20;
		// byte c=a+b;
		byte c = (byte) (a + b);  //�� �� ���
		char ch = 'A';
		// ch=ch+2;
		ch = (char) (ch + 2);    //�� �� ���
		float f = (float)3 / 2; //(float)�߰�  //����ϸ鼭 int�� �Ǿ� 1�� �����µ� 1.5�� ����� ����
		long l = 3000 * 3000 * 3000L;   //L�߰�
		float f2 = 0.1f;
		double d = 0.1; 	
		//double d = (float)0.1; 	//(float)�߰��Ͽ� false�� true��
		//boolean result = d == f2;   //d�� float���� ����ȯ��.
		boolean result = (float)d == f2;
		
		System.out.println("c=" + c);
		System.out.println("c=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);

	}

}
