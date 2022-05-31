package ch03_연산자;

import java.util.Scanner;

public class P130_연산자의종류_확인문제10 {

	public static void main(String[] args) {

//		10.
		int var7 = 10;
		int var8 = 3;
		int var9 = 14;
		double var10 = var7 * var7 * Double.parseDouble(var8 + "." + var9);
		System.out.println("원의 넓이:" + var10);
		
//11	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String id = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strpassword = scanner.nextLine();
		int password = Integer.parseInt(strpassword);
		
		if (id.equals("java"))
				{ 
			if (password == 12345) { 
				System.out.println("로그인 성공");
			}  else {
				System.out.println("로그인 실패:패스워드가 틀림");
			} 
		}  else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
		
//12.
		int q = 10;
		int w = 5;
		System.out.println( (q>7) && (w<=5) ); // True
		System.out.println( (q%3 == 2) || (w%2 != 1) );	// False
		
//13.
		int value = 0;
		
		//value = value + 10; 
		value += 10;
		//value = value - 10;
		value -= 10;		
		//value = value * 10;
		value *= 10;
		//value = value / 10;
		value /= 10;
		
//14.
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result);	//가
		
		
		
	}

}
