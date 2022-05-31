package _GUI._02_Event;

public class D1102_5_Key이벤트와포커스 {
/*
	 * 키 입력 시, 다음 세 경우에 Key 이벤트 발생 
	  	키를 누르는 순간 
	 	누른 키를 떼는 순간 
	  	누른 키를 떼는 순간(Unicode 키의 경우에만)
	  
	 * 키 이벤트를 받을 수 있는 조건 
	  	모든 컴포넌트 가능하지만, 현재 포커스(focus)를 가진 컴포넌트
	 
	 * 포커스(focus) 
	  	컴포넌트나 응용프로그램이 키 이벤트를 독점하는 권한 
	  	컴포넌트에 포커스 설정 방법 : 다음 2 라인의 코드 필요
	  	1. component.setFocusable(true); // component가 포커스를 받을 수 있도록 설정
		2. component.requestFocus(); // component에 포커스 강제 지정
	  
	  
	 * 자바플랫폼마다 실행 환경의 초기화가 서로 다를 수 있기 때문에 다음 코드가 필요함
	 	component.setFocusable(true); 
	 	
	 * 스윙 프레임이 만들어질 포커스를 주고자 하는 경우
			-JFrame의 setVisible(true) 이후에  포커스를 주어야 함 
				setVisible(true); // 스윙 프레임 출력
				component.setFocusable(true);
				component.requestFocus(); 



	* 마우스로 컴포넌트를 클릭할 때 포커스 지정하는 방법
		-언제든지 필요할 때 포커스 줄 수 있음
			
			component.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					Component c = (Component)e.getSource(); // 클릭된 컴포넌트
					c.setFocusable(true);
					c.requestFocus(); 
				}
			}); // 예제 10-8에서 활용하였음
	
	*Virtual Key 가상키
	 	VK_LEFT
	 	VK_PGDN...
	 	
	 	
	* 키가 입력되면 키 정보를 가진 이벤트 객체 생성  : KeyEvent 객체
		-KeyEvent 객체가 리스너에 전달됨

	1.키의 문자 코드(유니코드) 알아내기, ... char KeyEvent.getKeyChar()
		-눌러진 키에 해당하는 문자 코드(유니코드) 리턴
		-눌러진 키가 문자 키인 경우에만 작동

	2.입력된 키의 가상 키 값 알아내기, ... int KeyEvent.getKeyCode()
		-모든 키에 대해 작동
		-입력된 키를 판별하기 위해 가상키(Virtual Key) 값과 비교
		-가상 키 값은 KeyEvent 클래스의 상수로 정의됨

	3.키 이름 문자열 리턴 ... String KeyEvent.getKeyText(int keyCode)
		-Static 메소드
		-매개변수 keyCode의 코드 값(가상 키)에 해당하는 키의 이름 문자열 리턴	
			F1 키의 경우 "F1", Shift 키의 경우 "SHIFT" 등의 문자열 리턴
 	
 ***
    a키를 누르면
     public void keyPressed(KeyEvent e){
     	char keyChar = e.getKeyChar();
     	int keyCode = e.getKeyCode();
     }
 =>>>
 	keyChar : 유니코드값 'a'
 	keyCode : VK_A
	 	
 
 ***
    <F5>키를 누르면
     public void keyPressed(KeyEvent e){
     	char keyChar = e.getKeyChar();
     	int keyCode = e.getKeyCode();
     }
 =>>>
 	keyChar : 유니코드값: CHAR_UNDEFINED
 	keyCode : VK_F5
	 	
 
 ***
    <F5>키를 떼면
     public void keyTyped(KeyEvent e){
     	char keyChar = e.getKeyChar();
     	int keyCode = e.getKeyCode();
     }
=>>>
 	keyChar : 없음
 	keyCode : 없음
	 	
	 	
*/

}
