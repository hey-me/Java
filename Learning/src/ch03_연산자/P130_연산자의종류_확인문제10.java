package ch03_������;

import java.util.Scanner;

public class P130_������������_Ȯ�ι���10 {

	public static void main(String[] args) {

//		10.
		int var7 = 10;
		int var8 = 3;
		int var9 = 14;
		double var10 = var7 * var7 * Double.parseDouble(var8 + "." + var9);
		System.out.println("���� ����:" + var10);
		
//11	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵�:");
		String id = scanner.nextLine();
		
		System.out.print("�н�����:");
		String strpassword = scanner.nextLine();
		int password = Integer.parseInt(strpassword);
		
		if (id.equals("java"))
				{ 
			if (password == 12345) { 
				System.out.println("�α��� ����");
			}  else {
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			} 
		}  else {
			System.out.println("�α��� ����:���̵� �������� ����");
		}
		
//12.
		int q = 10;
		int w = 5;
		System.out.println( (q>7) && (w<=5) ); // True
		System.out.println( (q%3 == 2) || (w%2 != 1) );	// False
		
//13.
		int value = 0;
		
		//value = value + 10; 
		value += 10;
		//value = value - 10;
		value -= 10;		
		//value = value * 10;
		value *= 10;
		//value = value / 10;
		value /= 10;
		
//14.
		int score = 85;
		String result = (!(score>90)) ? "��" : "��";
		System.out.println(result);	//��
		
		
		
	}

}
