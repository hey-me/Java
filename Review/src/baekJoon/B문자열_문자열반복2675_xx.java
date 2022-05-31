package baekJoon;

import java.util.Scanner;

public class B문자열_문자열반복2675_xx {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		System.out.println("테스트 횟수 입력");
//		int T = s.nextInt();
//		for (int t = 0; t < T; t++) {
			System.out.println("반복 횟수와 문자열 입력");
			String All = s.nextLine();
			
			char R = All.charAt(0);
			char[] S = new char[All.length() - 2];
			for (int i = 0; i < S.length; i++) {
				S[i] = All.charAt(i + 2);

			}

			for (int i = 0; i < S.length; i++) {
				for (int j = 0; j < R-'0'; j++) {
					System.out.print(S[i]);
				}

			}

//		}

	}

}
