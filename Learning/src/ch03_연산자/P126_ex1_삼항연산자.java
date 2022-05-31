package ch03_연산자;

import java.util.Scanner;

public class P126_ex1_삼항연산자 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = s.nextInt();
		
		String str = num>0 ? "양수" : num==0 ? "영" : "음수";
		
		System.out.println("입력한 값은 " + str + "입니다.");
		
	}

}
