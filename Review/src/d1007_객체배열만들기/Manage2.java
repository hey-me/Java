package d1007_��ü�迭�����;

import java.util.Scanner;

public class Manage2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� �Է�>>");
		int ban = s.nextInt();
		Ban2 b[] = new Ban2[ban];
		System.out.print("�� �л� ��>>");
		int num = s.nextInt();
		Student2 student[] = new Student2[num];
		for (int i = 0; i < student.length; i++) {
			System.out.print("�л� �̸�>>");
			String name = s.next();
			System.out.print(name+" �л� ����>>");
			int score = s.nextInt();
			student[i] = new Student2(name, score);
		}
		for (int i = 0; i < student.length; i++) {
			student[i].show();
		}
	}
}

class Ban2  {
	private int ban;
	
	public Ban2() {
	}
	public Ban2(int ban) {
		this.ban = ban;
	}

	void show () {
		System.out.print(ban+" �� ");
	
	}
}
class Student2 extends Ban2 {
	private String name;
	private int score;

	public Student2() {
		super();
	}
	public Student2(String name) {
		super();
		this.name = name;
	}
	public Student2(String name, int score) {
		super();
		this.name = name; this.score = score;
	}
	void show () {
		System.out.println(name+" �л��� ������ "+score+"�� �Դϴ�.");
	}
	
}