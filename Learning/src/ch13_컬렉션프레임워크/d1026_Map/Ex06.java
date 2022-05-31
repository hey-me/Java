package ch13_컬렉션프레임워크.d1026_Map;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		
//		5. 학생이름, 학과, 학번, 학점평균(실수값)을 입력받아 저장할 수 있는 Student 클래스와 Student 클래스를 저장할 수 있도록 
//		ArrayList를 생성한다.
//		학생 이름에 stop (대소문자무관)이 입력될 때까지 학생데이터를 입력받는다. 
//		입력이 종료되면 ArrayList에 입력된 모든 학생 정보를 iterator()를 이용하여 보기 좋게 출력하고, 
//		학생이름을 검색해서 학생의 정보를 출력할 수 있도록 작성하세요. 
//		학생이름에 '종료'를 입력하면 프로그램이 종료되도록 하세요.
//		  - 입력형식) 홍길동, 컴퓨터,12345, 3.54
		Scanner s = new Scanner(System.in);
		
		Map<String, StudentEx06> map = new HashMap<String, StudentEx06>();
		map.put("김", new StudentEx06("자바", 1, 3));
		map.put("최", new StudentEx06("자바", 2, 4));
		map.put("이", new StudentEx06("파이썬", 1, 4.5));
		map.put("김", new StudentEx06("자바스크립트", 1, 3.3));
		
		
		//trim 이용하기 => 띄어쓰기 없어짐.
		
		System.out.print("학생 데이터 입력");
		System.out.print("학생 이름 입력");
		String name = s.next();
		while(!name.equals("stop")) {
			System.out.print("학생 학과 입력");
			String sub = s.next();
			System.out.print("학생 학번 입력");
			int num = s.nextInt();
			System.out.print("학생 학점평균 입력");
			double avg = s.nextDouble();
			
			map.put(name, new StudentEx06(sub, num, avg));
		}
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			StudentEx06 value = map.get(key);
		}
		//
		//
		//
		//
		//	
	}
}
class StudentEx06 {
	String name;
	String sub;
	int num;
	double avg;
	public StudentEx06(String sub,int num,double avg) {
		this.sub = sub; this.num = num; this.avg = avg;
	}
}
