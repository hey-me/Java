package _GUI._03_스윙컴포넌트;

public class D1104_09_리스트아이템변경 {
/*
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
