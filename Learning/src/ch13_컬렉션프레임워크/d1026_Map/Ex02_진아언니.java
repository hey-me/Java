package ch13_�÷��������ӿ�ũ.d1026_Map;

import java.util.*;

public class Ex02_���ƾ�� {

	public static void main(String[] args) {

//		      1. (����, �ѱ�) �ܾ ������ HashMap�� �����ϰ� ����� �ѱ��� �˻��ϴ� ���α׷��� �ۼ��غ�����. "exit"�� �Է��ϸ� ����ǵ��� �ϼ���.
		Map<String, String> map = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);

		String eng;
		String kor = null;
		boolean is = true;
		here1: while (true) {

			System.out.print("��� �Է�: ");
			eng = s.nextLine();
			if (eng.equals("�׸�")) {
				break;
			}
			boolean t = true;
			for (int i = 0; i < eng.length(); i++) {
				if (String.valueOf(eng.charAt(i)).matches("[a-zA-z]")) {
					t = true;
				} else {
					System.out.println("����� �Է��ϼ���");
					t = false;
					break;
				}
			}
			if (t == false) {
				continue;
			}

			here2: while (true) {
				for (int y = 0; y < 1; y++) {
					System.out.print("�ؼ� �Է�: ");
					kor = s.nextLine();
					if (kor.equals("�׸�")) {
						break;
					}
					for (int i = 0; i < kor.length(); i++) {
						if (String.valueOf(kor.charAt(i)).matches("[��-����-�Ӱ�-�R]")) {
							t = true;
						} else {
							System.out.println("�ѱ۷� �Է��ϼ���");
							t = false;
							break;
						}
						if (t == false) {
							break here2;
						}
					}

				}
			}
			map.put(eng, kor);
		}

		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print("�˻��� ��� �Է�: ");
			String key = s.next();
			String value = map.get(key);
			if (key.equals("stop")) {
				System.out.println("�����մϴ�.");
				break;
			}
			if (key != map.get(key)) {
				System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
			} else {
				System.out.println(key + "�� �ش��ϴ� �ѱ���: " + value);
			}
		}

	}

}
