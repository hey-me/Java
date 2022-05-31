package _GUI._03_스윙컴포넌트;

import javax.swing.*;
import javax.swing.JRadioButton;

public class D1104_06_라디오버튼 extends JFrame {
/*
  
 	*JRadioButton
		-라디오버튼이란?
			여러 버튼으로 그룹을 형성하고, 하나만 선택되는 버튼
			다른 버튼이 선택되면 이전에 선택된 버튼은 자동으로 해제됨
		-체크박스와의 차이점
			체크 박스는 각 체크박스마다 선택/해제 가능
			라디오 버튼은 그룹에 속한 버튼 중 하나만 선택 상태가 됨
		-이미지를 가진 라디오버튼의 생성 및 다루기는 체크박스와 완전히 동일

	*생성자
		JRadioButton()
		JRadioButton(Icon image)
		JRadioButton(Icon image,boolean selected)
		JRadioButton(String text)
		JRadioButton(String text, Icon image)
		JRadioButton(String text, Icon image, boolean selected)
	
	*라디오 버튼 생성 과정
		1. 버튼 그룹 객체 생성  // 모두 선택 안되고 하나만 선택하도록 하게 하려고 그룹에 넣어줌 
			ButtonGroup group = new ButtonGroup();

		2. 라디오버튼 컴포넌트 생성
			JRadioButton apple= new JRadioButton("사과");
			JRadioButton pear= new JRadioButton("배");
			JRadioButton cherry= new JRadioButton("체리");

		3. 라디오 버튼을 버튼 그룹에 삽입
			group.add(apple);
			group.add(pear);
			group.add(cherry);

		4. 라디오 버튼을 컨테이너에 삽입
			container.add(apple);
			container.add(pear);
			container.add(cherry);


*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
