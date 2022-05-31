package d0820;

import java.util.Scanner;

public class D0820_38 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("값을 입력하세요.");
		String str = s.next();

		int sum = 0;
		boolean num = true;
		char ch = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				num = false;
			} else {
				sum += ch - '0'; //'1'에서 을 바꿀때 1이 되려면 49('1')에서 48('0')을 빼줘야하므로 모든 수에 '0'을 뺌. 
			}
		}
		if (num == true) {
			System.out.println("숫자");
			System.out.println(sum);
		}
		if (num != true) {
			System.out.println("숫자가 아님");
		}

	}
}
