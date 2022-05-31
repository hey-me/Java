package _GUI._03_스윙컴포넌트;

public class D1103_01__컴포넌트기반GUI프로그래밍 {
/*
	
	
	1.컴포넌트 기반 GUI프로그래밍
		스윙 패키지에 주어진 GUI컴포넌트 이용
		GUI 구성이 쉽다.
		자바 패키지에 제공하는 GUI 컴포넌트 한계
		일반적인 GUI 프로그램에 적합
	
	기초적인 스윙 컴포넌트와 상속관계 => ppt확인하기
	
	*스윙컴포넌트의 공통 메소드, JComponent의 메소드
		
		-컴포넌트의 모양과 관련된 메소드
			void setForeground(Color)  전경색 설정
			void setBackground(Color)  배경색 설정
			void setOpaque(boolean)  불투명성 설정
			void setFont(Font)  폰트 설정
			Font getFont()  폰트 리턴
		
		-컴포넌트의 위치와 크기에 관련된 메소드
			int getWidth()  폭 리턴
			int getHeight()  높이 리턴
			int getX()  x좌표 리턴
			int getY()  y좌표 리턴
			Point getLocationOnScreen()	 스크린 좌표상에서의 컴포넌트 좌표
			void setLocation(int, int)	위치 지정
			void setSize(int, int)	크기 지정
		
		-컴포넌트의 상태과 관련된 메소드
			void setEnabled(boolean)  컴포넌트 활성화/ 비활성화  => 사용할수있도록, 사용할수없도록 할 것인가 정함.
			void setVisivle(boolean)  컴포넌트 보이기/ 숨기기 => 보이게, 안보이게
			boolean isVisible()  컴포넌트의 보이는 상태 리턴 => 현재 보이는지 안보이는지 리턴해줌
			
		-컴테이너를 위한 메소드
			Component add(Component)  자식 컴포넌트 추가 
			void remove(Component)  자식 컴포넌트 제거
			void removeAll()  모든 자식 컴포넌트 제거
			Component[] getComponents()  자식 컴포넌트 배열 리턴
			Container getParent()  부모 컨테이너 리턴
			Container getTopLevelAncestor()  최상위 부모 컨테이너 리턴 => 작업하다보면 여러개의 패널 생김..
		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/	
	public static void main(String[] args) {

		
	}

}
