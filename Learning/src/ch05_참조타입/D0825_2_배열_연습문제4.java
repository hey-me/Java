package ch05_����Ÿ��;

public class D0825_2_�迭_��������4 {

	public static void main(String[] args) {
//		4. 1~9�� �迭�� �����ϰ� ������ 20�� ��� �ߺ����� �ʴ� 3�ڸ� ���� ���
//			int start = int math random *9
//
		int[] numArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] resultArr = new int[3];

		// 20�� ����
		for (int i = 0; i < 20; i++) {
			int start = (int) (Math.random() * 9);
			int end = (int) (Math.random() * 9);
			int imsi = numArr[start]; // �迭�� �ִ� ���� �ٲٷ��� __����[�ε�����]
			numArr[start] = numArr[end];
			numArr[end] = imsi;
		}
		//���ο� �迭 ����
		for (int j = 0; j < numArr.length; j++) {
			System.out.println(numArr[j]);
		}
		// �� 3�ڸ��� ������ 3�ڸ��� �����
		for (int j = 0; j < resultArr.length; j++) {
			System.out.print(numArr[j]);
		}

	}
}
