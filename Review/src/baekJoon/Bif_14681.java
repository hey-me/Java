package baekJoon;

import java.util.Scanner;

public class Bif_14681 {

	public static void main(String[] args) {

//		���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�.
//		���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�.
//		�� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
//		���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
//		��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
		Scanner s = new Scanner(System.in);
		System.out.print("x : ");
		int x = s.nextInt();
		System.out.print("y : ");
		int y = s.nextInt();

		if (x > 0 && y > 0) {
			System.out.println(1);
		}
		if (x < 0 && y > 0) {
			System.out.println(2);
		}
		if (x < 0 && y < 0) {
			System.out.println(3);
		}
		if (x > 0 && y < 0) {
			System.out.println(4);
		}

	}

}
