package ch04_���ǹ����ݺ���;

import java.util.Scanner;

public class P149_����2 {

	public static void main(String[] args) {

//		�������� ���� Scanner�� �Է¹ް� �Է¹��� ���� ���
//		�Է¹��� �� : 5
//		���� : 3
//		���� : 8
//		5*3 =15
//		5*4 =20....
//		5*8 = 40
		
		Scanner s= new Scanner(System.in);
		System.out.print("�Է¹��� ��");
		int n1 = s.nextInt();
		System.out.print("����");
		int n2 = s.nextInt();
		System.out.print("����");
		int n3 = s.nextInt();
		
		int max = n2>n3 ? n2 : n3 ;
		int min = n2>n3 ? n3 : n2 ;
		for (int i = min  ; i <= max; i++) {
			System.out.printf("%d * %d = %d\n", n1 , i , n1*i);
		}
	
	
	}

}
