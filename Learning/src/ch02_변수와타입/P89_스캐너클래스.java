package ch02_������Ÿ��;

import java.util.Scanner;

public class P89_��ĳ��Ŭ���� {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in); //Ű����� �Է��� ���� ���	
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num1=s.nextInt(); //enter�ľߤ���
		System.out.print("�Ǽ� �ϳ��� �Է��ϼ��� : ");
		double num2=s.nextDouble();
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		//int ch=s.nextInt();  //���ڷ� �ϴϱ� ����
		String ch=s.next();
		System.out.print("���ڿ� �ϳ��� �Է��ϼ��� : ");
		String str=s.next();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(ch);
		System.out.println(str);
		
	//����
		Scanner a= new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name=a.next();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age=a.nextInt();
		System.out.println("Ű�� (�Ҽ��� 1�ڸ�����) �Է��ϼ��� : ");
		double height=a.nextDouble();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		a.nextLine(); //�����ٶ����� �߰�
		String add=a.nextLine();  //������� �������� line �ٵ� �̰� ���̰� ���� �ּ� �Է����� ��µǹǷ� ���ٿ� 
		
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
		System.out.println("�� ���̴� "+age+"�Դϴ�.");
		System.out.println("�� Ű�� "+height+"�Դϴ�.");
		System.out.println("�ּҴ� "+add+"�Դϴ�.");
		
	}

}
