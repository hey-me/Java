package d0820;

import java.util.Scanner;

public class D0820_38 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���.");
		String str = s.next();

		int sum = 0;
		boolean num = true;
		char ch = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				num = false;
			} else {
				sum += ch - '0'; //'1'���� �� �ٲܶ� 1�� �Ƿ��� 49('1')���� 48('0')�� ������ϹǷ� ��� ���� '0'�� ��. 
			}
		}
		if (num == true) {
			System.out.println("����");
			System.out.println(sum);
		}
		if (num != true) {
			System.out.println("���ڰ� �ƴ�");
		}

	}
}
