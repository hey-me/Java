package ch10_����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D1013_03_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		try {
//		System.out.print("ù���� ����:");
//		int a=s.nextInt();
//		System.out.print("�ι��� ����:");
//		int b=s.nextInt();
//		System.out.print("������ ����:");
//		int c=s.nextInt(); 					//���� ������ for������ ��� ����
//		System.out.println(a+b+c);
//		} catch(NumberFormatException e) {
//			System.out.println("������ �Է��ϼ���"); 
//		}
		
		int sum=0, num=0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+"��° ���� �Է�: ");
			try {
				num=s.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼ���"); 
				s.next();
				i--;
				continue;
			}
			sum+=num;
		}
		System.out.println("3�� ���� ��: "+sum);
	}

}
