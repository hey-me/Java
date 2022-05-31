package ch10_예외;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D1013_02_while_try_catch3 {

	public static void main(String[] args) {
//		에러나는 줄 블럭처리하고 alt+shift+z 누르면 try/catch자동완성
		
		Scanner s=new Scanner(System.in);
		int n1=0, n2=0;
		while(true) {
			try{
				System.out.print("숫자 1입력:");
				n1=s.nextInt();
				break;
				}
			catch (InputMismatchException e) {
				System.out.println("정수");
				s.next();//엔터를읽어줘야 예외일때반복이안됌
			} catch(ArithmeticException e) {
				System.out.println("0제외");
			}catch(Exception e) {
				e.printStackTrace();
			}}
		while(true) {
			try {
				System.out.print("숫자 2입력:");
				n2=s.nextInt();
				System.out.println(n1/n2);
				break;
			}
		catch (InputMismatchException e) {
				System.out.println("정수");
				s.next();//엔터를읽어줘야 예외일때반복이안됌
			} catch(ArithmeticException e) {
				System.out.println("0제외");
			}catch(Exception e) {
				e.printStackTrace();
			}}
	}

}
