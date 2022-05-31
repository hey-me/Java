package ch13_컬렉션프레임워크.예제;

import java.util.*;

public class P584_확인문제9 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			if(maxScore < entry.getValue()) {	maxScore = entry.getValue(); name = entry.getKey();}
			totalScore += entry.getValue();
			System.out.println(key + ":" + value);
		}
		System.out.println("평균점수:"+ totalScore/map.size());
		System.out.println("최고점수:"+ maxScore);
		System.out.println("최고점수를 받은 아이디:"+ name);
		
	}
}
