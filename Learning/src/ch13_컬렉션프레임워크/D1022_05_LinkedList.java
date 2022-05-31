package ch13_컬렉션프레임워크;

import java.util.*;

public class D1022_05_LinkedList {

	public static void main(String[] args) {
//		ArrayList와 방법은 같으나 내부구조가 다름
//		중간에 삽입하거나 삭제하면 링크만 변경 해주면 됌
//		삽입/삭제가 빈번하게 발생하는 데이터를 저장할 때 사용하면 됌.
		
		List<String> list1=new ArrayList<String>();
		List<String> list2=new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간: "+ (endTime-startTime)+"ns");
		//오래걸리는 최대시간을 구하는것
		
		startTime=System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+ (endTime-startTime)+"ns");
		
	}

}
