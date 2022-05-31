package ch06_Ŭ����;

public class D0902_4_ex6_�ζ� {

	public static void main(String[] args) {
		// 1~45 ���� 45�� �ʱ�ȭ
		// calc �޼ҵ忡�� 2000�� ��� 6���� �ߺ����� ���� ������ ����
		// ���ο��� 6�� ���� ���

		int[] ar = new int[45];
		int[] br = new int[6];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}
		br = calc(ar);

		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
		}
	}

	private static int[] calc(int[] ar) {
		int[] br = new int[6];
		for (int i = 0; i < 2000; i++) {
			int start = (int) (Math.random() * ar.length);
			int end = (int) (Math.random() * ar.length);
			int imsi = ar[start];
			ar[start] = ar[end];
			ar[end] = imsi;
		}

		System.arraycopy(ar, 0, br, 0, br.length);

		return br;
	}

}
