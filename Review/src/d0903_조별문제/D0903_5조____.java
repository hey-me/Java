package d0903_��������;

import java.util.Arrays;

public class D0903_5��____ {

	public static void main(String[] args) {

		int[][] ar = new int[2][10];
//		������ 1~100���� ���ڸ� 2���� �迵�� 1�࿡�� "������������"
//		2�࿡�� ������������

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
		int imsi;
		for (int i = 0; i < ar[0].length; i++) {
			for (int j = i + 1; j < ar[0].length; j++) {
				if (ar[0][i] > ar[0][j]) {
					imsi = ar[0][i];
					ar[0][i] = ar[0][j];
					ar[0][j] = imsi;
				}
			}
			System.out.print(ar[0][i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ar[0].length; i++) {
			for (int j = i + 1; j < ar[0].length; j++) {
				if (ar[1][i] < ar[1][j]) {
					imsi = ar[1][i];
					ar[1][i] = ar[1][j];
					ar[1][j] = imsi;
				}
			}
			System.out.print(ar[1][i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(ar[0]));
		System.out.println(Arrays.toString(ar[1]));
	}

}
