package d1006;

import java.util.Scanner;

public class CustomerManageEx {

	// �ʵ�
	Scanner s = new Scanner(System.in);
	private String[] name;
	private int[] age;
	private String[] hobby;
	int num;

	// ������
	public CustomerManageEx() {
		System.out.print("�� �� �Է� >>");
		num = s.nextInt();
		name = new String[num];
		age = new int[num];
		hobby = new String[num];
	}

	// �޼ҵ�
	public static void main(String[] args) {
		CustomerManageEx cm = new CustomerManageEx();
		for (int i = 0; i < cm.num; i++) {
			System.out.print("�̸�>>");
			cm.name[i] = cm.s.next();
			System.out.print("����>>");
			cm.age[i] = cm.s.nextInt();
			System.out.print("���>>");
			cm.hobby[i] = cm.s.next();
		}

		for (int i = 0; i < cm.num; i++) {
			System.out.print("�̸� : " + cm.name[i] + " ");
			System.out.print("���� : " + cm.age[i] + " ");
			System.out.println("��� : " + cm.hobby[i] + " ");
		}

	}
}
