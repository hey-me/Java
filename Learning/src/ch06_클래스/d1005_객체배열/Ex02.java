package ch06_클래스.d1005_객체배열;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average()); // average()는 평균을 계산하여 리턴
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