package ch02_변수와타입;

import java.util.Scanner;

public class P98_변수와시스템입출력_확인문제 {

	public static void main(String[] args) {

	// 1번
		String name1 = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: " + name1);
		System.out.print("나이: " + age);
		System.out.printf("\n전화: " + tel1 + "-" + tel2 + "-" + tel3); 
		//System.out.printf("\n전화: %s-%s-%s", tel1, tel2, tel3);
		
/*	// 2번
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 수:");
		String strNum1 = scanner.next();

		System.out.print("두번째 수:");
		String strNum2 = scanner.next();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);

	// 3번

		Scanner a = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name2 = a.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		String num3 = a.next();
		System.out.print("3. 전화번호: ");
		//아래 줄을 nextline으로 적을때는 s.nextline 한 줄 더 써주기
		String num4 = a.next(); // a.nextline으로 적으려면 모두 다 nextline해줘야됨. next와 nextline둘 다 가능

		System.out.println();
		//System.out.println("\n[입력한 내용]");
		
		System.out.println("[입력한 내용]");
		System.out.println("1. 이름: "+name2);
		System.out.println("2. 주민번호 앞 6자리: "+num3);
		System.out.println("3. 전화번호: "+num4);
	*/}

}
