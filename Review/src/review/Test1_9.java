package review;

import java.util.Scanner;

public class Test1_9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("문자코드값(정수) 입력");
		int a = s.nextInt();

		int b = (a >= 'A' && a <= 'Z') ? a + 32 : (a >= 'a' && a <= 'z') ? a - 32 : a;
		// 영문자 추가하려면 논리연산자 사용
		System.out.println((char) b);

	}

}
