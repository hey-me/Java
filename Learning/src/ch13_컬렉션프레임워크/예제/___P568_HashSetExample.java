package ch13_컬렉션프레임워크.예제;

import java.util.*;

public class ___P568_HashSetExample {

	public static void main(String[] args) {

//		Set<String> set = new HashSet<String>();
		var set = new HashSet<String>();  // 아래 iterator에서 set부분 오류나는 이유는?
		
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
//		안되나봗ㅇ
//		for (int i = 0; i < set.size(); i++) {
//			String string = set.??
//			System.out.println();
//		}
		System.out.println("===============");
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : "+ set.size());
		
		iterator = set.iterator();
		for (String string : set) {
			System.out.println(string);
		}
		
		set.clear();
		if (set.isEmpty()) { System.out.println("비어있음");
			
		}
		
	}

}
