package ch10_����;

import java.util.Scanner;

public class D1013_03_04 {

	public static void main(String[] args) {
//1~100������ �������� ���ߴ� ���α׷� ����ó��
		Scanner s=new Scanner(System.in);
		int answer=(int)(Math.random()*100)+1;
		int cnt=0;
		System.out.println(answer);
		while(true) {
			System.out.println("1�� 100������ ���� �Է��ϼ���:");
			try{
				int a=s.nextInt();
				if(answer==a) {
					System.out.println("������ϴ�.");
					System.out.println("�õ�Ƚ���� "+(cnt+1)+"�� �Դϴ�.");
					break;
				}else if(answer>a) {
					System.out.println("�� ū ���� �Է��ϼ���.");
				}else {
					System.out.println("�� ���� ���� �Է��ϼ���.");
				}
			} catch(Exception e) {
				System.out.println("��ȿ���� �ʴ� ���Դϴ�. �ٽ� �Է��ϼ���.");
				s.next();
			}
			cnt++;
		}
	}

}
