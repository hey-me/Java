package test1007_2;

import java.util.Scanner;


public class Ex02_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("�� ���� ��>>");
		int banN = s.nextInt();
		Ban[] ban = new Ban[banN];
		
		for (int i = 0; i < ban.length ; i++) {
			System.out.print(i+1 +"��");
			ban[i]=new Ban();
		}
		for (int i = 0; i < ban.length; i++) {
			System.out.print(i+1 +"��");
			ban[i].show();
		}
		
//		for (int j = 0; j < stuN; j++) {
//				System.out.print(i+1 + "�� " + (j+1) + "�� " + "�л� �̸�>>");
//				String str=s.next();
//				System.out.print(i+1 + "�� " + (j+1) + "�� " + str + "�л� ����>>");
//				int score=s.nextInt();
//				
//				Ban b=new Ban();
//				b.stu2.setName(str);
//				b.stu2.setScore(score);
//			}
		
	}
}

class Ban {
	Stu [] stu;
	Stu stu2=new Stu();
	Scanner s;
	int cnt=0;
	public Ban() {
		s=new Scanner(System.in);
		System.out.print("�л� ��>>");
		int a=s.nextInt();
		stu=new Stu[a];
		for (int i = 0; i < stu.length; i++) {
			System.out.print(i+1+"��° �л� �̸�>>");
			stu2.setName(s.next());
			System.out.print(i+1+"��° �л� ����>>");
			stu2.setScore(s.nextInt());
			stu[i]=new Stu(stu2.getName(),stu2.getScore());
		}
	}

	void show() {
		
		for (int i = 0; i < stu.length; i++) {
			stu[i].show();
		}
	}
}

class Stu {

	String name;
	int score;
	int cnt;
	public Stu() {
	}

	public Stu(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	void show() {
		System.out.println(getName() + "�л��� ������ " + getScore() + "�� �Դϴ�.");
	}

}
