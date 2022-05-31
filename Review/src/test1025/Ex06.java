package test1025;
import java.util.*;
public class Ex06 {

	public static void main(String[] args) {
//5. 학생이름, 학과, 학번, 학점평균(실수값)을 입력받아 저장할 수 있는 Student 클래스와 Student 클래스를 저장할 수 있도록 map를 생성한다.
//학생 이름에 stop (대소문자무관)이 입력될 때까지 학생데이터를 입력받는다.
//입력이 종료되면 ArrayList에 입력된 모든 학생 정보를 iterator()를 이용하여 보기 좋게 출력하고,
//학생이름을 검색해서 학생의 정보를 출력할 수 있도록 작성하세요. 학생이름에 '종료'를 입력하면 프로그램이 종료되도록 하세요.
//		  - 입력형식) 홍길동, 컴퓨터,12345, 3.54
		
	}

}

class Student4{
	String name;
	String sub;
	int num;
	double avg;
	
	Student4(String n, String sb, int num, double a){
		name=n; sub=sb; this.num=num; avg=a;
	}
	
}