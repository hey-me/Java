package ch04_���ǹ����ݺ���;

import java.util.Scanner;

public class P149_for��switch�������� {

	public static void main(String[] args) {

//		1. for���� �̿��Ͽ� ���ĺ� �빮�ڸ� ������� ����ϼ���
//		
//		char i = 'A';
//		for (i = 'A'; i <= 'Z'; i++) {
//			System.out.println(i);
//		}
//		
//		
//		2. ����, ����, ���� ������ Scanner Ŭ������ �̿��Ͽ� �Է¹ް� ����� ����� �� switch���� �̿��Ͽ� ������ ����ϼ���
//		-������ ����� 90�̻� A 80�̻� 70 60 ������ F
		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���.");
		int kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		int eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		int mat = s.nextInt();
//		???
//		???
		int avg = (kor + eng + mat)/3;
		int grade = avg/10;
		System.out.print("����� ������ ");
		switch (grade) {
		case 9: case 10: 
			System.out.print("A");
			break;
		case 8: 
			System.out.print("B");
			break;
		case 7: 
			System.out.print("C");
			break;
		case 6: 
			System.out.print("D");
			break;
		default:
			System.out.print("F");
			break;
		}
		System.out.println("�Դϴ�.");
//
//		3. 1���� 50���� ���ڸ� ���η� ������� ����ϼ��� ���ٿ� 8��
		int cnt = 0; 
		for ( int i = 1; i <=50 ; i++) {
//			System.out.print(i+" "); // �Ʒ��ٰ� ����.
			System.out.printf("%3d", i);
			cnt++;
			
			if(cnt%8==0) {
			System.out.println();
			}
		}
//			****cnt�� ������� ������ 
		for ( int i = 1; i <=50 ; i++) {
//			System.out.print(i+" "); // �Ʒ��ٰ� ����.
			System.out.printf("%3d", i);
			if(i%8==0) {
			System.out.println();
			}
		}
		
		
//		4. �������� ���� Scanner�� �Է¹ް� �Է¹��� ���� �������� ����ϼ���
//		-�Է¹��� �� : 5
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int dan = scanner.nextInt();
//		
//		for (int i = 9; i > 0; i--) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i );
//		}

		

		
		
	}
	
}
