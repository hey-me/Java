package ch13_컬렉션프레임워크;

public class D1025_06_set컬렉션 {

	public static void main(String[] args) {

/*
	*set컬렉션 (set은 인터페이스)
		저장순서 유지되지 않으며(인덱스 사용 불가), ---list는 저장된 순서대로 사용가능. 
		객체 중복저장 안되고(같은 값은 중복저장 안됨..중복의 기준을 세워야됨.해시코드메소드, 이퀄메소드 오버라이딩해줘야됨), 
		하나의 null만 저장가능.
		
		객체추가 boolean add(E e)
		lterator<E> iterator() .....(반복자)저장된 객체를 한번씩 가져오는 반복자를 리턴 
		Set<String> set = ...;
		Iterator<String> iterator = set.iterator();
		
		*HashSet
			set인터페이스의 구현 클래스
			기본 생성자를 호출하여 생성
			Set<E> set = new HashSet<E>();
			int size = set.size(); => 저장된 객체 수 얻기
			출력...(set.size())
			향상된 for문 이용가능.
		
			트리셋은 정렬가능..?
		*TreeSet
			hashset과 같은데 거기에 정렬만 더해짐.
			중복된것은 hashset처럼 제거해주고 abcde 순서대로 순서 바꿔서 정렬해줌.
		
		
		 
 */
	}

}
