package ch10_����.d1013;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int random = (int) (Math.random() * 100 + 1);
		int cnt = 0;
		while (true) {
			try {
				System.out.println("1�� 100������ ���� �Է��ϼ���");
				int n1 = s.nextInt();
				if (n1 < random) {
					cnt++;
					throw new IndexOutOfBoundsException();
				}
				if (n1 > random ) {
					cnt++;
					throw new NumberFormatException();
				}
				if (n1 == random) {
					System.out.println("������ϴ�.");
					System.out.println("�õ�Ƚ���� " + cnt + "���Դϴ�");
					System.exit(0);
				}

			} 
//			catch (IndexOutOfBoundsException e) {
//				System.out.println("�� ū ���� �Է��ϼ���");
//			} catch (NumberFormatException e) {
//				System.out.println("�� ���� ���� �Է��ϼ���");
//			}
			catch (Exception e) {
				cnt++;
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���");
				s.next();
			}
		}
	}

}
