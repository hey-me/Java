package ch06_Ŭ����.d1007_��ü�迭����;

import java.util.Scanner;

public class mddddd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� ��>>");
		int banN = s.nextInt();
		Ban4 ban[] = new Ban4[banN];
		
		for (int t = 0; t < ban.length; t++) {
//			
//			ban[t] = new Ban3(t+1);
//			ban[t].setBan(t+1);
			System.out.print(t+1+"���� �л� ��>>");
//			Student3 student[] = new Student3[0];
			int stuN = s.nextInt();
			Student4[] student = new Student4[stuN];
			for (int i = 0; i < ban.length; i++) {
				for (int j = 0; j < student.length; j++) {
//					ban[i].student[j] = new Student3(i);
					System.out.print(t+1+"���� �л� �̸�>>");
					ban[i].student[j].setName(s.next());
					System.out.print(t+1+"����"+ban[i].student[j].getName()+" �л� ����>>");
//					ban[i].student[j].setScore(s.nextInt());
				}
			}
		}
		
		for (int i = 0; i < ban.length; i++) {
			ban[i].student[i].show();
		}
	}
}

class Ban4 {
	int ban;
	Student3 student[];
	
	
	public Ban4(int ban) { this.ban = ban;	}
	
	public int getBan() {	return ban;}
	public void setBan(int ban) {	this.ban = ban;}

	void show () {
		System.out.print(ban+ "�� ");
	}
}

class Student4 {
	
	String name;
	int score;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getScore() {	return score;}
	public void setScore(int score) {	this.score = score;}
	
	void show() {
		System.out.println(name+"�л��� ������ "+score+"�� �Դϴ�.");
	}
	
}