package baekJoon;

import java.util.Scanner;

public class B문자열_단어공부1157_xx {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("단어 입력");
		String str = s.next();
		int[] cnt = new int[26];
		char[] abc = new char[26];
		char[] ABC = new char[26];

		for (int i = 0; i < ABC.length; i++) {
			abc[i] = (char) ('a' + i);
			ABC[i] = (char) ('A' + i);
		}

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < abc.length; j++) {
				if (str.charAt(i) == abc[j]) {
					cnt[j]++;
				}
				if (str.charAt(i) == ABC[j]) {
					cnt[j]++;
				}
			}

		}

		int max = cnt[0];
		int dddd = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				dddd = i;
			}
		}

		int cntnum = 0;
		for (int j = 0; j < cnt.length; j++) {
			if (max == cnt[j]) {
				cntnum++;
//				dddd = j;
			}
		}

		if (cntnum > 1) {
			System.out.println("?");
		} else {
			System.out.println(ABC[dddd]);
		}
	System.out.println(dddd);
	}
	

}
