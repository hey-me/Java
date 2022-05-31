package ch10_예외;

public class D1013_03_01 {

	public static void main(String[] args) {
		
		int i=0;
		String[] ar= {"123", "345", "56.7", "789"};
		try {
		 for(i=0; i<ar.length ; i++) {
		 int num=Integer.parseInt(ar[i]);
		 System.out.println(i+1+"번째정수값: "+num);
		 	}
		 } catch (NumberFormatException e) {
			 System.out.println(ar[i]+"는 int타입이 아닙니다.");
			}
		 
	}

}

class why extends Throwable{
	
}