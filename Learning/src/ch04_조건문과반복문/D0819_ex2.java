package ch04_조건문과반복문;

import java.util.Scanner;

public class D0819_ex2 {

	public static void main(String[] args) {

//String 데이터를 Scanner에 입력		
		Scanner s= new Scanner(System.in);
		System.out.println("입력");
		String data = s.next();
		
		//if (!(data.length()==4)) {
		if (data.length() !=4){
			System.out.println("4글자가 아님");
		} else {
			for (int i = 0; i < data.length(); i++) {
				char ch = data.charAt(i);
				if (!(ch>='0' && ch <='9')) {
					System.out.println("숫자가 아님.");
					System.exit(0);
				}
			}
			int dan1=data.charAt(0)-'0';
			int dan2=data.charAt(1)-'0';
			int num1=data.charAt(2)-'0';
			int num2=data.charAt(3)-'0';
			
			
			if (dan1>dan2) {
				int t = dan1;
				dan1 = dan2;
				dan2 = t;
			}
			if (num1>num2) {
				int t = num1;
				num1 = num2;
				num2 = t;
			}
//			int max1 = dan1>dan2 ? dan2 : dan1;
//			int min1 = dan1>dan2 ? dan1 : dan2;
//			int max2 = num1>num2 ? num2 : num1;
//			int min2 = num1>num2 ? num1 : num2;
			
			for (int i = dan1; i < dan2; i++) {
				System.out.println("*** "+i+"단 ***");
				for (int j = num1; j <= num2 ; j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
			}
			
		}
		
		
		
		
	}

}
