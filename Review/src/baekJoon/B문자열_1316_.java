package baekJoon;

import java.util.Scanner;

public class B문자열_1316_ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// abc배열
		char[] abc = new char[26];
		for (int i = 0; i < abc.length; i++) {
			abc[i] = (char) ('a' + i);
		}

		//
		;
		int num = 0;
		System.out.print("단어 개수 입력");
		int caseNum = s.nextInt();
		for (int i = 0; i < caseNum; i++) {
			System.out.print("단어 입력");
			String wordStr = s.next();
			char[] wordCh = new char[wordStr.length()];
			wordCh[i] = wordStr.charAt(i);
			char[] word = new char[wordStr.length()];
			for (int j = 1; j < wordCh.length; j++) {
				for (int k = j + 1; k < wordCh.length; k++) {
					word[0] = wordCh[0];
					if (wordCh[j] != wordCh[k]) {
						word[k] = wordCh[k];
					}
				}

			}
			int cnt = 0;
			for (int j = 0; j < word.length; j++) {
				for (int j2 = j + 1; j2 < word.length; j2++) {
					if (word[j] == word[j2]) {
						cnt++;
					}
				}
			}

			if (cnt == 0) {
				num++;
			}

		}
		System.out.println(num);

	}

}
