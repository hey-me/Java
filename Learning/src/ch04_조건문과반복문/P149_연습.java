package ch04_���ǹ����ݺ���;

import java.util.Scanner;

public class P149_���� {

	public static void main(String[] args) {

		
//		�� ���� �Է¹޾� ������� ��������� 
//	��)	ù ��° �� : 5
//		�� ��° �� : 13
//		��� : 5 6 7 8 9 10 11 12 13
//		
//	��)	ù ��° �� : 10
//		�� ��° �� : 6
//		��� : 6 7 8 9 10
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("ù ��° ����?");
		int n1 = s.nextInt();
		System.out.println("�� ��° ����?");
		int n2 = s.nextInt();
		
		int n3 = n1>n2 ? n1 : n2;	 //n3�� max
		int n4 = n1>n2 ? n2 : n1;	 //n4�� min
		for (int i = n4 ; i <= n3; i++) {
			System.out.print(i + " ");
			//System.out.printf("%d " ,i);
		}
		
		
		
		
		
		
		
		
	}

}
