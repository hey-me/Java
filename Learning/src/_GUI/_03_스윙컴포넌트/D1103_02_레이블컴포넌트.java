package _GUI._03_스윙컴포넌트;

public class D1103_02_레이블컴포넌트 {	
/*
		*JLabel의 용도 
			- 문자열이나 이미지를 컴포넌트화 하여 출력하기 위한 목적
		
		*생성자
			- JLabel()  빈 레이블
			- JLabel(Icon image)  이미지 레이블
			- JLabel(String text)  문자열 레이블
			- JLabel(String text, Icon image, int hAlign)  문자열과 이미지를 모두 가진 레이블
				Align : 수평 정렬 값으로, 
				SwingConstants.LEFT, SwingConstants.RIGHT, SwingConstants.CENTER 중 하나
			
		   	*Icon image ...
				ImageIcon(Image image)
				ImageIcon(String filename)


		*단순 텍스트 만을 가진 레이블 컴포넌트 생성
			JLabel textLabel = new JLabel("사랑합니다");
		
		*이미지를 가진 레이블 컴포넌트 생성
			-이미지 파일로부터 이미지를 읽기 위해 ImageIcon 클래스 사용  
			// 이미지파일은 프로젝트 폴더에 넣어야됨. 패키지에 넣으면 쓸 수 없음
			-다룰 수 있는 이미지 : png, gif, jpg
				> sunset.jpg의 경로명이  "images/sunset.jpg"인 경우
					ImageIcon image = new ImageIcon("images/sunset.jpg");
					JLabel imageLabel = new JLabel(image);
		
		*수평 정렬 값을 가진 레이블 컴포넌트 생성
			-텍스트 이미지 모두 출력하고자 하는 경우 수평 정렬 지정
				ImageIcon image = new ImageIcon("images/sunset.jpg");
				JLabel label = new JLabel("사랑합니다", image, SwingConstants.CENTER);

		

*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
