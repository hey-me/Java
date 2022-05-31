package test1018;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class D1019_add2 {

	public static void main(String[] args) {
//		3. 근접 초 맞추기 게임
//		여러명이서 게임
//		사람은 엔터를 칠때마다 초가 나와야함
//		엔터는 두번 입력
//		첫번째 입력했을때 초 두번쨰 입력했을때 초
//		두번째-첫번째 차이의 초가
//		원하는 근접초
		
		Scanner s=new Scanner(System.in);
		
		
//		int now=c.get(Calendar.SECOND);

//		System.out.println(now);
		
		while(true) {
			System.out.print("현재 몇초일까요?: ");
			Calendar c=Calendar.getInstance();
			
			int now=c.get(Calendar.SECOND);
			System.out.println(now);
			try {
				int input=s.nextInt();
				if(input<now) {
					System.out.println("이미 지나갔습니다");
				}else if(input>now) {
					System.out.println("아직입니다");
				}else if(input==now) {
					System.out.println("정답입니다!");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				s.next();
				}
		}
		
		
	}

}
