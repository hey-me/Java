package ch05_����Ÿ��;

public class D0826_Ex_6 {

	public static void main(String[] args) {

		int[] ar = new int[45];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}

		int[] lotto = new int[6];
		int firstIndex, lastIndex;
		int imsi;
		int[] tong = new int[45];
		int[] star = new int[45];

		for (int j = 0; j < 2000; j++) { // �� ���� ��踦 ����? 2000��
			for (int i = 0; i < ar.length; i++) { // i< ����? === �� �� ������!
				firstIndex = (int) (Math.random() * ar.length); // 45��� ar.length ���ֱ�
				lastIndex = (int) (Math.random() * ar.length);
				imsi = ar[firstIndex];
				ar[firstIndex] = ar[lastIndex];
				ar[lastIndex] = imsi;
			}
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = ar[i];
			}

//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(i + 1 + "��° ���� : " + lotto[i]);
//		}

//		2000�� ������ ���
			for (int i = 0; i < lotto.length; i++) {
				tong[lotto[i] - 1]++;
			}
		}
//		for (int i = 0; i < tong.length; i++) {
//			System.out.println(i + 1 + "�� ������ " + tong[i]);
//		}

//		40���� ���� ���� *�� ���
		for (int i = 0; i < tong.length; i++) {
			star[i] = tong[i] / 40;
			System.out.print(i + 1 + "�� ���� : " + star[i] + "�� ");
			for (int j = 0; j < star[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
