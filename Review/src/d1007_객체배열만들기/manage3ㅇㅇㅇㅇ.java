package d1007_객체배열만들기;

import java.util.Scanner;

public class manage3ㅇㅇㅇㅇ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("총 반의 수>>");
		int banN = s.nextInt();
		Ban3[] ban = new Ban3[banN];
		for (int i = 0; i < ban.length; i++) {
			ban[i] = new Ban3();
		}
		for (int i = 0; i < banN; i++) {
			ban[i].setBan(i+1);
			System.out.print(i+1+"반의 학생 수>>");
			int stuN = s.nextInt();
			Student3[] student = new Student3[stuN];
			for (int j = 0; j <stuN; j++) {
					student[j] = new Student3();
					System.out.print(i+1+"반 "+(j+1)+"번 "+ "학생 이름>>");
					String name = s.next();
					System.out.print(i+1+"반 "+(j+1)+"번 "+name+"학생 점수>>");
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
		
		System.out.print("몇 반??");
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
		System.out.print(ban+ "반 ");
		
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
		System.out.println(name+"학생의 점수는 "+score+"점 입니다.");
	}
	
}