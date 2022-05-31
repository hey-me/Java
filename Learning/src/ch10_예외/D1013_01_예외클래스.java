package ch10_예외;

import java.util.Scanner;

public class D1013_01_예외클래스 {
//p.444
	public static void main(String[] args )throws Exception {
//예외는 클래스다. 예외가 발생하면 해당 예외의 인스턴스가 생성됌.그래서 클래스임
//		예외종류를 알고 있어야 함
//		Arithmetic Exception, NullPointerException, type mismatch Exception등등
//		https://docs.oracle.com/en/java/javase/17/docs/api/java.base			-java-lang
		
//		예외가 발생되는 경우
//		1. throws이용. throws 절에다가 발생되는 예외종류를 쓰면 처리안하고 던져버리는거. 메소드 단위로 실행-메소드 호출한 곳에 예외를 떠넘김
//		throw는 예외를 강제로 발생시키고 throws는 예외를 던지는 것
//		2. try catch구문
//		RuntimeException에 상속받으면 실행 예외임
		/*
		Scanner s=new Scanner(System.in);
		try {
			System.out.print("1숫자: ");
		int a=s.nextInt();
		System.out.print("2숫자: ");
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
//p.453	
		}catch (ArithmeticException e) {
			// TODO: handle exception
			//다중 catch문
		}catch (Exception e) {	//catch구문을 여러개 쓸거면 가장 하위의 예외부터 적어야함 Exception은 가장 최상위
			// TODO: handle exception
			System.out.println("정수가 아닙니다");
			return;
		} finally {	//써도되고 안써도되고. 예외가 발생하나안하나 무조건실행
			System.out.println("다시 실행");
		}
	*/	
		
		
		try {
			Class name=Class.forName("java.lang.byte");//클래스의 이름이 java.lang.Byte인게 있으면 Class타입의 name변수에 넣겠단 뜻
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace(); //예외가 발생한 상황에 대한 자세하게 보여줌-예외처리됌
			System.out.println(e.getMessage());
			System.out.println("클래스가 없습니다.");//예외가 발생안하면 실행x
		}
		
		Class name=Class.forName("java.lang.Byte");
		
	}

}
