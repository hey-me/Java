package ch13_컬렉션프레임워크.d1026_Map;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {

		Map<String, String> map =new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("mellon", "메론");
		map.put("pear", "배");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.print("영어 단어 입력");
			String str = scanner.next();
			if (str.equals("exit")) {
				System.out.println("시스템 종료");
				System.exit(0);
			}
			if(map.get(str)==null) {
				System.out.println("등록된 단어가 없습니다.");
			} else {
				System.out.println(map.get(str));
			}
			
		}
		
		
	}

}
