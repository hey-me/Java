package d0820;

import java.util.Scanner;

public class D0820_45_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �� �Է�!");
		int n = s.nextInt();
		int d = (int) (Math.random() * 100) + 1;

		while (true) {
			if (n > d) {
				System.out.println("Ʋ�Ƚ��ϴ�. ���� �� �۽��ϴ�.");
				System.out.println("�� �Է� : ");
				n = s.nextInt();
			}
			if (n < d) {
				System.out.println("Ʋ�Ƚ��ϴ�. ���� �� Ů�ϴ�.");
				System.out.println("�� �Է� : ");
				n = s.nextInt();
			}
			if (n == d) {
				System.out.println("����");
				break;
			}

		}

	}
}
