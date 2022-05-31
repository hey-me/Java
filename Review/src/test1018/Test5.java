package test1018;

import java.util.Calendar;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
//		3. 근접 초 맞추기 게임
//		여러명이서 게임
//		사람은 엔터를 칠때마다 초가 나와야함
//		엔터는 두번 입력
//		첫번째 입력했을때 초 두번쨰 입력했을때 초
//		두번째-첫번째 차이의 초가
//		원하는 근접초
//		User2[]user=null;
		Scanner s=new Scanner(System.in);
		
//		System.out.print("참여할 인원 수: ");
//		user=new User2[s.nextInt()];
//		for (int i = 0; i < user.length; i++) {
//			user[i]=new User2();
//		}
//		int cnt=0;
//		while(true) {
//			if(cnt==user.length) {
//				System.out.println("종료");
//				break;
//			}else {
			System.out.println("첫번째 엔터를 입력하세요: ");
			String s1=s.nextLine();
			Calendar c=Calendar.getInstance();
			int t1=c.get(Calendar.SECOND);
			System.out.println(t1);
			
			System.out.println("두번째 엔터를 입력하세요: ");
			s1=s.nextLine();
			c=Calendar.getInstance();
			int t2=c.get(Calendar.SECOND);
			System.out.println(t2);
			System.out.println("유저의 초는: "+(t2-t1));
//			cnt++;
//			}
//		}
		

	}
}
