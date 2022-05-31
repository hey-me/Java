package test1018;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class D1019_add {

	public static void main(String[] args) {
//		1. 키보드로 입력받은 문자 중에서 공백을 기준으로 몇개의 어절로 구성되었는지 출력
//		   - "끝" 이라고 입력하면 종료
//
//		2. Calendar 객체를 이용하여 현재 시간을 출력하세요
//

		Scanner s=new Scanner(System.in);
//		1번
//		while(true) {
//		String str=s.nextLine();
//		if(str.equals("끝"))
//			break;
//		String[]ar=str.split(" ");
//		System.out.println(ar.length);
//		
//		}
//		
//		2번
		Calendar today=Calendar.getInstance();
		int ap=today.AM_PM;
		String strap=null;
		if(ap==Calendar.AM) {
			strap="오전";
		}else {
			strap="오후";
		}
		
		int hour=today.MONTH;
		int min=today.MINUTE;
		int sec=today.SECOND;
		
		System.out.println("현재시간은: "+strap+" "+hour+"시 "+min+"분 "+sec+"초 입니다.");
		
	}

}
