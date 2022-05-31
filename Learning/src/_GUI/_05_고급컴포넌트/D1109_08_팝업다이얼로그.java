package _GUI._05_고급컴포넌트;

import javax.swing.JOptionPane;

public class D1109_08_팝업다이얼로그 {
/*
 	*JOptionPane
		간단하고 유용한 팝업 다이얼로그 지원
		static 의 타입의 간단한 메소드 이용

 	*입력 다이얼로그
		한 줄을 입력 받는 다이얼로그
		String JOptionPane.showInputDialog(String msg)

	*확인 다이얼로그
		사용자로부터 Yes/No 등 확인을 입력받는 다이얼로그
		int JOptionPane.showConfirmDialog(Component parentComponent, Object msg, String title, int optionType)

	*메시지 다이얼로그
		단순 메시지를 출력하는 다이얼로그
		void JOptionPane.showMessageDialog(Component parentComponent, Object msg, String title, int messageType)


	**JOptionPane 팝업 다이얼로그와 코드 샘플   		 */
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		// name에 “Java Kim” 리턴
		// 사용자가 입력 없이 창을 닫으면 null 리턴
		
		int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?", 					"Confirm", JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.CLOSED_OPTION) {
			// 사용자가 "예"나 "아니오"의 선택없이 다이얼로그 창을 닫은 경우
		}
		else if(result == JOptionPane.YES_OPTION) {
			// 사용자가 "예"를 선택한 경우
			
		}
		else {	// 사용자가 "아니오"를 선택한 경우
		}
		
		
		JOptionPane.showMessageDialog(null, "조심하세요", "Message", 
				JOptionPane.ERROR_MESSAGE); 

	}

}
