package ch05_����Ÿ��;
import java.util.Scanner;
public class D0824_2_�迭 {
	public static void main(String[] args) {
//	**	�迭 : ���� Ÿ���� �����͸� ���ӵ� ������ ����, �� �����Ϳ� �ε����� �ο��� �ڷᱸ��
//		== ����(�ּ�) ��
//		.equals(); ���ڿ� ��
		int[] a = new int[5];
//		int a[]
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a[2]); // 30

		for (int i = 0; i < a.length; i++) {
			a[i] = (i + 1) * 10;
			System.out.println(a[i]);
		}
		
//	** ��ĳ�ʷ� ��� �Է��ϱ� - �հ�, ��� ���ϱ�
		Scanner s = new Scanner(System.in);
		System.out.print("�Է�");
		int ar[] = new int[5];

		for (int i = 0; i < ar.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է�");
			ar[i] = s.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum / ar.length);

//	**	�ִ�, �ּڰ� ���ϱ�
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.println("�ִ��� " + max);
		int min = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("�ּڰ��� " + min);

	}
}
