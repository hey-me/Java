package ch13_�÷��������ӿ�ũ.d1022_List;

import java.util.*;

public class D1022_Ex03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		List<Subject> list = new ArrayList<>();
		System.out.print("�� ���� ���� �Է�");
		list.add(new Subject("��", s.nextLine()));
		System.out.print("�� ���� ���� �Է�");
		list.add(new Subject("��", s.nextLine()));
		System.out.print("�� ���� ���� �Է�");
		list.add(new Subject("��", s.nextLine()));
		System.out.print("�� ���� ���� �Է�");
		list.add(new Subject("��", s.nextLine()));
		System.out.print("�� ���� ���� �Է�");
		list.add(new Subject("��", s.nextLine()));
		System.out.print("�� ���� ���� �Է�");
		list.add(new Subject("��", s.nextLine()));
		
		
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
		System.out.println("�հ�� "+sum);

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