package _GUI._05_고급컴포넌트;

public class D1108_04_툴팁 {
/*
 	*툴팁
		:스윙 컴포넌트를 설명하는 팁 문구 => 팁 문구는 문자열만 가능
		:컴포넌트 위에 마우스를 올리면 잠깐 나타났다가 사라짐

 	*툴팁 생성
		-JToolTip 클래스 이용(복잡하므로 권하지 않음)
		-JComponent.setToolTipText(String msg) 이용 : 권장

		// 버튼에 툴팁을 다는 예
			JButton b = new JButton("open");
			b.setToolTipText("클릭하면 파일을 엽니다");

	*툴팁 활성화 및 툴팁 지연 시간 제어
		-ToolTipManager 클래스 이용
		-툴팁 제어 기능은 모든 툴팁에 일괄 적용
		
		(1)툴팁 매니저 객체 생성
			ToolTipManager m = ToolTipManager.sharedInstance();

		(2)툴팁 활성화/비활성화
			m.setEnabled(false); // 툴팁이 보이지 않게 함
	
		(3)툴팁이 나타나는 최초 지연시간 제어
			m.setInitialDelay(1000)  // 마우스가 올라온 후 1000 ms 후에 툴팁 출력

		(4)툴팁이 켜져 있는 지연 시간 제어
			m.setDismissDelay(1000) // 툴팁이 켜져 있는 지속 시간을 1000ms로 설정







 */
	
	public static void main(String[] args) {
		
	}

}
