package d0820;

import java.util.Scanner;

public class D0820_17 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하세요");
		int mon = s.nextInt();
		
		switch (mon) {
		case 1: case 2: case 12: 
			System.out.println("겨울");
		
		case 3: case 4: case 5: 
			System.out.println("봄");
		
		case 6: case 7: case 8: 
			System.out.println("여름");
		case 9 : case 10: case 11:	
			System.out.println("가을");
		default:
			System.out.println("정확한 월을 입력하세요");
		}
	}
}
		
