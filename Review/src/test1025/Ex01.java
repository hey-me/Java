package test1025;
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
//		1. (영어, 한글) 단어를 쌍으로 HashMap에 저장하고 영어로 한글을 검색하는 프로그램을 작성해보세요. "exit"를 입력하면 종료되도록 하세요.
		Map<String, String> map=new HashMap<String, String>();
		Scanner s=new Scanner(System.in);
//		예외발생을하려면 throw, 예외를 던지려면 throws
		String eng=null; String kor=null;
		here1:
		while(true) {
		System.out.print("영어를 입력: ");
		eng=s.nextLine();
		if(eng.equals("그만")){break;}
		for (int i = 0; i < eng.length(); i++) {
			if(String.valueOf(eng.charAt(i)).matches("[a-zA-z]")){
			}else {
				System.out.println("영어만 입력하세요");
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
				System.out.println("한글만 입력하세요");
				continue here2;
				}
			}
			map.put(eng, kor);
			continue here1;
		}
		
		}
		
	
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		String result=iterator.next();
		while(true) {
			
			System.out.print("검색할 영어를 입력: ");
			String key=s.next();
			
			if(key.equals("stop")) {
				System.out.println("종료합니다.");
				break;
			}
			if(key.equals(result)) {	//containsKey를 이용가능 map.contains(key)
				
				String value=map.get(key);
				System.out.println(key+"에 해당하는 한글은: "+value);
			}else {
				System.out.println("해당하는 단어가 없습니다.");
			}
		}
		
		

	}

}
