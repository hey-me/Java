package test1018;

import java.util.Calendar;
import java.util.Scanner;

public class Consumer {
	static Scanner s;
	Consumer[] consumer;
	int re=0;
	public Consumer(){
		s=new Scanner(System.in);
		System.out.print("������ �ο� ��: ");
		consumer=new Consumer[s.nextInt()];
		s.nextLine();
	}
	public Consumer(int a, int b){
		if(a>b)
			b+=60;
		
		this.re=b-a;
	}
	public static void main(String[] args) {
		Consumer cs=new Consumer();
		int result=cs.approach();
		
		for (int i = 0; i < cs.consumer.length; i++) {
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
			cs.consumer[i]=new Consumer(t1,t2);
		}
		for (int i = 0; i < cs.consumer.length; i++) {
			System.out.println("���: "+(i+1)+"��° �������� ���� �ʴ� "+cs.consumer[i].re+"�� �Դϴ�.");
		}
		System.out.print("���ڴ� ");
		System.out.println(Math.abs(result-cs.consumer[0].re));
		System.out.println(Math.abs(result-cs.consumer[1].re));
		
		for (int i = 0; i < cs.consumer.length; i++) {
			for (int j = i+1; j < cs.consumer.length; j++) {
				if(Math.abs(result-cs.consumer[i].re)<Math.abs(result-cs.consumer[j].re)) {
					System.out.println(j+1+"��° �����ڰ� �̰���ϴ�.");
				}if(Math.abs(result-cs.consumer[i].re)==Math.abs(result-cs.consumer[j].re)){
					System.out.println("�����ϴ�.");
				}else {
					System.out.println(i+1+"��° �����ڰ� �̰���ϴ�.");
				}
			}
		}
	
	}
	
	int approach() {
		Calendar c=Calendar.getInstance();
		return c.SECOND;
	}
}
