package ch07_���.����;

public class P315_ex_people�θ������ȣ�� {

	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}

//�θ� Ŭ����
class People {
	public String name;
	public String ssn;

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

//�ڽ� Ŭ����
class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}