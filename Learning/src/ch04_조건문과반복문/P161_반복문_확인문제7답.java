package ch04_���ǹ����ݺ���;

import java.util.Scanner;

public class P161_�ݺ���_Ȯ�ι���7�� {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner s = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� |4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			//String str1 = s.nextLine();
			int str = Integer.parseInt(s.nextLine());
			switch (str) {
			case 1:
				System.out.print("���ݾ�>");
				balance += Integer.parseInt(s.nextLine());
				break;
			case 2:
				System.out.print("��ݾ�>");
				balance -= Integer.parseInt(s.nextLine());
				break;
			case 3:
				System.out.println("�ܰ�>"+balance);
				break;
			default:
				System.out.println();
				run=false;
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
