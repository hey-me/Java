package ch02_변수와타입;

public class P83_문자열강제타입변환 {

	public static void main(String[] args) {

		String str = "10";

		byte value = Byte.parseByte(str); // str을 byte로 강제형변환

		short s1 = Short.parseShort(str);

		int s2 = Integer.parseInt(str);

		System.out.println(value);
		System.out.println(s1);
		System.out.println(s2);

		// NumberFormatException. Value out of range
		String a = "1000";
		byte b = Byte.parseByte(a);
			// byte에 1000이 들어가지 못하므로 오류... 컴파일할때(작성할때)는 오류가 없지만 실행에는 오류
		System.out.println(a);

		// String " "안에 숫자가 아니고 문자면 parse를 썼을 때 무조건 오류

		String c=String.valueOf(3);
		System.out.println(c);
		
	}

}
