package ch13_�÷��������ӿ�ũ.d1026_Map;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {

		Map<String, String> map =new HashMap<String, String>();
		map.put("apple", "���");
		map.put("mellon", "�޷�");
		map.put("pear", "��");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("1. �ܾ� �Է� 2. �ܾ� �˻�");
			int n = scanner.nextInt(); 
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
				map.put(en, ko);
				break;

			case 2:
				while(true) {
					System.out.print("���� �ܾ� �Է�");
					String str = scanner.next();
					if (str.equals("exit")) {
						System.out.println("�ý��� ����");
						System.exit(0);
					}
					if(map.get(str)==null) {
						System.out.println("��ϵ� �ܾ �����ϴ�.");
					} else {
						System.out.println(map.get(str));
					}	
				}
			}
			
		}
		
		
	}

}
