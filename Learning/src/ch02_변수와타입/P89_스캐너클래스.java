package ch02_변수와타입;

import java.util.Scanner;

public class P89_스캐너클래스 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in); //키보드로 입력한 내용 사용	
		System.out.print("정수 하나를 입력하세요 : ");
		int num1=s.nextInt(); //enter쳐야ㅑ됨
		System.out.print("실수 하나를 입력하세요 : ");
		double num2=s.nextDouble();
		System.out.print("문자 하나를 입력하세요 : ");
		//int ch=s.nextInt();  //문자로 하니까 오류
		String ch=s.next();
		System.out.print("문자열 하나를 입력하세요 : ");
		String str=s.next();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(ch);
		System.out.println(str);
		
	//연습
		Scanner a= new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name=a.next();
		System.out.print("나이를 입력하세요 : ");
		int age=a.nextInt();
		System.out.println("키를 (소수점 1자리까지) 입력하세요 : ");
		double height=a.nextDouble();
		System.out.print("주소를 입력하세요 : ");
		a.nextLine(); //다음줄때문에 추가
		String add=a.nextLine();  //띄어쓰기까지 나오려면 line 근데 이거 붙이고 나면 주소 입력전에 출력되므로 윗줄에 
		
		System.out.println("제 이름은 "+name+"입니다.");
		System.out.println("제 나이는 "+age+"입니다.");
		System.out.println("제 키는 "+height+"입니다.");
		System.out.println("주소는 "+add+"입니다.");
		
	}

}
