package review;

import java.util.Scanner;

public class D0819_����3 {

	public static void main(String[] args) {
		// 'q'�� �Էµ� ������ �Էµ� ������ �հ踦 ����ϼ���.
		System.out.println((int) ('q'));
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���.");
		int num = s.nextInt();
		int sum = 0;
//		for (int i = 0; i < args.length; i++) {
//			sum += s.nextInt();
//		}
		while (num != 'q') {
			sum += s.nextInt();
		}
		System.out.println(sum);
	}

}
