package ch10_예외.d1013;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("두수를 입력 (,)");
		String str = s.nextLine();
		str = str.trim();
		String[] st = str.split(",");
		for (int i = 0; i < st.length; i++) {
			st[i] = st[i].trim();
		}
		try {
			if (st.length > 2) {
				throw new Exception();
			}
			int n1 = Integer.parseInt(st[0]);
			int n2 = Integer.parseInt(st[1]);
			System.out.println(n1 / n2);

		} catch (ArithmeticException e) {
			System.out.println("0을 입력할 수 없음");
		} catch (NumberFormatException e) {
			System.out.println("정수만 입력");
		} catch (Exception e) {
			System.out.println("2개만 입력");
		}

	}

}
