package ch02_변수와타입;

public class Ex_출력실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		char a = 'A'; //char타입에 맞게 저장됨. =>(문자로 출력)
//		int b = 'A';  //int타입에 맞게 저장됨. =>(정수로 출력)
//
//		System.out.println(b);
//

		int b = '김';
		System.out.println(b);
		System.out.printf("%x\n", b); // "%x",___ 16진수로 출력,%o는 8진수 \n을 붙이면 줄 바꿈

		int c = '이';
		System.out.println(c); // 숫자 출력
		System.out.printf("%x", c); // 숫자를 16진법으로 출력

	}

}
