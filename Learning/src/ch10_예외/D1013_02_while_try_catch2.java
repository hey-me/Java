package ch10_����;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Retry;

public class D1013_02_while_try_catch2 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int cnt=0;
		while(true) {
			try{
				cnt=1;
				n1();
				cnt=2;
				n2();
				cnt=3;
				System.out.println(n1()/n2());
				break;
			} catch (InputMismatchException e) {
				System.out.println("����");
				s.next();//���͸��о���� �����϶��ݺ��̾ȉ�
				
			} catch(ArithmeticException e) {
				System.out.println("0����");
				continue;
			}finally {
				if(cnt==1) {
					n1();
				}else if(cnt==2) {
					n2();
				}
			}
			
		}
	}
	static int n1() {
		System.out.print("���� 1�Է�:");
		int a=s.nextInt();
		return a;
	}
	static int n2() {
		System.out.print("���� 2�Է�:");
		int b=s.nextInt();
		return b;
	}

}
