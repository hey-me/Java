package ch02_������Ÿ��;

public class P74_����Ÿ�Ժ�ȯ {

	public static void main(String[] args) {

		// ����Ÿ�Ժ�ȯ  ��������ȯ

		char a = 150;
		byte b = 127;
		short c = 128;
		int d = 30;
		long e = 15L;

		// c=b;
		b = (byte) c; // (byte)�� �տ� �ٿ���.

		// ���� byte�� 128�� ������ ������ ���µ�. c�� 128�� ������ �� ������ �ȳ���?
		System.out.println(b);
		// ����ϸ� -128�� ����.. ��������ȯ�� �ϸ� ǥ�� ������ ����Ƿ� ����Ŭ �߻��Ͽ� �ϳ� ū �� ����
		//127�� �Ѿ� ���� ���� -128 ����		

	//���� ��� ���� Ÿ�� = (���� ��� ���� Ÿ��)ū ��� ���� Ÿ�� =>���� Ÿ�� ��ȯ //�������� ����� ����Ŭ ���ư�
	
		int intvalue = 65;
		char charvalue = (char)intvalue;
		System.out.println(charvalue);  //"A"�� ��µ�

		double doubleValue=3.14;
		int intValue = (int)doubleValue;
		System.out.println(intValue);  //�Ҽ��� ������ ��ȯ�ϹǷ� �Ҽ��� �� ���ڴ� �߸�. =>3.14�� 3���� ���
		
	}

}
