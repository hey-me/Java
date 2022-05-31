package ch06_클래스;

public class D0902_4_ex1_hi호출 {

	public static void main(String[] args) {
//	호출
		hi();
		int num1 = 5, num2 = 10;
		sum(num1, num2);
		System.out.println(sum(num1, num2));
	}

	private static int sum(int a, int b) {
		int s = a + b;
		return s;
	}

//	정의
	private static void hi() {
		System.out.println("안녕하세요?");
		System.out.println("제 이름은 가나다입니다.");
		System.out.println("저는 광주에 삽니다.");
		System.out.println("만나서 반갑습니다.");
	}

}
