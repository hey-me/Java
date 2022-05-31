package _GUI._04_그래픽컴포넌트;

public class D1108_09_스윙의페인팅메카니즘 {

/*
 	*스윙 컴포넌트들이 그려지는 과정에 대한 이해 필요
		-바탕 컨테이너부터 그려짐(다음 슬라이드 참고)
	
	*스윙의 페인팅에 관여되는 JComponent 메소드
		void paint (Graphics g)  컴포넌트 자신과 모든 자손 그리기 
		void paintComponent (Graphics g)  컴포넌트 자신의 내부 모양 그리기 
		void paintBorder (Graphics g)  컴포넌트의 외곽 그리기
		void paintChildren (Graphics g)  컴포넌트의 자식들 그리기 (컨테이너의 경우)
		
		
 	*JComponent.paint()의 코드 구조
		public void paint(Graphics g) { // g가 아래 3개의 메소드에 그대로 전달된다.
			...
			paintComponent(g); // ① 컴포넌트 자신의 내부 모양 그리기
			paintBorder(g); // ② 컴포넌트 자신의 외곽 그리기
			paintChildren(g); // ③ 컴포넌트의 자식들 그리기
			...
		}

 	*개발자가 paintComponent()를 직접 호출하면 안됨
		paintComponent()는 페인팅 메카니즘에 의해 자동으로 호출됨

 	
 	
 	
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
