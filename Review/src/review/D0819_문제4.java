package review;

import java.util.Scanner;

public class D0819_문제4 {

	public static void main(String[] args) {

//Switch를 이용해 월을 입력 받아 해당월의 마지막 날짜를 출력
//		1월의 마지막날은 31일입니다
//		2월...28일
//		3월 31
//		4월 30
		
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하세요");
		int mon = s.nextInt();
		
		switch (mon) {
			case 1: case 3: case 5: case 7 : case 8 : case 10 : case 12: 
				System.out.println(mon+ "월의 마지막 날은 31일 입니다.");
				break;
			case 2:
				System.out.println(mon+ "월의 마지막 날은 28일 입니다.");
				break;
			default:
				System.out.println(mon+"월의 마지막 날은 30일 입니다.");
				break;
		
		}
		
	
		}}
