package review;

import java.util.Scanner;

public class D0819_����4 {

	public static void main(String[] args) {

//Switch�� �̿��� ���� �Է� �޾� �ش���� ������ ��¥�� ���
//		1���� ���������� 31���Դϴ�
//		2��...28��
//		3�� 31
//		4�� 30
		
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���");
		int mon = s.nextInt();
		
		switch (mon) {
			case 1: case 3: case 5: case 7 : case 8 : case 10 : case 12: 
				System.out.println(mon+ "���� ������ ���� 31�� �Դϴ�.");
				break;
			case 2:
				System.out.println(mon+ "���� ������ ���� 28�� �Դϴ�.");
				break;
			default:
				System.out.println(mon+"���� ������ ���� 30�� �Դϴ�.");
				break;
		
		}
		
	
		}}
