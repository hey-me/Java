package ch02_������Ÿ��;
import java.util.Scanner;

public class D0730_5_��ĳ��_���빮�� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = s.next();// ���ӵ� ���ڸ� �д´�.
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = s.nextInt();// ���� ���� �д´�.
		System.out.print("Ű�� �Է��ϼ���(�Ҽ��� ���ڸ�����) : ");
		double tall = s.nextDouble();// �Ǽ� ���� �д´�.
		s.nextLine();
		/*
		 * nextLine�� ���� �Է��ߴ� enter���� �б� ������ �ι� �Է����� ������ enter�� �Էµȴ�. enter�� ��ŵ�ϱ� ���� �� ��
		 * �Է��ؾ��Ѵ�.
		 */
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String add = s.nextLine();

		// System.out.print("����� �̸��� : \""+name+"\"�̰�, ���̴� "+age+"�Դϴ�.\nŰ�� "+tall+"�̰�,
		// �ּҴ� "+add+"�Դϴ�." );
		System.out.print("����� �̸��� : \"" + name);
		System.out.println("\"�̰�, ���̴� " + age + "�Դϴ�.");
		System.out.print("Ű�� " + tall + "�̰�, ");
		System.out.print("�ּҴ� " + add + "�Դϴ�.");

	}

}
