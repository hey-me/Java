package ch10_����;

import java.util.Scanner;

public class D1013_01_����Ŭ���� {
//p.444
	public static void main(String[] args )throws Exception {
//���ܴ� Ŭ������. ���ܰ� �߻��ϸ� �ش� ������ �ν��Ͻ��� ������.�׷��� Ŭ������
//		���������� �˰� �־�� ��
//		Arithmetic Exception, NullPointerException, type mismatch Exception���
//		https://docs.oracle.com/en/java/javase/17/docs/api/java.base			-java-lang
		
//		���ܰ� �߻��Ǵ� ���
//		1. throws�̿�. throws �����ٰ� �߻��Ǵ� ���������� ���� ó�����ϰ� ���������°�. �޼ҵ� ������ ����-�޼ҵ� ȣ���� ���� ���ܸ� ���ѱ�
//		throw�� ���ܸ� ������ �߻���Ű�� throws�� ���ܸ� ������ ��
//		2. try catch����
//		RuntimeException�� ��ӹ����� ���� ������
		/*
		Scanner s=new Scanner(System.in);
		try {
			System.out.print("1����: ");
		int a=s.nextInt();
		System.out.print("2����: ");
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
//p.453	
		}catch (ArithmeticException e) {
			// TODO: handle exception
			//���� catch��
		}catch (Exception e) {	//catch������ ������ ���Ÿ� ���� ������ ���ܺ��� ������� Exception�� ���� �ֻ���
			// TODO: handle exception
			System.out.println("������ �ƴմϴ�");
			return;
		} finally {	//�ᵵ�ǰ� �Ƚᵵ�ǰ�. ���ܰ� �߻��ϳ����ϳ� �����ǽ���
			System.out.println("�ٽ� ����");
		}
	*/	
		
		
		try {
			Class name=Class.forName("java.lang.byte");//Ŭ������ �̸��� java.lang.Byte�ΰ� ������ ClassŸ���� name������ �ְڴ� ��
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace(); //���ܰ� �߻��� ��Ȳ�� ���� �ڼ��ϰ� ������-����ó����
			System.out.println(e.getMessage());
			System.out.println("Ŭ������ �����ϴ�.");//���ܰ� �߻����ϸ� ����x
		}
		
		Class name=Class.forName("java.lang.Byte");
		
	}

}
