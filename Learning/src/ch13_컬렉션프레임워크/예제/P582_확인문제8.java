package ch13_�÷��������ӿ�ũ.����;

import java.util.*;

public class P582_Ȯ�ι���8 {

	public static void main(String[] args) {
		
		Set<Student111> set = new HashSet<Student111>();
		
		set.add(new Student111(1, "ȫ�浿"));
		set.add(new Student111(2, "�ſ��"));
		set.add(new Student111(1, "���ο�"));
		
		Iterator<Student111> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student111 student = iterator.next();
			System.out.println(student.studentNum+ ":"+student.name);
		}
	}
}

class Student111 {
	int studentNum;
	String name;
	
	public Student111(int studentNum,String name) {
		this.studentNum = studentNum; this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			return false;
		}
		Student111 student = (Student111) obj;
		if (studentNum != student.studentNum) {
			return false;
		} else {
			return true;
		}
	}
	
}
