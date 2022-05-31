package ch02_변수와타입;

public class P90_Printf메소드 {

	public static void main(String[] args) {

	/*	System.out.printf("형식문자",변수 또는 리터럴);
		
		형식문자(%)
			정수 => 10진수(d), 8진수(o), 16진수(x)
					10진수 숫자 출력 - %d   
			실수 => %f  기본적으로 소수점뒷6자리까지 나옴
					소수점 1자리수 %.1f   
					소수점 2자리수 %.2f
					%10.f 는 소수점까지 포함해서 10자리. 따라서 소수점 이상7자리, 소수점 이하 2자리, 왼족 빈자리 공백
					%-10.f 는 오른쪽 빈자리 공백					
			문자 => %s
			특수문자 => \t, \n, %%   
			
			ex) System.out.printf("이름:%1$s, 나이:%2$d", "김자바", 25); /$는 차례를 나타냄(1번째, 2번째)
	 */

		int a=50, b=30;
		
		System.out.printf("%d",a);
		System.out.printf("%d\n",50);    // \n을 해서 줄 바꿈(다음줄을 띄어줌)
		System.out.printf("%d",a);   // \n을 안하면 줄 안바꾸고 이어서 나옴 
		
		System.out.printf("a변수의 10진수 값은 : %d\n",a);  
		System.out.printf("a변수의 8진수 값은 : %o\n",a);  
		System.out.printf("a변수의 16진수 값은 : %x",a);  
		
		System.out.printf("a변수 : %d , b변수 : %d\n",a,b); //차례에 맞게 입력됨. a변수에는 a, b변수에는 b
		
	}

}
