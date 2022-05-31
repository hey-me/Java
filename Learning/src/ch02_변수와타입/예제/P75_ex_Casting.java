package ch02_변수와타입.예제;

public class P75_ex_Casting {

	public static void main(String[] args) {

		int intValue=44032;
		char charValue=(char)intValue;
		System.out.println(charValue);
		
		long longValue=500; //128일때 (byte)로 변환하면 -128 \\ 128이 없으므로 사이클 넘어서 -128
		intValue = (int)longValue; //(short)로도 변환 가능. long이 더 크므로
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue =(int)doubleValue;
		System.out.println(intValue);  //3.14를 정수로 출력하니 3으로 출력
		
		
	}

}
