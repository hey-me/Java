package d0820;

import java.util.Scanner;

public class D0820_38_re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("값을 입력하세요.");
		String str = s.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				System.out.println("숫자 아님");
				System.exit(0);
			} else {
				sum += ch - '0'; // 여기서 '0'을 빼는 이유는 '1'에서 을 바꿀때 1이 되려면 49('1')에서 48('0')을 빼줘야하므로 모든 수에 '0'을 뺌.
			}
		}
		System.out.println("숫자의 합 : " + sum);

	}

}
