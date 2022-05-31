package review;

import java.util.Scanner;

public class D0819_문제2 {

	public static void main(String[] args) {

		//숫자 하나를 입력받아서 1부터 입력받은 수까지의 3의 배수의 합을 출력하세요
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int num = s.nextInt();
		int sum=0;
		for (int i = 1; i <= num; i++) {
			if (i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
