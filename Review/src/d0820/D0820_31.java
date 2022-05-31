package d0820;

import java.util.Scanner;

public class D0820_31 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력");
		int n1 = s.nextInt();
		System.out.print("정수 입력");
		int n2 = s.nextInt();
		
		if (n1>n2) {
			System.out.println("큰 수 : "+ n1);
			System.out.println("작은 수 : "+ n2);
		} else {
			System.out.println("큰 수 : "+ n2);
			System.out.println("작은 수 : "+ n1);
		}
		
	}

}
