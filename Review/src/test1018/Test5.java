package test1018;

import java.util.Calendar;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
//		3. ���� �� ���߱� ����
//		�������̼� ����
//		����� ���͸� ĥ������ �ʰ� ���;���
//		���ʹ� �ι� �Է�
//		ù��° �Է������� �� �ι��� �Է������� ��
//		�ι�°-ù��° ������ �ʰ�
//		���ϴ� ������
//		User2[]user=null;
		Scanner s=new Scanner(System.in);
		
//		System.out.print("������ �ο� ��: ");
//		user=new User2[s.nextInt()];
//		for (int i = 0; i < user.length; i++) {
//			user[i]=new User2();
//		}
//		int cnt=0;
//		while(true) {
//			if(cnt==user.length) {
//				System.out.println("����");
//				break;
//			}else {
			System.out.println("ù��° ���͸� �Է��ϼ���: ");
			String s1=s.nextLine();
			Calendar c=Calendar.getInstance();
			int t1=c.get(Calendar.SECOND);
			System.out.println(t1);
			
			System.out.println("�ι�° ���͸� �Է��ϼ���: ");
			s1=s.nextLine();
			c=Calendar.getInstance();
			int t2=c.get(Calendar.SECOND);
			System.out.println(t2);
			System.out.println("������ �ʴ�: "+(t2-t1));
//			cnt++;
//			}
//		}
		

	}
}
