package review;

public class P88_Ȯ�ι���9 {

	public static void main(String[] args) {

		// ������ �����ؼ� intŸ�� result������ 9�� ����ǵ��� �ڵ带 �ۼ�

		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";

		int result = (int) var1 + (int) var2 * 2 + (int) var3 + (int) Double.parseDouble(var4);
		//Double.parseDouble() => String�� ���ڷ� 
		//��� ��� ���� �� double�ε� int�� �Է��Ϸ��� ������. => ��� int�� �ٲ���.
		// int result= (int) (var1+(int)var2+var3+Double.parseDouble(var4));
		// int result= (int)(var1+var2+var3+ (int)Double.parseDouble(var4));

		// int var5= (int)Double.parseDouble(var4)+5;

		System.out.println(result);
//		System.out.println(var5);

	}

}
