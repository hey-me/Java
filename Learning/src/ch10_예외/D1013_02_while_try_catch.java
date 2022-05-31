package ch10_예외;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D1013_02_while_try_catch {

	public static void main(String[] args) {
//		에러나는 줄 블럭처리하고 alt+shift+z 누르면 try/catch자동완성
		
		Scanner s=new Scanner(System.in);
		boolean reverse=false;
		while(true) {
			try{
				System.out.print("숫자 1입력:");
				int n1=s.nextInt();
		while(reverse!=true) {
				System.out.print("숫자 2입력:");
				int n2=s.nextInt();
			
				System.out.println(n1/n2);
				reverse=true;
			}
			}
		catch (InputMismatchException e) {
				System.out.println("정수");
				s.next();//엔터를읽어줘야 예외일때반복이안됌
			} catch(ArithmeticException e) {
				System.out.println("0제외");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
