package d0820;

import java.util.Scanner;

public class D0820_19 {

	public static void main(String[] args) {

	
		Scanner s = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���.(111111-1111111)");
		String str = s.nextLine();

		char a = str.charAt(7);
		String b = (a == '1' || a == '3') ? " ����" : " ����";
		String c = (a == '1' || a == '2') ? "2000�� ����" : "2000�� ����";
		System.out.println(c + b);

	}

}
