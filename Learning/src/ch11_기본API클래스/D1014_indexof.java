package ch11_기본API클래스;

public class D1014_indexof {

	public static void main(String[] args) {
//		p.492
//		indexOf는 지정한 문자열의 첫글자가 있는 위치를 리턴함
		String subject="자바 프로그래밍";
		
		int location=subject.indexOf("프로그래밍");	//프자가 시작하는 인덱스를 리턴해줌
		
		System.out.println(location);
		
		System.out.println(subject.length());
		int location2=subject.indexOf("자바");
		System.out.println(subject.indexOf("?"));

		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된책");
		}else {
			System.out.println("자바와 관련없음");
		}
		
	}

}
