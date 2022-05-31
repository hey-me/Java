package ch13_컬렉션프레임워크;

import java.util.*;

public class D1022_03_ArrayList {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");	//2번째 index에 넣으면 2다음부터는 자동으로 밀림
		list.add("iBATIS");
		
		int size=list.size();
		System.out.println("총객체수:"+size);
		
		String skill=list.get(2);
		System.out.println(skill);
		
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		list.remove(2);//2번째꺼를 지우면 자동으로 당겨짐
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		for(String str:list) {
			System.out.println(str); 
		}
		System.out.println();
		
//		배열은 index가 있어서 전체 출력이 가능하지만 set은 index가 없으므로 iterator를 이용해야함
		
		Iterator<String> is=list.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
	
		
		
		
		
	}

}
