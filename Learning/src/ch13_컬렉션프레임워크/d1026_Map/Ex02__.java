package ch13_�÷��������ӿ�ũ.d1026_Map;

import java.util.*;

public class Ex02__ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("mellon", "�޷�");
		map.put("pear", "��");

		int n = 0;
		boolean is = true;
		while (is) {
			try {
				System.out.print("1. �ܾ� �Է� 2. �ܾ� �˻�");
				n = scanner.nextInt();
				if (n == 1 || n == 2) {
					while (true) {
						switch (n) {
						case 1:
							System.out.print("���� �Է�");
							String en = scanner.next();
							if (en.equals("exit")) {
								System.out.println("�ý��� ����");
								System.exit(0);
							}
							System.out.print("�ܾ� �� �Է�");
							String ko = scanner.next();
							if (ko.equals("exit")) {
								System.out.println("�ý��� ����");
								System.exit(0);
							}
							map.put(en, ko);
							break;

						case 2:
							while (true) {
								System.out.print("���� �ܾ� �Է�");
								String str = scanner.next();
								if (str.equals("exit")) {
									System.out.println("�ý��� ����");
									System.exit(0);
								}
								if (map.get(str) == null) {
									System.out.println("��ϵ� �ܾ �����ϴ�.");
								} else {
									System.out.println(map.get(str));
								}
							}
						}
					}
				} else {
					System.out.println("1�� 2 �߿� �Է�");
				}

			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է����ּ���");
				scanner.next();
			}
		}

	}
}

//	}
