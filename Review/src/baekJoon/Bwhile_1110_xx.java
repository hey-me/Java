package baekJoon;

import java.util.Scanner;

public class Bwhile_1110_xx {

	public static void main(String[] args) {
//		26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 
//		8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
//		���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
//		N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner s = new Scanner(System.in);

		System.out.print("���� �Է�");
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
