package ch05_����Ÿ��;

import java.util.Scanner;

public class D0825_2_Ex_2 {

	public static void main(String[] args) {

//		3. �����ҹ��ڿ� ���ڸ� Scanner�� �Է¹޾� ��ȣ���� ����ϼ���.
//		- ��¿���
//		 �Էµ����� : acd214
//		 ��ȣ�� : `!@ewt

		Scanner s = new Scanner(System.in);
		System.out.print("�����ҹ��ڿ� ���ڸ� �Է�");
		String input = s.next();
		String result = "";

		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };

		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
//				int index = ch - 'a';
//				result += abcCode[index];
				result += abcCode[ch - 'a'];
			}
			if (ch >= '0' && ch <= '9') {
				int index = ch - '0';
//				result += numCode[index];
				result += numCode[ch - '0'];
			}
		}
		System.out.println(result);
	}

}
