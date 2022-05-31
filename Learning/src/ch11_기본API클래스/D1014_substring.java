package ch11_기본API클래스;

public class D1014_substring {

	public static void main(String[] args) {
//		p.494
		String oldStr="자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr=oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String ssn="880815-1234567";
		String firstNum=ssn.substring(1, 6);	//가져올 시작 "인덱스", 처음부터 가져올 갯수	
		System.out.println(firstNum);
		String secondNum=ssn.substring(7);//시작인덱스부터 끝까지
		System.out.println(secondNum);
	}

}
