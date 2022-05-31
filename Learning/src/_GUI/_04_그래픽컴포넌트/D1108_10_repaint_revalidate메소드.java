package _GUI._04_그래픽컴포넌트;

public class D1108_10_repaint_revalidate메소드 {
/*
**repaint()메소드
 	*강제로 컴포넌트의 다시 그리기 지시하는 메소드
		component.repaint();
		자바 플랫폼에게 지금 당장 컴포넌트를 다시 그리도록 지시
			컴포넌트의 페인팅 과정 진행
			
	*repaint()가 필요한 경우
		-프로그램 내에서 컴포넌트의 모양과 위치를 변경한 경우
			repaint()를 호출하면 자바 플랫폼에 의해 컴포넌트의 paintComponent()가 호출됨
		-부모 컴포넌트부터 다시 그리는 것이 좋음
	*만일 컴포넌트의 위치가 변경된 경우
		repaint()가 불려지면 이 컴포넌트는 새로운 위치에 다시 그려지지만 이전 위치에 있던 자신의 모양이 남아 있기 때문에 부모 컴포넌트의 repaint()를 호출하는 것이 좋음
		component.getParent().repaint();

**revalidate()메소드
 
 	*컨테이너의 배치관리자에게 자식 컴포넌트들을 다시 배치 하도록 지시하는 메소드
	
	*revalidate()가 필요한 경우
		컨테이너에 변화가 생겨 다시 그려야할 때
		프로그램에서 컨테이너에 컴포넌트 새로 삽입, 삭제

		container.revalidate(); // 컨테이너에 부착된 컴포넌트의 재배치 지시
		container.repaint(); // 컨테이너 다시 그리기 지시

 
 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
