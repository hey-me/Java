package ch04_���ǹ����ݺ���;

import java.util.Scanner;

public class P140_if��scanner��� {

	public static void matavgin(String[] avgrgs) {

//		int kor = 67, mat = 65;

		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���.");
		int kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		int eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		int mat = s.nextInt();
		
		int avg = (kor + eng + mat)/3;
		
		if (avg>=90) {
			System.out.println("����� avg�Դϴ�.");
		}	else if (avg>=80) {
			System.out.println("����� B�Դϴ�.");
		}	else if (avg>=70) {
			System.out.println("����� C�Դϴ�.");
		}	else if (avg>=60) {
			System.out.println("����� D�Դϴ�.");
		}	else {
			System.out.println("����� F�Դϴ�.");
		}

	}

}
