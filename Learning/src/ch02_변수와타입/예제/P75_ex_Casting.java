package ch02_������Ÿ��.����;

public class P75_ex_Casting {

	public static void main(String[] args) {

		int intValue=44032;
		char charValue=(char)intValue;
		System.out.println(charValue);
		
		long longValue=500; //128�϶� (byte)�� ��ȯ�ϸ� -128 \\ 128�� �����Ƿ� ����Ŭ �Ѿ -128
		intValue = (int)longValue; //(short)�ε� ��ȯ ����. long�� �� ũ�Ƿ�
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue =(int)doubleValue;
		System.out.println(intValue);  //3.14�� ������ ����ϴ� 3���� ���
		
		
	}

}
