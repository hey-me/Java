package d0820;

import java.util.Scanner;

public class D0820_15 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("������ �ϳ��� �Է��ϼ���");
		String str = s.next();
		char ch = str.charAt(0);
		
		if (ch >= 'a' && ch<= 'z') {
			System.out.println("�ҹ���");
		} else if ((ch >= 'A' && ch<= 'Z')) {
			System.out.println("�빮��");
		} 
		
		
	}

}
