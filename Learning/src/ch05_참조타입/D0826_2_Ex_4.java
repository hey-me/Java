package ch05_����Ÿ��;

public class D0826_2_Ex_4 {
	public static void main(String[] args) {

//	*1	ar�迭�� 1~45���� �ֱ�
		int[] ar = new int[45];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + 1 + "��° ���� : " + ar[i]);
		}

//	*2	1~45���ڿ��� 6���� ���� �� �̱� - �ߺ��� ���� ���� �� �ִٴ� ������ ����.
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int index = (int) (Math.random() * 45);
			lotto[i] = ar[index];
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(i + 1 + "��° ���� : " + lotto[i]);
		}

//	*3	�ߺ� ���� ����
		int firstIndex, lastIndex;
		int imsi;
		for (int i = 0; i < ar.length; i++) { // i< ����? === �� �� ������!
			firstIndex = (int) (Math.random() * ar.length); // 45��� ar.length ���ֱ�
			lastIndex = (int) (Math.random() * ar.length);
			imsi = ar[firstIndex];
			ar[firstIndex] = ar[lastIndex];
			ar[lastIndex] = imsi;
		}
		//lotto �迭�� �� �ְ� �ѹ��� �Ϸ���.
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(i + 1 + "��° ���� : " + ar[i]);
		}
		
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = ar[i];
//		}
//
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(i + 1 + "��° ���� : " + lotto[i]);
//		}

	}

}
