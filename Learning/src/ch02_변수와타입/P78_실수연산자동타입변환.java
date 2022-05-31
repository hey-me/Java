package ch02_변수와타입;

public class P78_실수연산자동타입변환 {
	
	public static void main(String[] args) { 

		short a = 1;
		byte b = 2;
		double c;
		long d = 10;

		// c = a / b;
		 c = (double)a / b; //0.5 
		//c=(double)(a/b);  //0  연산을 먼저하기 때문에 정수로
		System.out.println(c);

		
		
	}
}
