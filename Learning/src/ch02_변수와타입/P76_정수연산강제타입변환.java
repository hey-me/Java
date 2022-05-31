package ch02_변수와타입;

public class P76_정수연산강제타입변환 {

	public static void main(String[] args) {

//		long a=10;
//		short b=20;
//		int d=0;
//		d=(int)a+b;

		short a = 130;
		byte b = 0;
		int c = 0;
		long d = 130;

		c = a + b;
		// c=a+d; //c를 long으로 바꾸기/a+d를 int로 바꾸기 or d만 int로 바꾸기
		c = (int) (a + d);
		// c=(int)a+d; /a만 int로 바뀌지만 d는 long이기 때문에 오류
		c = a + (int) d;

		System.out.println(c);

		//뒷자리(한자리) 없애고 싶을때 *10  /10 
		//두자리 없애고 싶을 때 *100    /100
	
	}

}
