package ch02_������Ÿ��;

import java.util.Scanner;

public class P89_Ex01 {

	public static void main(String[] args) {

//		Scanner s=new Scanner(System.in);
//		System.out.print("10���� �ϳ��� �Է��ϼ��� : ");
//		int a = s.nextInt();
//		System.out.printf("�Է� ���� ��(10����) : %d\n",a);
//		// =[System.out.println("�Է� ���� ��(10����) : "+a);  ]
//		System.out.printf("8���� : %o\n",a);
//		System.out.printf("16���� : %x",a);
		
		//System.out.printf("�����ϸ� %d , %o , %x",a);  //�̷��Դ� �ȵǴ� ����??
		
		Scanner t=new Scanner(System.in);
		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		double b = t.nextDouble();
		System.out.printf("�Ҽ�6�ڸ���(�⺻) : %f\n",b);
		System.out.printf("�Ҽ�1�ڸ��� : %.1f\n",b);  //�Ҽ��� 1�ڸ��� %�ڿ� .1
		System.out.printf("�Ҽ�2�ڸ��� : %.2f",b);  //�Ҽ��� 2�ڸ��� %�ڿ� .2
		
		
	}

}
