package _GUI._04_그래픽컴포넌트;

public class D1108_01_페인트컴포넌트 {
/*
 	*스윙의 그리기 기본 철학
		-모든 컴포넌트는 자신의 모양을 스스로 그린다.
		-컨테이너는 자신을 그린 후, 그 위에 자식들에게 그리기 지시
		
 	*public void paintComponent(Graphics g)
		-스윙 컴포넌트가 자신의 모양을 그리는 메소드
		-JComponent의 메소드 : 모든 스윙 컴포넌트가 이 메소드를 가지고 있음
		-컴포넌트가 그려져야 하는 시점마다 호출
			:크기가 변경되거나, 위치가 변경되거나 컴포넌트가 가려졌던 것이 사라지는 등
			
	*Graphics 객체
		-java.awt.Graphics
		-컴포넌트 그리기에 필요한 도구를 제공하는 객체
			:색 지정, 도형 그리기, 클리핑, 이미지 그리기 등의 메소드 제공
			
 	*사용자가 원하는 모양을 그리고자 할 때
		-paintComponent(Graphics g) 오버라이딩
			ex)
			class MyComponent extends JXXX { // JXXX는 기존의 스윙 컴포넌트
				...
				public void paintComponent(Graphics g) { // 오버라이딩
					... 필요한 코드 작성 ...
				}
			}


*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
