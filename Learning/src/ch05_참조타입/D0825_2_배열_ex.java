package ch05_����Ÿ��;
import java.util.Scanner;
public class D0825_2_�迭_ex {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է�");
			a[i] = s.nextInt();
		}

		int sum = 0, avg = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum / a.length);

		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("�ִ� : " + max);
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("�ּڰ� : " + min);

	}

}
