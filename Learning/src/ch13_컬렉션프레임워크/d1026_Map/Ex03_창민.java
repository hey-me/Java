package ch13_�÷��������ӿ�ũ.d1026_Map;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Ex03_â�� {

	public static void main(String[] args) {

		Map<String, Student1> map = new HashMap<>();
		Scanner s = new Scanner(System.in);

		while (true) {
			String name = "";
			String id = "";
			int num = 0;
			while (true) {
				try {
					System.out.print("�л� �̸� : ");
					name = s.nextLine();
					for (int i = 0; i < name.length(); i++) {
						if (name.valueOf(name.charAt(i)).matches("[^a-zA-Z��-�R\\s]")) {
							throw new InterruptedException();
						} else if (name.charAt(i) == ' ') {
							throw new Exception();
						}
					}
					break;
				} catch (InterruptedException e) {
					System.out.println("������ �ѱ��� ����� �Է����ּ���");
				} catch (Exception e) {
					System.out.println("���⸦ ���������ּ���");
				}
			}
			if (name.equals("�׸�")) {
				break;
			}
			while (true) {
				try {
					System.out.print("�л� id : ");
					id = s.nextLine();
					for (int i = 0; i < id.length(); i++) {

						if (id.charAt(i) == ' ') {
							throw new InterruptedException();
						}
					}
					break;
				} catch (InterruptedException e) {
					System.out.println("���⸦ ���� �����ּ���");
				}
			}
			while (true) {
				try {
					System.out.print("�л� ��ȣ : ");
					num = s.nextInt();
					s.nextLine();
					break;
				} catch (InputMismatchException e) {
					System.out.println("���ڸ� �Է����ּ���");
					s.next();
				}

			}
			map.put(name, new Student1(id, num));
		}
		

		while (true) {
			System.out.print("ã�� ���� �л��� �̸� : ");
			String name1 = "";
			try {
				name1 = s.nextLine();
				if (name1.equals("�׸�")) {
					System.out.println("���α׷� ����");
					break;
				}
				for (int i = 0; i < name1.length(); i++) {
					if (name1.valueOf(name1.charAt(i)).matches("[^a-zA-Z��-�R\\s]")) {
						throw new InterruptedException();
					} else if (name1.charAt(i) == ' ') {
						throw new Exception();
					}
				}
			} catch (InterruptedException e) {
				System.out.println("������ �ѱ��� ����� �Է����ּ���");
			} catch (Exception e) {
				System.out.println("���⸦ ���������ּ���");
			}
			if (map.containsKey(name1)) {
				System.out.println(name1);
				System.out.println("�л��� ID : " + map.get(name1).getId());
				System.out.println("��й�ȣ : " + map.get(name1).getNum());
			} else {
				System.out.println("�л��� �̸��� �ٽ� �Է����ּ���");
			}
		}
	}

}

class Student1 {
	private String id;
	private int num;

	Student1(String na, int n) {
		id = na;
		num = n;
	}

	public String getId() {
		return id;
	}

	public int getNum() {
		return num;
	}
}