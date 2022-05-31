package baekJoon;

import java.util.Scanner;

public class B문자열_2941__ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("문자 입력");
		String str = s.next();
		char[] ch = new char[str.length()];

		// 입력받은 문자열을 문자로.
		for (int i = 0; i < args.length; i++) {
			ch[i] = str.charAt(i);
		}

		// abc~배열
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
		// 중복되는거 빼고, 알파벳 바꾼거 -1

	}

}
