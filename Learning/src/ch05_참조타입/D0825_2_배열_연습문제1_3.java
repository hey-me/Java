package ch05_����Ÿ��;

public class D0825_2_�迭_��������1_3 {

	public static void main(String[] args) {
//		* 1���� �迭
//
//		1. 1���� 5���� �迭�� �����ϼ���.
//		   �迭�� : ar
		int[] one = new int[5];
//		int[] ar = new int[] {1,2,3,4,5};
		for (int i = 0; i < one.length; i++) {
			one[i] = i + 1;
			System.out.print(one[i] + " ");
		}
//		2. 30���� ������ ������ �� �ִ� �迭�� �����ϰ� 1~50������ ������ ����
//		   �迭�� �����ϼ���.
//		   �迭�� : ar
		int[] two = new int[30];
		for (int i = 0; i < two.length; i++) {
			two[i] = (int) (Math.random() * 50 + 1);
		}
		for (int i = 0; i < two.length; i++) {
			System.out.print(two[i] + " ");
		}

//		3. 1~100������ ������ �� 50���� �迭�� �����ϰ� �迭�� ����� �� �߿���    3�� ����� ������ ����ϼ���.

		int[] three = new int[50];
		int num = 0;
		for (int i = 0; i < three.length; i++) {
			three[i] = (int) (Math.random() * 100 + 1);
			if (three[i] % 3 == 0) {
				num++;
			}
		}
		System.out.println("\n3�� ����� ���� : " + num);

	}

}
