package review;

import java.util.Scanner;


public class Test1_9_re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�Է�");
		int a = s.nextInt();
		
		char b = (a>=97) ? (char)(a-32) : (a<=64) ? (char)(a+32) : (char)(a);
		// ������ �߰��Ϸ��� �������� ���
		System.out.println(b);
		
		
//		if (a<97) {
//			System.out.println(a+32);
//			
//		}	else {
//			System.out.println(a);
//		}
		
	}

}
