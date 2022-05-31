package _GUI._04_그래픽컴포넌트;

public class D1108_03_Color_Font클래스 {
/*
 **Color 
	:하나의 색을 표현하는 클래스
		-Red, Green, Blue 의 3 성분으로 구성
		-각 성분의 크기는 0-255(8비트)

 	*생성자	
		Color(int r, int g, int b)
			-red(r), green(g), blue(b) 값, sRGB 색 생성
			-new Color(255, 0, 0) ; // 완전 빨강색
		Color(int rgb)
			-rgb 정수 값은 총 32비트 중 하위 24 비트만이 유효하고  0x00rrggbb로 표현 
			-하위 8비트는 blue, 그 다음 상위 8 비트는 green, 그 다음 8 비트는 red  성분
			-new Color(0x0000ff00);  // 완전 초록

	*색을 사용하는 다른 방법
		Color.BLUE 등의 static 상수 활용

	ex) 
	Graphics g;
	g.setColor(new Color(255, 0, 0)); 	// 빨간색
	g.setColor(new Color(0x0000ff00)); 	// 초록색
	g.setColor(Color.YELLOW); 	// 노란색


**Font
	:폰트를 표현하는 클래스

 	*생성자
		Font(String fontFace, int style, int size)
			-fontFace는 "고딕체", "Arial" 등
			-style은 Font.BOLD, Font.ITALIC , Font.PLAIN 중 하나
			-size는 픽셀 단위의 크기

 	*Graphics 객체에서 색상과 폰트 설정
		-void setColor(Color color)
			:칠할 색을 color로 지정
		-void setFont(Font font)
			:폰트를 font로 지정

	ex)
	Graphics g;
	Font f = new Font("Arial", Font.ITALIC, 30);
	g.setFont(f);
	g.setColor(Color.RED);
	g.drawString("How much", 30,30);

	
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
