package d0820;

import java.util.Scanner;

public class D0820_37 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���.");
		String str = s.next();

		boolean num = true;
		char ch = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				num = false;
			}
		}
		if (num) {
			System.out.println("������.");
		} else {
			System.out.println("���ڰ� �ƴ�.");
		}
	}

}
