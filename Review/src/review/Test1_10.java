package review;

import java.util.Scanner;

public class Test1_10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int odd = 0, even = 0, play = 0, num;
		
		String str;
		
		while (odd <= 5) {
			System.out.println("���� �Է� : ");
			play++;
			num = s.nextInt() % 2;
			str = num == 0 ? "even" : "odd";
			
			if (str.equals("even")) {
				System.out.println("¦���Դϴ�.");
				even++;
			} else {
				System.out.println("Ȧ���Դϴ�.");
				odd++;
			}
		}
		System.out.println(odd);
		System.out.println(even);
		System.out.println(play);
		
		
	}
}
