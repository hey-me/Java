package d0827;

public class D0830_Test_14 {

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
			rank[i] = 1;

			for (int j = 0; j < rank.length; j++) {
				if (ar[j] > ar[i]) {
					rank[i]++;
				}
			}
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (rank[j] == i) {
					System.out.println(i + "�� - �����Ͱ� : " + ar[j] + ", ��ġ�� : " + j);
				}
			}
		}

	}
}
