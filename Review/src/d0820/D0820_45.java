package d0820;

import java.util.Scanner;


public class D0820_45 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �� �Է�!");
		int n = s.nextInt();
		int d = (int) (Math.random() * 100) + 1;

		if (n != d) {
			while (true) {
				System.out.print("�ٽ� �õ��ϼ���\n");
				System.out.print("�Է�");
				n = s.nextInt();
				d= (int) (Math.random() * 100) + 1;
			}
		}
		if (n == d) {
			System.out.println("����");
		}

	}
}
