package ch10_예외;

import java.util.Scanner;

public class D1013_03_04 {

	public static void main(String[] args) {
//1~100사이의 랜덤값을 맞추는 프로그램 예외처리
		Scanner s=new Scanner(System.in);
		int answer=(int)(Math.random()*100)+1;
		int cnt=0;
		System.out.println(answer);
		while(true) {
			System.out.println("1과 100사이의 값을 입력하세요:");
			try{
				int a=s.nextInt();
				if(answer==a) {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 "+(cnt+1)+"번 입니다.");
					break;
				}else if(answer>a) {
					System.out.println("더 큰 수를 입력하세요.");
				}else {
					System.out.println("더 작은 수를 입력하세요.");
				}
			} catch(Exception e) {
				System.out.println("유효하지 않는 값입니다. 다시 입력하세요.");
				s.next();
			}
			cnt++;
		}
	}

}
