package ch03_������;

import java.util.Scanner;

public class P126_ex1_���׿����� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = s.nextInt();
		
		String str = num>0 ? "���" : num==0 ? "��" : "����";
		
		System.out.println("�Է��� ���� " + str + "�Դϴ�.");
		
	}

}
