package d0820;

import java.util.Scanner;

public class D0820_36 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.print("���� �ҹ��ڸ� 1���� �Է��ϼ���");
		String str = s.next();
		char ch = str.charAt(0);
		
		for (char i = ch; i >= 'a' ; i--) {
			System.out.println(i);
		}
		
		
	}

}
