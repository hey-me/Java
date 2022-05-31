package d0820;

import java.util.Scanner;

public class D0820_32 {

	public static void main(String[] args) {

		
		Scanner s= new Scanner(System.in);
		
		System.out.print("영문대문자 1글자를 입력하세요");
		String str = s.next();
		char ch = str.charAt(0);
		
		while ( ch <='Z') {
			System.out.println(ch);
			ch++;
//		for (  ; i <= 'Z'; i++) {
//			System.out.println(ch);
//		}	
		
		}
		
	}

}
