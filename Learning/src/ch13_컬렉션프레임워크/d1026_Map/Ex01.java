package ch13_�÷��������ӿ�ũ.d1026_Map;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {

		Map<String, String> map =new HashMap<String, String>();
		map.put("apple", "���");
		map.put("mellon", "�޷�");
		map.put("pear", "��");
		
		Scanner scanner = new Scanner(System.in);
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
