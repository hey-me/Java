package d0820;

import java.util.Scanner;

public class D0820_17 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���");
		int mon = s.nextInt();
		
		switch (mon) {
		case 1: case 2: case 12: 
			System.out.println("�ܿ�");
		
		case 3: case 4: case 5: 
			System.out.println("��");
		
		case 6: case 7: case 8: 
			System.out.println("����");
		case 9 : case 10: case 11:	
			System.out.println("����");
		default:
			System.out.println("��Ȯ�� ���� �Է��ϼ���");
		}
	}
}
		
