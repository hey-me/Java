package d0827;

public class D0830_Test_15 {

	public static void main(String[] args) {
//		15. ������ 20���� 1 ~ 300 ������ ���������� �ʱ�ȭ �� �� ����ϰ�,
//	    ������������ ������ ����� ������������ ������ ����� ����ϼ���.
//
//	< ��� ���� >
//	*** �Է� ������ ***
//	5 13 6 250 290 78 97 34 56 12 7 55 77 99 122 14  2 222 9
//	*** �������� ���� ������ ***
//	5 13 6 250 290 78 97 34 56 12 7 55 77 99 122 14 1 2 222 9 
//	*** �������� ���� ������ ***
//	5 13 6 250 290 78 97 34 56 12 7 55 77 99 122 14 1 2 222 9

		int[] num = new int[20];
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 300 + 1);
		}

//		��������
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] > num[i]) {
					int imsi = num[j];
					num[j] = num[i];
					num[i] = imsi;

				}
				cnt++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

//		��������
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length - 1; j++) {
				if (num[j] < num[i]) {
					int imsi = num[j];
					num[j] = num[i];
					num[i] = imsi;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("������" + cnt);
	}

}
