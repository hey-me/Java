package ch03_연산자;

public class P127_연산자의종류_확인문제1 {

	public static void main(String[] args) {

//		1.
		byte b = 5;
		// b = -b;
		b = (byte) -b;
		int result = 10 / b;
		System.out.println(result);

//		2.
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		//?? 괄호 무슨 의미?
		System.out.println(z);
		// x=11 y=19 z=11+20=31
		
//		3.???????????????
		boolean stop = true ;
		while (!stop) { 
			
			}	
		System.out.println(stop);
				
		
//		4.
		int pencils = 534;
		int students = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
		
//		5.
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
				
//		6.
		int value = 356;
		System.out.println(value/100*100);
		
//		7.
		float var5= 10f;
		float var6 = var5 /100;
		if (var6 ==0.1f) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		
//		8.
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		//double area = ((double)(lengthTop+lengthBottom) *height/2);
		double area = ((lengthTop+lengthBottom) *height/2.); //2 뒤에 소수점만 찍어도 됨.(double로 바뀜)
		System.out.println(area);
		
		
		
	}

}
