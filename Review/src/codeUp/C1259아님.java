package codeUp;

import java.util.Scanner;

public class C1259�ƴ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� -�� ����� �Է�");
		String str = s.next();
		for (int i = 0; i < str.length(); i++) {
			if (i != 6) {
				System.out.print(str.charAt(i));
			}
		}
		
		
	}
}
