package d0820;

import java.util.Scanner;

public class D0820_14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("1���� �Է�");
		String str = s.next();
		char ch = str.charAt(0);
		
		if (ch >= '0' && ch<= '9') {
			System.out.println("����");
		}	
		else {
			System.out.println("���� �ƴ�");
		} 
		
		
		
	}

}
