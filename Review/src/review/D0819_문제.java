package review;

import java.util.Scanner;

public class D0819_���� {

	public static void main(String[] args) {

		//d���� �빮�ڸ� �Է¹޾� �Է¹��� ���ں��� Z���� ��µǰ� �Ͻÿ�
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�����빮�ڸ� �Է��ϼ���.");
		String str = s.nextLine();
		char ch = str.charAt(0);
		
		for (char i = ch ; i <= 'Z'; i++) {
			System.out.println(i);
		}
		
	}

}
