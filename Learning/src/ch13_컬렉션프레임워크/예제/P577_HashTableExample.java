package ch13_�÷��������ӿ�ũ.����;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class P577_HashTableExample {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("���̵�� ��� �Է�");
			System.out.print("���̵� : ");
			String id = scanner.next();
			System.out.print("��� : ");
			String pa = scanner.next();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pa)) {
					System.out.println("�α��εǾ����ϴ�");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�");
			}

		}
	}

}
