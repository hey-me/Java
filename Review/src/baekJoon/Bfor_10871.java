package baekJoon;

import java.util.Scanner;

public class Bfor_10871 {

	public static void main(String[] args) {
//		���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner s = new Scanner(System.in);
		System.out.print("N �Է�");
		int N = s.nextInt();
		System.out.print("X�Է�");
		int X = s.nextInt();
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print(i + 1 + "���� �� �Է�");
			num[i] = s.nextInt();

		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] < X) {
				System.out.print(num[i] + " ");
			}
		}
	}

}
