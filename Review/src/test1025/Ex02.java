package test1025;

import java.util.*;

public class Ex02 {
	static Scanner s;
	static Map<String, String> map=new HashMap<String, String>();
	public static void main(String[] args) {

//		2. 1번 문제를 확장하여 사용자가 단어의 쌍(영어, 한글)을 추가할 수 있도록 기능을 추가해서 작성해보세요.
		s=new Scanner(System.in);
		point1:
		while(true) {
		System.out.print("단어를 입력하시겠습니까?(Y/N)");
		String answer=s.next();
		if(answer.equals("Y")) {
		input();
		}else if(answer.equals("N")){
			break;
		}else {
			System.out.println("잘못 입력했습니다.");
			continue point1;
		}
		}
		point2:
		while(true) {
		System.out.print("추가할 단어가 있습니까?(Y/N)");
		String answer2=s.next();
		if(answer2.equals("Y")) {
			input();
		}else if(answer2.equals("N")){
			search();
			break;
		}else {
			System.out.println("잘못 입력했습니다.");
			continue point2;
		}
		}
		

	}
	static void input() {
		s=new Scanner(System.in);
		String eng; String kor=null;
		here1:
		while(true) {
		System.out.print("영어를 입력: ");
		eng=s.nextLine();
		if(eng.equals("그만")){break;}
		for (int i = 0; i < eng.length(); i++) {
			if(String.valueOf(eng.charAt(i)).matches("[a-zA-Z]")){
			}else {
				System.out.println("영어로 입력하세요");
				continue here1;
			}
			
		}
		
		
		here2:
		while(true) {
		System.out.print("해석 입력: ");
		kor=s.nextLine();
		if(kor.equals("그만")) {break;}
			for (int i = 0; i < kor.length(); i++) {
			if(String.valueOf(kor.charAt(i)).matches("[ㄱ-ㅎㅏ-ㅣ가-힣]")){
			}else {
				System.out.println("한글로 입력하세요");
				continue here2;
				}
			}
			map.put(eng, kor);
			continue here1;
		}
		
		}
	}
	static void search() {
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while(true) {
			String result=iterator.next();
			System.out.print("검색할 영어를 입력: ");
			String key=s.next();
			
			if(key.equals("stop")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			if(key.equals(result)) {
				String value=map.get(key);
				System.out.println(key+"에 해당하는 한글은: "+value);
			}else {
				System.out.println("해당하는 단어가 없습니다.");
			}
		}
	}

}
