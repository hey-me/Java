package d0827;

public class D0830_Test_14_reee {

	public static void main(String[] args) {
//		14. 1���� �迭 30���� 1~1000 ������ �������� �����ϰ� ����ϼ���.
//	    �迭�� ����� �� �߿��� 1��~5���� ������ ���� ����� ��ġ��(index)��
//	    ����ϼ���.

		int[] ar = new int[30];
		int[] rank = new int[30];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 1000 + 1);
		}
		for (int i = 0; i < ar.length; i++) {
			int cnt = 1;
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					cnt++;
				}
			}
			rank[i] = cnt;
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (rank[j] == i) {
					System.out.println("�����Ͱ� : " + ar[j] + ", ��ġ�� : " + j);
				}
			}

		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] < ar[i]) {
					int imsi = ar[j];
					ar[j] = ar[i];
					ar[i] = imsi;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
