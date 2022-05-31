package ch02_변수와타입;

public class P74_강제타입변환 {

	public static void main(String[] args) {

		// 강제타입변환  강제형변환

		char a = 150;
		byte b = 127;
		short c = 128;
		int d = 30;
		long e = 15L;

		// c=b;
		b = (byte) c; // (byte)를 앞에 붙여줌.

		// 원래 byte에 128을 넣으면 오류가 나는데. c인 128을 넣으면 왜 오류가 안나나?
		System.out.println(b);
		// 출력하면 -128이 나옴.. 강제형변환을 하면 표현 범위를 벗어나므로 싸이클 발생하여 하나 큰 것 나옴
		//127을 넘어 제일 작은 -128 나옴		

	//작은 허용 범위 타입 = (작은 허용 범위 타입)큰 허용 범위 타입 =>강제 타입 변환 //범위에서 벗어나면 사이클 돌아감
	
		int intvalue = 65;
		char charvalue = (char)intvalue;
		System.out.println(charvalue);  //"A"가 출력됨

		double doubleValue=3.14;
		int intValue = (int)doubleValue;
		System.out.println(intValue);  //소수를 정수로 변환하므로 소숫점 뒤 숫자는 잘림. =>3.14가 3으로 출력
		
	}

}
