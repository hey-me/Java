package baekJoon;

import java.util.Scanner;

public class B���ڿ�_���ڿ��ݺ�2675_xx {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		System.out.println("�׽�Ʈ Ƚ�� �Է�");
//		int T = s.nextInt();
//		for (int t = 0; t < T; t++) {
			System.out.println("�ݺ� Ƚ���� ���ڿ� �Է�");
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
