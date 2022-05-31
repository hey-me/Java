package ch02_변수와타입;

import java.util.Scanner;

public class P89_Ex01 {

	public static void main(String[] args) {

//		Scanner s=new Scanner(System.in);
//		System.out.print("10진수 하나를 입력하세요 : ");
//		int a = s.nextInt();
//		System.out.printf("입력 받은 수(10진수) : %d\n",a);
//		// =[System.out.println("입력 받은 수(10진수) : "+a);  ]
//		System.out.printf("8진수 : %o\n",a);
//		System.out.printf("16진수 : %x",a);
		
		//System.out.printf("나열하면 %d , %o , %x",a);  //이렇게는 안되는 이유??
		
		Scanner t=new Scanner(System.in);
		System.out.print("실수를 입력하세요 : ");
		double b = t.nextDouble();
		System.out.printf("소수6자리로(기본) : %f\n",b);
		System.out.printf("소수1자리로 : %.1f\n",b);  //소숫점 1자리는 %뒤에 .1
		System.out.printf("소수2자리로 : %.2f",b);  //소숫점 2자리는 %뒤에 .2
		
		
	}

}
