package baekJoon;

import java.util.Scanner;

public class B���ڿ�_��������11720 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("������ ������?");
		int N = s.nextInt();

		System.out.print("���� �Է�");
		String str = s.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
