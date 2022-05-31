package _GUI._03_스윙컴포넌트;

public class D1103_05_체크박스에서item이벤트처리 {	
/*

	*Item 이벤트
		:체크 박스나 라디오버튼의 선택 상태가 바뀔 발생하는 이벤트
			-마우스나 키보드로 체크박스를 선택 상태를 바꾸는 경우
			-프로그램에서 선택 상태를 바꾸는 경우
				JCheckBox c = new JCheckBox("사과");
				c.setSelected(true); // 선택 상태 변경

 	*ItemListener 인터페이스의 추상 메소드
		void itemStateChanged(ItemEvent e)
		// 체크박스의 선택/해제 상태가 변하는 경우 호출
		 
	*ItemEvent의 주요 메소드
		int getStateChange()
		//리턴 값은 선택된 경우 ItemEvent.SELECTED, 해제된 경우 ItemEvent.DESELECTED
		 
		Object getItem()
		//이벤트를 발생시킨 아이템 객체 리턴, 체크박스의 경우 JCheckBox 컴포넌트의 레퍼런스 리턴
*/	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
