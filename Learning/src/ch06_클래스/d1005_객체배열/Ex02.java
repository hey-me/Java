package ch06_Ŭ����.d1005_��ü�迭;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average()); // average()�� ����� ����Ͽ� ����
		s.close();
	}

}

class Grade {
	int math, science, english;
	public Grade(int math, int science, int english) {
		this.math = math; this.science = science; this.english = english;
	}
	double average () {
		return (math + science + english) / 3;
		
	}
}