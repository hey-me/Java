package test1018;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class D1019_add2 {

	public static void main(String[] args) {
//		3. ���� �� ���߱� ����
//		�������̼� ����
//		����� ���͸� ĥ������ �ʰ� ���;���
//		���ʹ� �ι� �Է�
//		ù��° �Է������� �� �ι��� �Է������� ��
//		�ι�°-ù��° ������ �ʰ�
//		���ϴ� ������
		
		Scanner s=new Scanner(System.in);
		
		
//		int now=c.get(Calendar.SECOND);

//		System.out.println(now);
		
		while(true) {
			System.out.print("���� �����ϱ��?: ");
			Calendar c=Calendar.getInstance();
			
			int now=c.get(Calendar.SECOND);
			System.out.println(now);
			try {
				int input=s.nextInt();
				if(input<now) {
					System.out.println("�̹� ���������ϴ�");
				}else if(input>now) {
					System.out.println("�����Դϴ�");
				}else if(input==now) {
					System.out.println("�����Դϴ�!");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("�߸��� �Է��Դϴ�.");
				s.next();
				}
		}
		
		
	}

}
