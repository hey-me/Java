package baekJoon;

import java.util.Scanner;

public class B배열_8958_xx {

	public static void main(String[] args) {
//		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
//		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
//		예를 들어, 10번 문제의 점수는 3이 된다.
//		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

		Scanner s = new Scanner(System.in);
		System.out.print("문제 수 입력");
		int n = s.nextInt();
		int[] sum = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("퀴즈 입력");
			String str = s.next();
			String[] ar = new String[str.length()];
			char[] br = new char[str.length()];
			int[] cr = new int[br.length];

			for (int j = 0; j < cr.length; j++) {
				br[j] = str.charAt(j);
			}
			int cnt = 0;
			for (int j = 0; j < cr.length; j++) {
				if (br[j] == 'O') {
					cr[j] = 1;
				}
			}
//			for (int j = 0; j < cr.length; j++) {
//				System.out.print(cr[j] + " ");
//			}
			for (int j = 0; j < ar.length; j++) {
				for (int j2 = j + 1; j2 < ar.length; j2++) {
					if (br[j] == 'O' && br[j2] == 'O') {
						cr[j2]++;
					}
					if (br[j] == 'X' && br[j2] == 'O') {
						cr[j2] = 1;
					}
				}
//				System.out.println(cr[j] + " ");
				sum[i] += cr[j];
			}
		}
		for (int j = 0; j < sum.length; j++) {
			System.out.println(sum[j]);
		}

	}

}
