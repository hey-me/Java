package baekJoon;

import java.util.Scanner;

public class B���ڿ�_2941__ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�");
		String str = s.next();
		char[] ch = new char[str.length()];

		// �Է¹��� ���ڿ��� ���ڷ�.
		for (int i = 0; i < args.length; i++) {
			ch[i] = str.charAt(i);
		}

		// abc~�迭
		char[] abc = new char[26];
		for (int i = 0; i < abc.length; i++) {
			abc[i] = (char) (i + 'a');
		}

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < abc.length; j++) {
				if (ch[i] == abc[j]) {

				}
			}
		}
		// �ߺ��Ǵ°� ����, ���ĺ� �ٲ۰� -1

	}

}
