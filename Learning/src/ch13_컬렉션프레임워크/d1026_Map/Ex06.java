package ch13_�÷��������ӿ�ũ.d1026_Map;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		
//		5. �л��̸�, �а�, �й�, �������(�Ǽ���)�� �Է¹޾� ������ �� �ִ� Student Ŭ������ Student Ŭ������ ������ �� �ֵ��� 
//		ArrayList�� �����Ѵ�.
//		�л� �̸��� stop (��ҹ��ڹ���)�� �Էµ� ������ �л������͸� �Է¹޴´�. 
//		�Է��� ����Ǹ� ArrayList�� �Էµ� ��� �л� ������ iterator()�� �̿��Ͽ� ���� ���� ����ϰ�, 
//		�л��̸��� �˻��ؼ� �л��� ������ ����� �� �ֵ��� �ۼ��ϼ���. 
//		�л��̸��� '����'�� �Է��ϸ� ���α׷��� ����ǵ��� �ϼ���.
//		  - �Է�����) ȫ�浿, ��ǻ��,12345, 3.54
		Scanner s = new Scanner(System.in);
		
		Map<String, StudentEx06> map = new HashMap<String, StudentEx06>();
		map.put("��", new StudentEx06("�ڹ�", 1, 3));
		map.put("��", new StudentEx06("�ڹ�", 2, 4));
		map.put("��", new StudentEx06("���̽�", 1, 4.5));
		map.put("��", new StudentEx06("�ڹٽ�ũ��Ʈ", 1, 3.3));
		
		
		//trim �̿��ϱ� => ���� ������.
		
		System.out.print("�л� ������ �Է�");
		System.out.print("�л� �̸� �Է�");
		String name = s.next();
		while(!name.equals("stop")) {
			System.out.print("�л� �а� �Է�");
			String sub = s.next();
			System.out.print("�л� �й� �Է�");
			int num = s.nextInt();
			System.out.print("�л� ������� �Է�");
			double avg = s.nextDouble();
			
			map.put(name, new StudentEx06(sub, num, avg));
		}
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			StudentEx06 value = map.get(key);
		}
		//
		//
		//
		//
		//	
	}
}
class StudentEx06 {
	String name;
	String sub;
	int num;
	double avg;
	public StudentEx06(String sub,int num,double avg) {
		this.sub = sub; this.num = num; this.avg = avg;
	}
}
