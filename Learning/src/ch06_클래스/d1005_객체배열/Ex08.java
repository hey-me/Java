package ch06_Ŭ����.d1005_��ü�迭;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ο���>>");
		int n = scanner.nextInt();
		Phone p[] = new Phone[n];
		for (int i = 0; i < p.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new Phone(name, tel);

			if (i == n - 1) {
				System.out.println("����Ǿ����ϴ�...\n");

			}
		}
		boolean is = true;
		String search;
		while (is) {
			int imsi = -1;
			System.out.print("�˻��� �̸�>>\n");
			search = scanner.next();
			if (search.equals("�׸�")) {
				System.out.println("����");
				System.exit(0);
			}
			for (int i = 0; i < p.length; i++) {
				if (p[i].getName().equals(search)){
					System.out.println(search + "�� ��ȣ�� " + p[i].getTel() + " �Դϴ�.");
					imsi = i;
				}
			}
			if (imsi == -1) {
				System.out.println(search + "�� �����ϴ�.");
			}
		}
	}
}

class Phone {
	private String name, tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}