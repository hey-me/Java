package ch11_�⺻APIŬ����;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D1019_01_java_util {

	public static void main(String[] args) {
//util��Ű���� import�ؾ���
		
//		p.514

//			Date now=new Date();
//			String strNow1=now.toString();
//			System.out.println(strNow1);
//			
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
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
				case Calendar.MONDAY: strWeek="��"; break;
				case Calendar.TUESDAY: strWeek="ȭ"; break;
				case Calendar.WEDNESDAY: strWeek="��"; break;
				case Calendar.THURSDAY: strWeek="��"; break;
				case Calendar.FRIDAY: strWeek="��"; break;
				case Calendar.SATURDAY: strWeek="��"; break;
				default: strWeek="��";
			}
			
			int amPm=now.get(Calendar.AM_PM);
			String strAmPm=null;
			if(amPm==Calendar.AM) {
				strAmPm="����";
			}else {
				strAmPm="����";
			}
			
			int hour=now.get(Calendar.HOUR);
			int minute=now.get(Calendar.MINUTE);
			int second=now.get(Calendar.SECOND);
					
			System.out.println(year);
			System.out.println(month);
			System.out.println(day);
			System.out.println(strWeek);
			System.out.println(strAmPm);
			System.out.println(hour+"��"+minute+"��"+second+"��");
	}

}
