package baekJoon;

import java.util.Scanner;

public class Bwhile_1110_xx {

	public static void main(String[] args) {
//		26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 
//		8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//		위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//		N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

		Scanner s = new Scanner(System.in);

		System.out.print("숫자 입력");
		int cnt = 0;
		int a = s.nextInt();
		int firstNum = a;

		while (true) {
			a = (a % 10) * 10 + (a / 10 + (a % 10)) % 10;
			cnt++;
			if (firstNum == a) {
				break;
			}
		}

		System.out.println(cnt);
	}

}
