package ch04_���ǹ����ݺ���.����;

import java.util.Scanner;

public class P143_ex_SwitchChar��ĳ������ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� : ");
//		String num = s.next();
//		char grade = num.charAt(0);
		char grade = s.next().charAt(0); // �� �� ���� �ϳ��� �ϸ�! s.next().charAt(0)

//		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ�� �Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ�� �Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}

	}
}
