package ch02_������Ÿ��;
import java.util.Scanner;

public class D0730_2_��ĳ�� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // scanner s( �����̱� ������ �󸶵��� ���� �����ϴ�. )
		System.out.print("a�� �� �Է� : "); // ������ �Է��ؾ� �ϴ��� �������ִ� ����.
		int a = s.nextInt();

		System.out.print("b�� �� �Է� : "); // �ΰ� �Ѱ� ������ �ϰ� ���������� ��ĳ�ʸ� �� ���� �ʰ� ������ �߰����ָ� �ȴ�.
		int b = s.nextInt();

		System.out.print("c�� �� �Է� : ");
		int c = s.nextInt();

		System.out.printf("������ �� �Է� : ");
		int ���� = s.nextInt();

		System.out.println("a�� ���� " + a + "�Դϴ�");
		System.out.println("b�� ���� " + b + "�Դϴ�");
		System.out.println("c�� ���� " + c + "�Դϴ�");

//		System.out.println("a�� b�� ������ " + (a + b) + "�Դϴ�");
//		System.out.println("a�� b�� ������ " + (a - b) + "�Դϴ�");
//		System.out.println("a�� b�� ������ " + a * b + "�Դϴ�");

		if (a + b > c) {
			System.out.println("���ɽð��Դϴ�.");
		} else {
			System.out.println("���� �ƴմϴ�.");
		}
		System.out.println("����� " + ((a + b + c) / 3) + "�Դϴ�");

		System.out.println("���� ������ " + ���� + "�Դϴ�.");

	}

}
