package ch02_������Ÿ��.����;

public class P74_ex_Promotion {

	public static void main(String[] args) {

		byte byteValue =10;  //128�̸� ������. ���� �Ѿ
		int intValue = byteValue;
		System.out.println("intValue: "+intValue); //10
		
		char charValue= '��';
		intValue = charValue; //������ �ѹ���(���� int ___���ϰ� �׳� ��.)
		// short shortValue=charValue; (����/short�� �뷫-30000~30000, char�� 0~65535)
		//���� �ȳ����� (short)�� ���� ��ȯ.. but ���� ��ȭ�� ���� �� ����.
		short shortValue=(short)charValue;
		System.out.println("���� �����ڵ�: "+ intValue); //44032
		
		intValue=50;
		long longValue=intValue; //int=>long
		System.out.println("longValue: "+longValue); //50
		
		longValue=100;
		float floatValue = longValue; //long=>float 
		System.out.println("floatValue: "+floatValue); //100
		
		floatValue=100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+ doubleValue); //100.5
		
		
	}

}
