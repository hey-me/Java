package baekJoon;

import java.util.Scanner;

public class B�迭_2577 {

	public static void main(String[] args) {
//	�� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 
//		0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	���� ��� A = 150, B = 266, C = 427 �̶�� 
//		A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
//		����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
//	�Է�
//		ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. 
//		A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ���� �ڿ����̴�.
//	���
//		ù° �ٿ��� A �� B �� C�� ����� 0 �� �� �� �������� ����Ѵ�.
//		���������� ��° �ٺ��� �� ��° �ٱ��� A �� B �� C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.

		Scanner s = new Scanner(System.in);
		int[] ar = new int[10];
		int[] num = new int[10];
		System.out.print("A�Է�");
		int a = s.nextInt();
		System.out.print("B�Է�");
		int b = s.nextInt();
		System.out.print("C�Է�");
		int c = s.nextInt();
		int times = 0;
		times = a * b * c;
		String time = times + "";
		for (int i = 0; i < time.length(); i++) {
			for (int j = '0'; j <= '9'; j++) {
				if (time.charAt(i) == j) {
					num[j - '0']++;
				}
			}

		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
