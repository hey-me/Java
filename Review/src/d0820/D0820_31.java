package d0820;

import java.util.Scanner;

public class D0820_31 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�");
		int n1 = s.nextInt();
		System.out.print("���� �Է�");
		int n2 = s.nextInt();
		
		if (n1>n2) {
			System.out.println("ū �� : "+ n1);
			System.out.println("���� �� : "+ n2);
		} else {
			System.out.println("ū �� : "+ n2);
			System.out.println("���� �� : "+ n1);
		}
		
	}

}
