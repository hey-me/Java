package ch03_연산자.예제;

public class P110_ex_SignOperator {

	public static void main(String[] args) {

		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1); // result1=-100
		System.out.println("result2=" + result2); // result2=100

		byte b = 100;
		// byte result3 = -b; //정수형으로 바뀌기 때문에 오류
		int result3 = -b; // -100
		System.out.println("result3=" + result3); // result3=-100
	}

}
