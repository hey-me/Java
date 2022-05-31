package review;

public class Test1_7_8 {

	public static void main(String[] args) {

		// 7
		char ch = 'z';
		// boolean b = (ch <= 122 );
		boolean b = (ch >= 'A' && ch <= 'Z') ||
					(ch >= 'a' && ch <= 'z') || 
					(ch >= '0' && ch <= '9');
		System.out.println(b);

		// 8
		char ch2 = 'A';
		char lowerCase = ch2 >= 'A' && ch <= 'Z' ? (char) (ch2 + 32) : ch2;
		System.out.println("ch2:" + ch2);
		System.out.println("ch2 to lowerCase:" + lowerCase);

	}

}
