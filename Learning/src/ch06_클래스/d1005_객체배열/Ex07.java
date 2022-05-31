package ch06_Ŭ����.d1005_��ü�迭;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4������ �� ��
		april.run();
	}
}

class Day {
	private String work  ; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule {
	
	Scanner scanner = new Scanner(System.in);
	private Day day[];
	
	public MonthSchedule(int dday) {
		day =new Day [dday];
		for (int i = 0; i < day.length; i++) {  //�ν��Ͻ� ���� ���ֱ�.
			day[i] = new Day();
		}
	}
	
	public void input(){
		System.out.print("��¥(1~30)");
		int d = scanner.nextInt();
		System.out.print("����(��ĭ�����Է�)");
		String text = scanner.next();
		day[d-1].set(text);
	}
	public void view(){
		System.out.print("��¥(1~30)");
		int d = scanner.nextInt();
		System.out.print(d+"���� �� ���� ");
		day[d-1].show();
	}
	public void finish(){
		System.out.println("���α׷��� �����մϴ�");
		System.exit(0);
	}
	public void run() {
		System.out.print("�̹��� ������ ���� ���α׷�\n");
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int num = scanner.nextInt();
			if(num ==1) {
				input();
			}
			if(num ==2) {
				view();
			}
			if(num ==3) {
				finish();
				break;
			}
		}
	}
	
}
