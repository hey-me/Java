package ch13_�÷��������ӿ�ũ.d1026_Map;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("��", 1);
		map.put("��", 2);
		map.put("��", 3);
		
		Scanner s = new Scanner(System.in);
		boolean is = true;
		while(is) {
//			try {
//				System.out.print("�̸� �Է�");
//				String name = s.next();
//				if(name.equals("����")) {
//					System.out.println("����");
//					is = false;
//					break;
//				}
//			} catch (Exception e) {
//				System.out.println("�̸��Է�/.?????");
//			}
			System.out.print("�̸� �Է�");
			String name = s.next();
			if(name.equals("����")) {
				System.out.println("����");
				is = false;
				break;
			}
			
			try {
				System.out.print("����Ʈ���� �Է�");
				int score = s.nextInt();
				map.put(name, score);
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼ���");
				s.next();
				
			}
//			System.out.print("����Ʈ���� �Է�");
//			int score = s.nextInt();
//			map.put(name, score);
		}
		
		try {
			
		} catch (Exception e) {

		}
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+", "+value);
		}
				
	}

}
