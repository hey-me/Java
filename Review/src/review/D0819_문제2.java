package review;

import java.util.Scanner;

public class D0819_����2 {

	public static void main(String[] args) {

		//���� �ϳ��� �Է¹޾Ƽ� 1���� �Է¹��� �������� 3�� ����� ���� ����ϼ���
		
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���");
		int num = s.nextInt();
		int sum=0;
		for (int i = 1; i <= num; i++) {
			if (i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
