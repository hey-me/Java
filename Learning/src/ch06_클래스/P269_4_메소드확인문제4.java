package ch06_클래스;

public class P269_4_메소드확인문제4 {

	public static void main(String[] args) {

		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
//		참조변수.메소드
	}

}
/*	오버로딩
		이름이 같은 메소드를 여러 개 만드는 것.
		매개값을 다양하게 받아 처리할 수 있도록 하기 위함.
		매개 변수의 타입, 개수, 순서 중 하나가 달라야 됨.
*/

class Printer {

	void println(int a) {
		System.out.println(a);
	}

	void println(boolean a) {
		System.out.println(a);
	}

	void println(double a) {
		System.out.println(a);
	}

	void println(String a) {
		System.out.println(a);
	}

}
