package d0820;

import java.util.Scanner;

public class D0820_38_re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���.");
		String str = s.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				System.out.println("���� �ƴ�");
				System.exit(0);
			} else {
				sum += ch - '0'; // ���⼭ '0'�� ���� ������ '1'���� �� �ٲܶ� 1�� �Ƿ��� 49('1')���� 48('0')�� ������ϹǷ� ��� ���� '0'�� ��.
			}
		}
		System.out.println("������ �� : " + sum);

	}

}
