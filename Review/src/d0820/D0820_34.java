package d0820;

import java.util.Scanner;

public class D0820_34 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.print("������ 1���ڸ� �Է��ϼ���.");
		String str = s.next();
		char ch = str.charAt(0);
		
		if (ch>='A'&& ch<='Z') {
			for (char i = 'A'; i <= ch; i++) {
				System.out.println(i);
			}
		} 
		if (ch>='a' && ch<='z') {
			for (char j = ch; j <= 'z'; j++) {
				System.out.println(j);
				
			}
		}
		
	}

}
