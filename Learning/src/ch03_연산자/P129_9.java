package ch03_������;

import java.util.Scanner;

public class P129_9 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ��: ");
		String str1 = s.next();
		//double n1 = Double.parseDouble(str1);
		double n1 = Double.parseDouble(s.next());  // str1�̶�� �� ���� s.next()�� ��� ����. ������ �ٷ� ����ϴ� �Ͱ� ���� �Ʒ� int���� Ȯ��
		
		System.out.print("�� ��° ��: ");
		String str2 = s.next();
		double n2 = Double.parseDouble(s.next());
		
		if (n2 == 0.0) {
			System.out.println("���:" + n1 / n2);
		} else {
			System.out.println("���:���Ѵ�");
		}
		
//	**  int ����
//		int a = 5;
//		int b = 10;
//		int c = a + b;
//		System.out.println(c);
//		// = System.out.println(a + b);
	}
}
