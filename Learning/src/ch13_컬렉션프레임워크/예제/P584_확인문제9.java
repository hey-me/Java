package ch13_�÷��������ӿ�ũ.����;

import java.util.*;

public class P584_Ȯ�ι���9 {

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
		System.out.println("�������:"+ totalScore/map.size());
		System.out.println("�ְ�����:"+ maxScore);
		System.out.println("�ְ������� ���� ���̵�:"+ name);
		
	}
}
