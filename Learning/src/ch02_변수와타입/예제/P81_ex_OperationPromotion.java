package ch02_������Ÿ��.����;

public class P81_ex_OperationPromotion {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2;
		byte byteValue3 = (byte) (byteValue1 + byteValue2);
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3= charValue1+charValue2;
		char charValue3 = (char) (charValue1 + charValue2);
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�=" + intValue2); // 65+1
		System.out.println("��¹���=" + (char) intValue2); // 66�̹Ƿ� B

		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);

		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;  (int)�� ��ȯ
		double doubleValue=intValue5/4.0;
		System.out.println(doubleValue);
		
		int x=1;
		int y=2;
		double result1 = x/y;
		double result2 = (double)x/y;
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
