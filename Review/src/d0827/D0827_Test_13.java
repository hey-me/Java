package d0827;

public class D0827_Test_13 {

	public static void main(String[] args) {
//	13. -2000 ~ 2000 ������ ���� �� 20���� �迭�� �����ϰ� �� ���� ������ ���Ͽ� ����ϼ���.(������ ���ϴ� �迭 �����ؼ� �ۼ�)
//		<<���>>
//		1��° �� : 000, ���� : 00
//		2��° �� : 000, ���� : 00
//		3��° �� : 000, ���� : 00
//	13++. 13�� �������� ������ * �� ǥ���ϼ���.
//		  - 1���̸� * 20�� ���, 2���̸� * 19�� ���, 20���̸� * 1�� ���
//		<<���>>
//		1��° �� : 000, ���� : (1��)********************
//		2��° �� : 000, ���� : (20��)*
//		3��° �� : 000, ���� : (6��)***************
//	*13
		int[] ar = new int[20];
		int[] rank = new int[20];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 4001 - 2000);
		}

		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < rank.length; j++) {
				if (ar[j] > ar[i]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < rank.length; i++) {
			System.out.print("���� " + ar[i] + ", ������ " + rank[i]);
			for (int j = 0; j <= rank.length - rank[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
