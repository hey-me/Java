package ch13_컬렉션프레임워크.예제;

import java.util.*;

public class P582_확인문제8 {

	public static void main(String[] args) {
		
		Set<Student111> set = new HashSet<Student111>();
		
		set.add(new Student111(1, "홍길동"));
		set.add(new Student111(2, "신용권"));
		set.add(new Student111(1, "조민우"));
		
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
