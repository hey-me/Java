package test1018;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class D1019_add {

	public static void main(String[] args) {
//		1. Ű����� �Է¹��� ���� �߿��� ������ �������� ��� ������ �����Ǿ����� ���
//		   - "��" �̶�� �Է��ϸ� ����
//
//		2. Calendar ��ü�� �̿��Ͽ� ���� �ð��� ����ϼ���
//

		Scanner s=new Scanner(System.in);
//		1��
//		while(true) {
//		String str=s.nextLine();
//		if(str.equals("��"))
//			break;
//		String[]ar=str.split(" ");
//		System.out.println(ar.length);
//		
//		}
//		
//		2��
		Calendar today=Calendar.getInstance();
		int ap=today.AM_PM;
		String strap=null;
		if(ap==Calendar.AM) {
			strap="����";
		}else {
			strap="����";
		}
		
		int hour=today.MONTH;
		int min=today.MINUTE;
		int sec=today.SECOND;
		
		System.out.println("����ð���: "+strap+" "+hour+"�� "+min+"�� "+sec+"�� �Դϴ�.");
		
	}

}
