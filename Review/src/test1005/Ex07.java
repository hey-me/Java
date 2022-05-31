package test1005;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		MonthSchedule april = new MonthSchedule(30); // 4������ �� ��
		april.run();
	}
}

class Day {

	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	} // work�� ���� ���ͼ���

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�."); // ���� Ŭ������ �ʵ�� ���������ڰ� �־ ������� �� �� ����
		else
			System.out.println(work + "�Դϴ�.");
	}

}

class MonthSchedule {
	Day[] day; // DayŸ���� �迭 ���� �� ����, ����X
	int i = 0;
	Scanner s = new Scanner(System.in);

	public MonthSchedule(int d) {
		day = new Day[d]; // �迭����.�ּҸ� ������ ����. �迭��ҿ��� �ƹ��͵� ���� null���� �ִ°� �ƴ϶� �ʱ�ȭX

		for (int i = 0; i < day.length; i++) {
			day[i] = new Day();
		}
	}

	void input() {
		System.out.print("��¥(1~30)?");
		int d = s.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String str = s.next();
		day[d - 1].set(str); // day[d-1]�� dayŸ���� �������� ����. �׷��� day�� ���� . �� ���� Day�� �ν��Ͻ���� ����
	}

	void view() {
		System.out.print("��¥(1~30)?");
		int d = s.nextInt();
		System.out.print(d + "���� ������ ");
		day[d - 1].show();
	}

	void finish() {
		System.out.println("���α׷��� �����մϴ�.");

	}

	void run() {
		System.out.println("�̹��� ������ ���α׷�");

		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3)>> ");
			int n = s.nextInt();
			switch (n) {
			case 1:
				input();
				break;

			case 2:
				view();
				break;

			case 3:
				finish();
				System.exit(0);
			}
		}
	}
}