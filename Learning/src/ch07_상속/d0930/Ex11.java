package ch07_상속.d0930;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Calc calc = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a= scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		
//		switch (c) {
//		case "+":
//			calc = new Add();
//			calc.setValue(a, b);
//			System.out.println(calc.calculate());
//			break;
//		case "-":
//			calc = new Sub();
//			calc.setValue(a, b);
//			System.out.println(calc.calculate());
//			break;
//		case "*":
//			calc = new Mul();
//			calc.setValue(a, b);
//			System.out.println(calc.calculate());
//			break;
//		case "/":
//			calc = new Div();
//			calc.setValue(a, b);
//			System.out.println(calc.calculate());
//			break;
//		}
		if(c.equals("+")) {
			calc = new Add();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
		if(c.equals("-")) {
			calc = new Sub();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
		if(c.equals("*")) {
			calc = new Mul();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
		if(c.equals("/")) {
			calc = new Div();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
	}
}

abstract class Calc {
	int a;
	int b;
	abstract void setValue(int a, int b);
	abstract int calculate();
	}

class Add extends Calc {

	@Override
	void setValue(int a, int b) {this.a = a; this.b = b;}
	@Override
	int calculate() { return a+b; }
}
class Sub extends Calc {
	int a, b; 
	@Override
	void setValue(int a, int b) {this.a = a; this.b = b;}
	@Override
	int calculate() {return a-b;}
}
class Mul extends Calc {
	int a, b; 
	@Override
	void setValue(int a, int b)  {this.a = a; this.b = b;}
	@Override
	int calculate() {return a*b;}
}
class Div extends Calc {
	int a, b; 
	@Override
	void setValue(int a, int b)  {this.a = a; this.b = b;}
	@Override
	int calculate() {return a/b;}
}

