package ch02_변수와타입.예제;

public class P74_ex_Promotion {

	public static void main(String[] args) {

		byte byteValue =10;  //128이면 오류남. 범위 넘어서
		int intValue = byteValue;
		System.out.println("intValue: "+intValue); //10
		
		char charValue= '가';
		intValue = charValue; //선언은 한번만(여긴 int ___안하고 그냥 씀.)
		// short shortValue=charValue; (오류/short는 대략-30000~30000, char는 0~65535)
		//오류 안나려면 (short)로 강제 변환.. but 값의 변화가 생길 수 있음.
		short shortValue=(short)charValue;
		System.out.println("가의 유니코드: "+ intValue); //44032
		
		intValue=50;
		long longValue=intValue; //int=>long
		System.out.println("longValue: "+longValue); //50
		
		longValue=100;
		float floatValue = longValue; //long=>float 
		System.out.println("floatValue: "+floatValue); //100
		
		floatValue=100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+ doubleValue); //100.5
		
		
	}

}
