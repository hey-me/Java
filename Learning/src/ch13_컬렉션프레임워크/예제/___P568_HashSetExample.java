package ch13_�÷��������ӿ�ũ.����;

import java.util.*;

public class ___P568_HashSetExample {

	public static void main(String[] args) {

//		Set<String> set = new HashSet<String>();
		var set = new HashSet<String>();  // �Ʒ� iterator���� set�κ� �������� ������?
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
//		int size = set.size();
//		System.out.println(size);
		System.out.println(set.size());
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		for (String string : set) {
			System.out.println(string);
		}
//		�ȵǳ��T��
//		for (int i = 0; i < set.size(); i++) {
//			String string = set.??
//			System.out.println();
//		}
		System.out.println("===============");
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü�� : "+ set.size());
		
		iterator = set.iterator();
		for (String string : set) {
			System.out.println(string);
		}
		
		set.clear();
		if (set.isEmpty()) { System.out.println("�������");
			
		}
		
	}

}
