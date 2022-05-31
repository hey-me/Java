package ch10_예외.d1013;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		try {
			System.out.print("정수 세개를 (1,2,3) 입력하세요");
			String str = s.nextLine();
			str = str.trim();
			String[] st = str.split(",");
		
			if (st.length>2) {
				throw new ArrayIndexOutOfBoundsException();
			}
			int sum = 0;
			for (int i = 0; i < 3; i++) {	
				sum += Integer.parseInt(st[i]);
			}
			
//			for (int i = 0; i < 3; i++) {
//				
//			}
			System.out.println(sum);
		} catch (NumberFormatException e) {
			System.out.println("정수를 입력하세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3개를 입력하세요");
		}
			catch (Exception e) {
			System.out.println("잘못입력했습니다.");
		}
//		
	}

}
