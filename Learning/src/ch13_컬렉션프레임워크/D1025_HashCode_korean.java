package ch13_컬렉션프레임워크;

public class D1025_HashCode_korean {

	public static void main(String[] args) {

		//String 클래스의 경우 특수함. 문자열이 같으면 HashCode가 같음.
		String a = "Korea";
		String b = "Korea";
		String c = a +"n";
		String d = "Korean";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}

}
