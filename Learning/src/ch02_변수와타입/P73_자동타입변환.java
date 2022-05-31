package ch02_변수와타입;

public class P73_자동타입변환 {

	public static void main(String[] args) {

		// 자동 타입 변환-작은 범위에서 큰 범위는 자동으로 변환.(char, boolean은 불가)

//		byte a = 10;
//		short b = 20;
//		int c = a; // => 가능..
//
//		char a=1500;
//		short b=0;
//		b=a;            //char를 다른 변수에 넣으면 오류.. char에는 음수 불가.하지만, 가능한 수일 때 강제변환 가능
////		
//		float d = 10.5f;
//		int e = 0;
////		//e=d;
//		d = e;
//
//		
//		byte bytevalue=65;
//		//char charvalue= bytevalue; //bytevalue가 어떤 수로 지정이 될지 모르기 때문에 오류남. 
//		char charvalue=40; //숫자로 지정시 가능
//		
		char a='a';
		byte b=127; //128불가 -128은 가능  
		short c=20;
		int d=30;
		long e=15L;

		a=10;
		//a=b;
		

	}

}
