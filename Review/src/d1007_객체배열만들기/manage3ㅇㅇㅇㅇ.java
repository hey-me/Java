package d1007_��ü�迭�����;

import java.util.Scanner;

public class manage3�������� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� ��>>");
		int banN = s.nextInt();
		Ban3[] ban = new Ban3[banN];
		for (int i = 0; i < ban.length; i++) {
			ban[i] = new Ban3();
		}
		for (int i = 0; i < banN; i++) {
			ban[i].setBan(i+1);
			System.out.print(i+1+"���� �л� ��>>");
			int stuN = s.nextInt();
			Student3[] student = new Student3[stuN];
			for (int j = 0; j <stuN; j++) {
					student[j] = new Student3();
					System.out.print(i+1+"�� "+(j+1)+"�� "+ "�л� �̸�>>");
					String name = s.next();
					System.out.print(i+1+"�� "+(j+1)+"�� "+name+"�л� ����>>");
					String score = s.next();
					ban[i].arr(new Student3(name,score));
			}
		}
//		for (int i = 0; i < ban.length; i++) {
//			for (int j = 0; j < ban[i].cnt ; j++) {
//				ban[i].show();
//				ban[i].student[j].show();;
//			}
//		}
		
		System.out.print("�� ��??");
		int ddd = s.nextInt();
		for (int i = 0; i < ban.length; i++) {
			ban[ddd-1].student[i].show();
		}
	}
}

class Ban3 {
	public Student3[] student;
	int ban=1;
	int cnt = 0;
	public Ban3() { 
		student = new Student3[5];;
		}
	public Ban3(int ban) { this.ban = ban;}
	public int getBan() {	return ban;}
	public void setBan(int ban) {	this.ban = ban;}
	void arr(Student3 student) {
		this.student[cnt++]= student;	
	}
	void show () {
		System.out.print(ban+ "�� ");
		
	}
}

class Student3{
	
	String name;
	String score;
	
	public Student3() {
//		this(name, score);
		}
	public Student3(String name, String score) {this.name = name; this.score = score; }
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getScore() {	return score;}
	public void setScore(String score) {	this.score = score;}
	
	void show() {
		System.out.println(name+"�л��� ������ "+score+"�� �Դϴ�.");
	}
	
}