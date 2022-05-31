package review;

import java.util.Scanner;

public class Test1_10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int odd = 0, even = 0, play = 0, num;
		
		String str;
		
		while (odd <= 5) {
			System.out.println("숫자 입력 : ");
			play++;
			num = s.nextInt() % 2;
			str = num == 0 ? "even" : "odd";
			
			if (str.equals("even")) {
				System.out.println("짝수입니다.");
				even++;
			} else {
				System.out.println("홀수입니다.");
				odd++;
			}
		}
		System.out.println(odd);
		System.out.println(even);
		System.out.println(play);
		
		
	}
}
