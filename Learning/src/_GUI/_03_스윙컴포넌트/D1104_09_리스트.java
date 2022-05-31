package _GUI._03_스윙컴포넌트;

public class D1104_09_리스트 {
/*	
	 *JList<E> 
		-리스트 컴포넌트란?
			여러 개의 아이템을 리스트 형식으로 보여주고 선택하는 컴포넌트
			JComboBox<E>와 기본적으로 같은 기능
			JScrollPane에 JList<E>를 삽입하여 스크롤 가능
	
		-JList<E>
			JDK7부터 제네릭 리스트로 바뀜
			<E>에 지정된 타입의 객체만 저장하는 리스트
	
	*생성자
		JList<E>()
		JList<E>(Vector listData)  벡터로부터 아이템을 공급받는 리스트
		JList<E>(Object [] listData)
		
		
	*리스트 생성 방법
		1. 객체 배열로 아이템 제공
			String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", "peach", 
						"berry", "strawberry", "blackberry"};
			JList<String> strList = new JList<String>(fruits);

		2. Vector로 아이템 제공
			Vector v = new Vector();
			v.add("apple");
			v.add("banana");
			v.add("kiwi"); 
			JList<String> vList = new JList<String>(v);

		3. 빈 JList 컴포넌트를 생성하고 setListData()로 아이템 제공
			ImageIcon [] images = {
				new ImageIcon("images/icon1.png"), 	
				new ImageIcon("images/icon2.png"),  
				new ImageIcon("images/icon3.png"),  
				new ImageIcon("images/icon4.png")
			};
			JList<ImageIcon> imageList = new JList<ImageIcon>();
			imageList.setListData(images);
			
		4. 스크롤 지원
			JList<String> scrollList = new JList<String>(fruits);
			new JScrollPane(scrollList);

**리스트의 아이템 변경
	 *JList<E>의 특징
		JList<E>(Vector listData)나 JList<E>(Object [] listData)로 
		리스트가 생성되고 나면 벡터나 배열을 수정해도 리스트 수정 안됨
		
		-리스트를 수정하는 간단한 방법
			JList<E>의 setListData()를 호출
		-리스트에 수정된 벡터나 배열을 새로 달아주는 방법
			Vector<String> v = new Vector<String>();
			v.add("황기태");
			v.add("이재문");
			JList<String> nameList = new JList<String>(v);

			// 벡터 v를 수정하고, 벡터 v를 리스트에 다시 달기
			v.add("김남윤");
			nameList.setListData(v);

*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
