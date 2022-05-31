package ch03_연산자.예제;

public class P117_ex_CharOperation {

	public static void main(String[] args) {

		char c1 = 'A' + 1; //error가 안나는 이유: 리터럴(상수)끼리 더하기 때문에 문제가 안됨.(초기값 지정할 때)
		char c2 = 'A'; 
//		char c3 = c2 + 1; //65+1=66
		char c3 = (char)(c2 + 1); //65+1=66
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}

}
