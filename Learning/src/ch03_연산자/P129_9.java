package ch03_연산자;

import java.util.Scanner;

public class P129_9 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		String str1 = s.next();
		//double n1 = Double.parseDouble(str1);
		double n1 = Double.parseDouble(s.next());  // str1이라고 안 쓰고 s.next()로 적어도 같음. 전에꺼 바로 사용하는 것과 같음 아래 int예시 확인
		
		System.out.print("두 번째 수: ");
		String str2 = s.next();
		double n2 = Double.parseDouble(s.next());
		
		if (n2 == 0.0) {
			System.out.println("결과:" + n1 / n2);
		} else {
			System.out.println("결과:무한대");
		}
		
//	**  int 예시
//		int a = 5;
//		int b = 10;
//		int c = a + b;
//		System.out.println(c);
//		// = System.out.println(a + b);
	}
}
