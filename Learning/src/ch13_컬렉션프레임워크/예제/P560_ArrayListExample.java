package ch13_컬렉션프레임워크.예제;

import java.util.*;

public class P560_ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("자바");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " +size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		
		for (String string : list) {
			System.out.println(string);
			
		}
	}

}
