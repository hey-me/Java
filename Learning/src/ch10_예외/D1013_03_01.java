package ch10_����;

public class D1013_03_01 {

	public static void main(String[] args) {
		
		int i=0;
		String[] ar= {"123", "345", "56.7", "789"};
		try {
		 for(i=0; i<ar.length ; i++) {
		 int num=Integer.parseInt(ar[i]);
		 System.out.println(i+1+"��°������: "+num);
		 	}
		 } catch (NumberFormatException e) {
			 System.out.println(ar[i]+"�� intŸ���� �ƴմϴ�.");
			}
		 
	}

}

class why extends Throwable{
	
}