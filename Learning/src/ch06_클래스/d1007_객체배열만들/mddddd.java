package ch06_클래스.d1007_객체배열만들;

import java.util.Scanner;

public class mddddd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("총 반의 수>>");
		int banN = s.nextInt();
		Ban4 ban[] = new Ban4[banN];
		
		for (int t = 0; t < ban.length; t++) {
//			
//			ban[t] = new Ban3(t+1);
//			ban[t].setBan(t+1);
			System.out.print(t+1+"반의 학생 수>>");
//			Student3 student[] = new Student3[0];
			int stuN = s.nextInt();
			Student4[] student = new Student4[stuN];
			for (int i = 0; i < ban.length; i++) {
				for (int j = 0; j < student.length; j++) {
//					ban[i].student[j] = new Student3(i);
					System.out.print(t+1+"반의 학생 이름>>");
					ban[i].student[j].setName(s.next());
					System.out.print(t+1+"반의"+ban[i].student[j].getName()+" 학생 점수>>");
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
		System.out.print(ban+ "반 ");
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
		System.out.println(name+"학생의 점수는 "+score+"점 입니다.");
	}
	
}