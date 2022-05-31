package ch13_�÷��������ӿ�ũ.d1026_Map;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1: �̸� �˻�, 2: ���");

		int n = s.nextInt();
		Map<String, StudentEx03> map = new HashMap<String, StudentEx03>();
		map.put("��", new StudentEx03("kim", "1"));
		map.put("��", new StudentEx03("lee", "2"));
		map.put("��", new StudentEx03("park", "3"));

		switch (n) {
		case 1: {
			try {
				System.out.print("�̸� �˻�");
				String str = s.next();
				StudentEx03 show = map.get(str);
				System.out.println(show.id + ", " + show.number);
			} catch (NullPointerException e) {
				System.out.println("��ϵ��� ���� �����Դϴ�.");
			} 
			break;
		}
		case 2: {
			Set<String> keySet = map.keySet();
			Iterator<String> keyIterator = keySet.iterator();
			while (keyIterator.hasNext()) {
				String key = keyIterator.next();
				StudentEx03 value = map.get(key);
				System.out.println("�̸�:" + key + ", id:" + value.id + ", ��ȣ:" + value.number);
			}
			break;
		}
		}

	}
}

class StudentEx03 {
	String id;
	String number;

	public StudentEx03() {
//		this(null, null);
	}

	public StudentEx03(String id, String number) {
		this.id = id;
		this.number = number;
	}

	String show() {
		return "id: " + id + ", number: " + number;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	//>????
}