package ch02_������Ÿ��;

public class P83_���ڿ�����Ÿ�Ժ�ȯ {

	public static void main(String[] args) {

		String str = "10";

		byte value = Byte.parseByte(str); // str�� byte�� ��������ȯ

		short s1 = Short.parseShort(str);

		int s2 = Integer.parseInt(str);

		System.out.println(value);
		System.out.println(s1);
		System.out.println(s2);

		// NumberFormatException. Value out of range
		String a = "1000";
		byte b = Byte.parseByte(a);
			// byte�� 1000�� ���� ���ϹǷ� ����... �������Ҷ�(�ۼ��Ҷ�)�� ������ ������ ���࿡�� ����
		System.out.println(a);

		// String " "�ȿ� ���ڰ� �ƴϰ� ���ڸ� parse�� ���� �� ������ ����

		String c=String.valueOf(3);
		System.out.println(c);
		
	}

}
