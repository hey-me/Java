package baekJoon;

import java.util.Scanner;

public class Bfor_8393 {

	public static void main(String[] args) {

//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		�Է�
//		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		Scanner s = new Scanner(System.in);
		System.out.print("n : ");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
