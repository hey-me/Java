package ch07_상속.예제;

public class P315_ex_people부모생성자호출 {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}

//부모 클래스
class People {
	public String name;
	public String ssn;

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

//자식 클래스
class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}