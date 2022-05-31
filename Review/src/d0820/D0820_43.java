package d0820;

import java.util.Scanner;

public class D0820_43 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("수를 입력");
		int n1 = s.nextInt();
		System.out.println("수를 입력");
		int n2 = s.nextInt();

		int max = n1 > n2 ? n1 : n2;
		int min = n1 > n2 ? n2 : n1;

//		if (n1>n2) {
//			int t = n1;
//			n1 = n2;
//			n2 = t;
//		}

		for (int i = min; i <= max; i++) {
			System.out.printf("%d * %d = %d\n", 4, i, 4 * i);
		}
	}

}
