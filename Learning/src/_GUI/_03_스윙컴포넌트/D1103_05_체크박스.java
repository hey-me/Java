package _GUI._03_스윙컴포넌트;

public class D1103_05_체크박스 {
/*	
	*JCheckBox
		선택(selected)과 비선택(deselected)의 
   		두 상태만 가지는 체크 버튼

	*생성자
		JCheckBox()  빈 체크박스
		JCheckBox(String text)  문자열 체크박스
		JCheckBox(String text, boolean selected)
		JCheckBox(Icon image) 이미지 
		JCheckBox(Icon image, boolean selected)
		JCheckBox(String text, Icon image) 문자와 이미지
		JCheckBox(String text, Icon image, boolean selected)
			selected: true 이면 선택 상태로 초기화. 디폴트는 해제상태
		
	*문자열 체크 박스
		-"사과" 텍스트를 가진 체크박스 생성
			JCheckBox c = new JCheckBox("사과");
		-"배" 텍스트를 가지고 선택 상태로 체크박스 생성
			JCheckBox c = new JCheckBox("배", true);
		-체크 박스 모양   이 명료하게 출력되고 사용자는 이것을 체크
 	
 	*이미지 아이콘을 가진 체크 박스 생성 예
		체크 박스 모양    이 출력되지 않음
		선택 상태를 표현하는 이미지 아이콘을 따로 지정해야 함
			cherry.jpg 이미지와 "체리" 텍스트를 가진 체크 박스 생성 
			예)	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
				ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
				JCheckBox cherry = new JCheckBox("체리", cherryIcon);
				cherry.setSelectedIcon(selectedCherryIcon); // 선택 상태의 이미지 달기

*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
