package baekJoon;

import java.util.Scanner;

public class B�迭_3052_xx {

	public static void main(String[] args) {
//		�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
//		���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
//		�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
//		�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.

		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		int cntArr = 0;
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "��° �� �Է�");
			a[i] = scanner.nextInt();
//			a[i] = i + 1;
		}

		int[] na = new int[10];
		for (int i = 0; i < a.length; i++) {
			na[i] = a[i] % 42;
		}

		for (int i = 0; i < na.length; i++) {
			for (int j = i + 1; j < na.length; j++) {
				if (na[i] == na[j]) {
					cntArr++;
				}
			}
			if (cntArr == 0) {
				cnt++;
			}
		}

//		for (int i = 0; i < na.length; i++) {
//			System.out.println(na[i]);
//		}
		System.out.println(cnt);

	}

}
