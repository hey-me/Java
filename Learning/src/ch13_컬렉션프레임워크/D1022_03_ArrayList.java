package ch13_�÷��������ӿ�ũ;

import java.util.*;

public class D1022_03_ArrayList {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");	//2��° index�� ������ 2�������ʹ� �ڵ����� �и�
		list.add("iBATIS");
		
		int size=list.size();
		System.out.println("�Ѱ�ü��:"+size);
		
		String skill=list.get(2);
		System.out.println(skill);
		
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		list.remove(2);//2��°���� ����� �ڵ����� �����
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		for(String str:list) {
			System.out.println(str); 
		}
		System.out.println();
		
//		�迭�� index�� �־ ��ü ����� ���������� set�� index�� �����Ƿ� iterator�� �̿��ؾ���
		
		Iterator<String> is=list.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
	
		
		
		
		
	}

}
