package test1022;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
//		5. 학생이름, 학과, 학번, 학점평균(실수값)을 입력받아 저장할 수 있는 Student 클래스와 Student 클래스를 저장할 수 있도록 ArrayList를 생성한다.
//		학생 이름에 stop (대소문자무관)이 입력될 때까지 학생데이터를 입력받는다. 
//		입력이 종료되면 ArrayList에 입력된 모든 학생 정보를 iterator()를 이용하여 보기 좋게 출력하고,
//		학생이름을 검색해서 학생의 정보를 출력할 수 있도록 작성하세요. 학생이름에 '종료'를 입력하면 프로그램이 종료되도록 하세요.
//		  - 입력형식) 홍길동, 컴퓨터, 12345, 3.54
//		student클래스를 만들어서 이름 학과는 string 평균은double 
		
		Scanner s=new Scanner(System.in);
		List<Student> list=new ArrayList<Student>();
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요");
		while(true) {
			String str=s.next();
			String [] sr=str.split(",");
			for (int i = 0; i < sr.length; i++) {
				sr[i]=sr[i].trim();
			}
			Student st=new Student(sr[0],sr[1],Integer.parseInt(sr[2]),Double.parseDouble(sr[3]));
			if(sr[0]=="stop") {
				break;
			}else {
				list.add(st);
			}
		}
		Iterator<Student> it=list.iterator();
		System.out.println("<<입력된 모든 학생의 정보>>");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
class Student{
	String name;
	String major;
	int num;
	double avg;
	
	Student(String name, String major, int num, double avg){
		this.name=name;
		this.major=major;
		this.num=num;
		this.avg=avg;
	}
}
