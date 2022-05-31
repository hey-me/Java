package _GUI._05_고급컴포넌트;

public class D1109_13_오디오클립에Line이벤트처리 {
/*

	*Line 이벤트
		:오디오 재생 과정에서 오디오 클립(Clip 객체)에 발생하는 이벤트
		-오디오가 재생을 시작할 때
		-재생이 중단되었을 때
		-오디오 클립이 닫혔을 때

	*LineListener 인터페이스
		void update(LineEvent e)
			오디오가 재생을 시작할 때, 중단할 때, 클립이 닫혔을 때 호출
		-LineEvent 객체 
			Line getLine()
				이벤트가 발생하는 오디오 클립 객체(Clip은 Line 인터페이스 상속받음)
			long getFramePosition()
				오디오 내에 이벤트가 발생한 프레임 위치(0부터)
			LineEvent.Type.getType()
				이벤트 종류로 다음 4가지 값 중 하나 리턴
				LineEvent.Type.OPEN  Clip.open() 호출시
				LineEvent.Type.START  Clip.start() 호출시 
				LineEvent.Type.STOP  Clip.stop() 호출시
				LineEvent.Type.CLOSE  Clip.close() 호출시

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
