package baekJoon;

import java.util.Scanner;

public class B�迭_8958_xx {

	public static void main(String[] args) {
//		"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
//		������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
//		���� ���, 10�� ������ ������ 3�� �ȴ�.
//		"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//		OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner s = new Scanner(System.in);
		System.out.print("���� �� �Է�");
		int n = s.nextInt();
		int[] sum = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("���� �Է�");
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
