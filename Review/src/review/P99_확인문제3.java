package review;

import java.util.Scanner;

public class P99_Ȯ�ι���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);

		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: ");
		String name2 = a.next();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		int num3 = a.nextInt();
		System.out.print("3. ��ȭ��ȣ: ");
		a.nextLine();
		int tel1 = a.nextInt();
		System.out.print("-");
		int tel2 = a.nextInt();
		System.out.print("-");
		int tel3 = a.nextInt();
		//String num4 = a.next();
		
				

		System.out.println("[�Է��� ����]");
		System.out.println("1. �̸�: "+name2);
		System.out.println("2. �ֹι�ȣ �� 6�ڸ�: "+num3);
		//System.out.println("3. ��ȭ��ȣ: "+num4);
		System.out.printf("3. ��ȭ��ȣ: %1$03d-%2$3d-%3$4d", tel1, tel2, tel3);
		
		
	}


}