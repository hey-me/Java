package ch10_����;

import java.util.Scanner;


public class D1013_03_03 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("ù���� �Է�:");
		int a=s.nextInt();
		System.out.print("�ι��� �Է�:");
		while(true) {
		try {
			int b=s.nextInt();
			System.out.println(a/b);
			
			break;
			} catch(ArithmeticException e) {	//java.lang��Ű���� import�� ���ص� �� �� �ִ� ��Ű����
				System.out.println("0�� �Է��� �� ����");
			}
		}
	}

}
