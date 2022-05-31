package ch06_클래스.d1007_객체배열만들;
import java.util.Scanner;

public class Manage1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("반 학생 수>>");
		int num = s.nextInt();
		Student1 student[] = new Student1[num];
		for (int i = 0; i < student.length; i++) {
			System.out.print("학생 이름>>");
			String name = s.next();
			System.out.print(name+" 학생 점수>>");
			int score = s.nextInt();
			student[i] = new Student1(name, score);
		}
		for (int i = 0; i < student.length; i++) {
			student[i].show();
		}
	}
}


class Student1 {
	private String name;
	private int score;
	
	public Student1() {
		this(null, 0);
	}
	public Student1(String name) {
		this.name = name;
	}
	public Student1(String name, int score) {
		this.name = name; this.score = score;
	}
	void show () {
		System.out.println(name+" 학생의 점수는 "+score+"점 입니다.");
	}
	
}