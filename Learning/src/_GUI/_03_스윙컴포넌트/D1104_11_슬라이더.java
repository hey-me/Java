package _GUI._03_스윙컴포넌트;

public class D1104_11_슬라이더 {
/*

	*JSlider
		슬라이더란? 마우스로 움직이면서 값을 선택하는 컴포넌트

	 *슬라이더 생성자
		JSlider()
		JSlider(int orientation)  수평 수직 방향 설정
		JSlider(int min, int max, int val) 
		JSlider(int orientation, int min, int max, int val)
			orientation 은 JSlider.HORIZONTAL과 JSlider.VERTICAL중 하나.
			min, max, val 값은 초기값

	 *슬라이더 방향 설정
		void setOrientation(int orientation)  
		orientation : JSlider.HORIZONTAL, JSlider.VERTICAL
		
	 *최대 최소 값 설정
		void setMaximum(int max)
		void setMinimum(int min)
		
	 *label 보이기/감추기
		void setPaintLabels(boolean b)
		b가 true이면 label 출력
		
	 *tick 보이기/감추기  .. 눈금
		void setPaintTicks(boolean b)
		b가 true이면 눈금 출력
 
	 *track 보이기/감추기   
		void setPaintTrack(boolean b)
		b가 true이면 track 출력
		
	 *큰 눈금 간격 지정
		void setMajorTickSpacing(int space)
	
	 *작은 눈금 간격 지정
		void setMinorTickSpacing(int space)
	 
	 *슬라이더 값 제어
		void setVaule(int n)
		=> n이 슬라이더의 값이 되며 이에 따라 슬라이더의 손잡이 위치가 변경된다.




*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
