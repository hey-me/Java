package d0820;

import java.util.Scanner;

public class D0820_17_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("����, ����, �� �߿� �ϳ��� �Է��ϼ���");
		String str = s.next();
		int user = (str == "����") ? 1 : (str == "����") ? 2 : 3;
		int com = (int) (Math.random() * 3 + 1);

		if (user == com)  {
			System.out.println("���º�");
		} else if ( (user == 1 && com == 2) ||(user==2 && com==3) || (user==3 && com==1) ) {
			System.out.println("�� ��");
		} else {
			System.out.println("���� ��");
		}
	}

}
