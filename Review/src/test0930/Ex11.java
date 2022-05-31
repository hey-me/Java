package test0930;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		String str=s.next();
		
		Calc cal;
		
		switch(str) {
		case "+":
			cal=new Add();
			cal.setValue(a, b);
			System.out.println(cal.calculate());
			break;				
		case "-":
			cal=new Sub();
			cal.setValue(a, b);
			System.out.println(cal.calculate());
			break;			
		case "*":
			cal=new Mul();
			cal.setValue(a, b);
			System.out.println(cal.calculate());
			break;			
		case "/":
			cal=new Div();
			cal.setValue(a, b);
			System.out.println(cal.calculate());
			break;			
		default: System.out.println("������ �Է��� �߸��Ǿ����ϴ�.");
		}
	}

}

 abstract class Calc {
	 int a;
	 int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	abstract int calculate();
}
class Add extends Calc{
	
	@Override
	void setValue(int a, int b) {
		super.setValue(a, b);
		
	}

	@Override
	int calculate() {
		return a+b;
	}
	
	
	

}
class Sub extends Calc{
	void setValue(int a, int b) {
		super.setValue(a, b);
	}

	@Override
	int calculate() {
		return a-b;
	}

}
class Mul extends Calc{	
	@Override
	void setValue(int a, int b) {
		super.setValue(a, b);
	}

	@Override
	int calculate() {
		return a*b;
	}
}
class Div extends Calc{	
	@Override
	void setValue(int a, int b) {
		super.setValue(a, b);
	}

	@Override
	int calculate() {
		return a/b;
	}
}