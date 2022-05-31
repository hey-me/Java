package ch13_컬렉션프레임워크;

import java.util.Iterator;
import java.util.Map;

public class D1025_Map컬렉션 {
/*
	*Map 컬렉션
		키와 값으로 구성된 Map.Entry
		키는 중복 저장될 수 없으나 값은 중복 저장될 수 있음.
			기존의 키와 동일한 키로 값을 저장하면 기존 값은 없어지고 새로운 값으로 대체
			(예를 들어 학번, 주민번호)
			
		V put(K key, V value)	
		boolean containsKey(Object key)	
		boolean containsValue(Object Value)
		Set<Map.Entry<K.V>> entrySet()
		V get(Object key)
		Set<K> keySet ...
		....	
	

	public static void main(String[] args) {
		
		Map<String, Integer> map = args;
		map.put("홍길동", 30);
		int score = map.get("홍길동");
		map.remove("홍길동");
		
		Map<K,V> map =args;
		Set<K> keySet = map.keySet();
		Iterator<K> keyIterator = keySet.iterator();
		
		
	}
 */
}
