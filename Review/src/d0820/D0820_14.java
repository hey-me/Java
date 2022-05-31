package d0820;

import java.util.Scanner;

public class D0820_14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("1글자 입력");
		String str = s.next();
		char ch = str.charAt(0);
		
		if (ch >= '0' && ch<= '9') {
			System.out.println("숫자");
		}	
		else {
			System.out.println("숫자 아님");
		} 
		
		
		
	}

}
