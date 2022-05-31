package d0827;

import java.util.Scanner;

public class Test_10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] ar = new int[5];
		int cnt = 0;
		int num;
		for (cnt = 0; cnt < 5; cnt++) {
			for (int i = 0; i < ar.length;) {
				System.out.print(i + 1 + "번째 수 입력");
				num = s.nextInt();
				if (num >= -20 && num <= 200) {
					ar[i] = num;
					i++;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
