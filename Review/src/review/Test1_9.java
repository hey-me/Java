package review;

import java.util.Scanner;

public class Test1_9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�����ڵ尪(����) �Է�");
		int a = s.nextInt();

		int b = (a >= 'A' && a <= 'Z') ? a + 32 : (a >= 'a' && a <= 'z') ? a - 32 : a;
		// ������ �߰��Ϸ��� �������� ���
		System.out.println((char) b);

	}

}
