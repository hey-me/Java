package d0820;

import java.util.Scanner;

public class D0820_18 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���.(111111-1111111)");
		String str = s.nextLine();
		
		char a = str.charAt(7);
//		int a = in.charAt(7)-'0';
		String b = (a=='1' || a=='3') ? "����" : "����";
		
		System.out.println(b);
		
		
		
		
	}

}
