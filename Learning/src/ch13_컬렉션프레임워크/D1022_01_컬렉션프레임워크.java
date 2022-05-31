package ch13_컬렉션프레임워크;


public class D1022_01_컬렉션프레임워크 {

	public static void main(String[] args) {
//		p.556
		Box[] ab=new Box[10];
//		배열은 자료를 저장함. ab라는 배열은 Box 인스턴스만 담을 수 있음.
//		배열 중간을 삽입하고 삭제하는 것은 프로그래머가 해야함.
//		배열은 index를 통해서 자료를 효율적으로 관리할 수 있음 
//		자료를 관리하는 도구를 자료구조라 함. 배열도 자료구조중 하나임
//		자료구조는 선형과 비선형으로 나뉘어짐. 배열은 선형. 선형은 LIST, 비선형은 Tree
//		트리는 D1022_02_자료구조 참고
		
		
//		List컬렉션(Linked)=선형
//		배열(array)보다 삽입과 삭제가 용이함
//		배열형식은 ArrayList, 연결이용이한건 LinkedList 이런걸 다 합치면 List컬렉션
//		컬렉션프레임워크, List컬렉션, Set컬렉션, Map컬렉션
//		달걀을 바구니에 왕창담으면 꺼낼때는 순서가 있지만 담을땐 순서가없음 이 때 바구니가 Set,
//		달걀을 트레이에 순서대로 넣으면 List컬렉션
//		Map은 지도를 볼때 좌표가 필요한 것처럼 key와 value값 필요, key는 중복이 되면 안됌
		
//		컬렉션프레임워크는 인터페이스도 있고 구현클래스도 있음->구현클래스를 가지고 객체생성
//		인터페이스끼리 상속할때는 extends써야함
//		Collection-[List-{ArrayList, Vector, LinkedList}, Set-{HashSet, TreeSet}, Map-{HashMap, Hashtable, TreeMap, Properties}]
//		컬렉션과 []안까지는 인터페이스임 컬렉션과 []는 상속관계임
		
//		List에서 메소드는 add() 두가지가 있는데 index를 지정할 수 없으면 맨 끝에 삽입됌
//		중복된 값도 저장 가능. 중복된것 저장안하려면 set프레임워크사용하기.
	}

}

class Box<T>{
	public T ob;
	Box(T ob) {
		this.ob=ob;
	}
}
