package ch13_컬렉션프레임워크.d1022_List;

import java.util.*;

public class D1022_Ex03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		List<Subject> list = new ArrayList<>();
		System.out.print("가 과목 학점 입력");
		list.add(new Subject("가", s.nextLine()));
		System.out.print("나 과목 학점 입력");
		list.add(new Subject("나", s.nextLine()));
		System.out.print("다 과목 학점 입력");
		list.add(new Subject("다", s.nextLine()));
		System.out.print("라 과목 학점 입력");
		list.add(new Subject("라", s.nextLine()));
		System.out.print("마 과목 학점 입력");
		list.add(new Subject("마", s.nextLine()));
		System.out.print("바 과목 학점 입력");
		list.add(new Subject("바", s.nextLine()));
		
		
		int sum = 0;
		for (Subject subject : list) {
			switch (subject.score) {
			case "A": {
				sum += 4;
				break;
			}
			case "B": {
				sum += 3;
				break;
			}
			case "C": {
				sum +=2;
				break;
			}
			case "D": {
				sum += 1;
				break;
			}
			case "F": {
				sum += 0;
				break;
			}
			
			}
		}
		System.out.println("합계는 "+sum);

	}

}

class Subject {
	String subject;
	String score;

	public Subject(String subject, String score) {
		this.subject = subject;
		this.score = score;
	}
}