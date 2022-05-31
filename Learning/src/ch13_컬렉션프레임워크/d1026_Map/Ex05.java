package ch13_컬렉션프레임워크.d1026_Map;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김", 1);
		map.put("이", 2);
		map.put("박", 3);
		
		Scanner s = new Scanner(System.in);
		boolean is = true;
		while(is) {
//			try {
//				System.out.print("이름 입력");
//				String name = s.next();
//				if(name.equals("종료")) {
//					System.out.println("종료");
//					is = false;
//					break;
//				}
//			} catch (Exception e) {
//				System.out.println("이름입력/.?????");
//			}
			System.out.print("이름 입력");
			String name = s.next();
			if(name.equals("종료")) {
				System.out.println("종료");
				is = false;
				break;
			}
			
			try {
				System.out.print("포인트점수 입력");
				int score = s.nextInt();
				map.put(name, score);
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
				s.next();
				
			}
//			System.out.print("포인트점수 입력");
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
