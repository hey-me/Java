package ch04_���ǹ����ݺ���;

import java.util.Scanner;

public class P155_charAt_strlength_��ĳ��_�� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�Է��ϼ���.");
		String str = s.next();
		System.out.println(str.length());
		boolean isNum = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) { // '0', '9' ��� ���ϰ� 0, 9��� �ϸ� ��½� ���ڰ� �ƴ϶�� ����(false).
				isNum = false;
			}
		}
		if (isNum) {
			int sum = 0; // str="1234"
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i); // '1'=>35, '0'=>34
				sum = sum + (ch - '0');
			}
			System.out.println(str + "str�� �հ� : " + sum);
		} else {
			System.out.println();
		}

	}

}
