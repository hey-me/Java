package ch10_����.d1013;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�μ��� �Է� (,)");
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
			System.out.println("0�� �Է��� �� ����");
		} catch (NumberFormatException e) {
			System.out.println("������ �Է�");
		} catch (Exception e) {
			System.out.println("2���� �Է�");
		}

	}

}
