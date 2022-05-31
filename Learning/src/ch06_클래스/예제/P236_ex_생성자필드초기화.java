package ch06_클래스.예제;

public class P236_ex_생성자필드초기화 {

	public static void main(String[] args) {

		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);

		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}

class Korean {

	String nation = "대한민국";
	String name;
	String ssn;

	Korean(String n, String s) {
		name = n;
		ssn = s;
	}
}