package ch04_���ǹ����ݺ���;

import java.util.Scanner;

public class P155_charAt_strlength {

	public static void main(String[] args) {

		String str = "124o5";
		String length = "124";
		System.out.println(str.length());  //str���� �� ����.
		boolean isNum = true;
		for (int i = 0; i < str.length(); i++) {
//		for (int i = 0; i <= 5; i++) {
			char ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				isNum = false;
			}
			if (isNum) {
				System.out.println("������.");
			} else {
				System.out.println("���ڰ� �ƴ�.");
			}
		}

		
//		String str = "124o5";
//		boolean isNum = true;
//		for (int i = 0; i < 5; i++) {
//			char ch = str.charAt(i);
//			if (!(ch >= '0' && ch <= '9')) {
//				isNum = false;
//			}
//			if (isNum) {
//				System.out.println("������.");
//			} else {
//				System.out.println("���ڰ� �ƴ�.");
//			}
//		}

	}

}
