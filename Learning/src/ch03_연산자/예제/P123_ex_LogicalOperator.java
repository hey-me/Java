package ch03_연산자.예제;

public class P123_ex_LogicalOperator {

	public static void main(String[] args) {

		int charCode = 'A';
		if ((charCode >= 65/*'A'가능*/) & (charCode < 90)) {
			System.out.println("대문자군요");
		}	//T "대문자군요"  둘 다 만족하므로 출력

		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자군요");
		}	//F  첫번째가 F, 두번째는 볼 필요 없음

		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자군요");
		}	//F 첫번째는 T, 두번째는 F

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}	//T "2 또는 3의 배수군요" T, T

		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}	//T "2 또는 3의 배수군요" T
	}

}
