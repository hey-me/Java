package ch02_������Ÿ��;

public class P76_�������갭��Ÿ�Ժ�ȯ {

	public static void main(String[] args) {

//		long a=10;
//		short b=20;
//		int d=0;
//		d=(int)a+b;

		short a = 130;
		byte b = 0;
		int c = 0;
		long d = 130;

		c = a + b;
		// c=a+d; //c�� long���� �ٲٱ�/a+d�� int�� �ٲٱ� or d�� int�� �ٲٱ�
		c = (int) (a + d);
		// c=(int)a+d; /a�� int�� �ٲ����� d�� long�̱� ������ ����
		c = a + (int) d;

		System.out.println(c);

		//���ڸ�(���ڸ�) ���ְ� ������ *10  /10 
		//���ڸ� ���ְ� ���� �� *100    /100
	
	}

}
