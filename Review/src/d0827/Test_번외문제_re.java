package d0827;

import java.util.Iterator;

public class Test_���ܹ���_re {

	public static void main(String[] args) {

//		13. -2000 ~ 2000 ������ ���� �� 20���� �迭�� �����ϰ� �� ���� ������ ���Ͽ� ����ϼ���.(������ ���ϴ� �迭 �����ؼ� �ۼ�)
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
		int[] cnt = new int[20];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 4001 - 2000);
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int imsi = ar[i];
					ar[i] = ar[j];
					ar[j] = imsi;

				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(i + 1 + "��° �� : " + ar[i] + ", ���� : " + (i + 1));
//	*13++		
			for (int j = ar.length; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
