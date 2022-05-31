package d0820;

import java.util.Scanner;

public class D0820_30 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("정수A 입력");
		int a = s.nextInt();
		System.out.print("정수B 입력");
		int b = s.nextInt();
		int sum = 0;
		
		int max = a>b ? a : b;
		int min = a>b ? b : a;
		
		for (int i = min; i <= max; i++) {
			sum+= i;
		}
		System.out.println(sum);
	}

}
