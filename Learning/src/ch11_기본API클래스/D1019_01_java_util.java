package ch11_기본API클래스;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D1019_01_java_util {

	public static void main(String[] args) {
//util패키지는 import해야함
		
//		p.514

//			Date now=new Date();
//			String strNow1=now.toString();
//			System.out.println(strNow1);
//			
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//			String strNow2=sdf.format(now);
//			System.out.println(strNow2);
			
//		p.515
			Calendar now=Calendar.getInstance();
			int year=now.get(Calendar.YEAR);
			int month=now.get(Calendar.MONTH)+1;
			int day=now.get(Calendar.DAY_OF_MONTH);
			int week=now.get(Calendar.DAY_OF_WEEK);
			String strWeek=null;
			
			switch(week){
				case Calendar.MONDAY: strWeek="월"; break;
				case Calendar.TUESDAY: strWeek="화"; break;
				case Calendar.WEDNESDAY: strWeek="수"; break;
				case Calendar.THURSDAY: strWeek="목"; break;
				case Calendar.FRIDAY: strWeek="금"; break;
				case Calendar.SATURDAY: strWeek="토"; break;
				default: strWeek="일";
			}
			
			int amPm=now.get(Calendar.AM_PM);
			String strAmPm=null;
			if(amPm==Calendar.AM) {
				strAmPm="오전";
			}else {
				strAmPm="오후";
			}
			
			int hour=now.get(Calendar.HOUR);
			int minute=now.get(Calendar.MINUTE);
			int second=now.get(Calendar.SECOND);
					
			System.out.println(year);
			System.out.println(month);
			System.out.println(day);
			System.out.println(strWeek);
			System.out.println(strAmPm);
			System.out.println(hour+"시"+minute+"분"+second+"초");
	}

}
