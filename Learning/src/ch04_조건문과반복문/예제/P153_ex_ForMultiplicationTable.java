package ch04_조건문과반복문.예제;

public class P153_ex_ForMultiplicationTable {

	public static void main(String[] args) {

		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + " ***");
			for (int n = 1; n <= 9; n++) {
				// System.out.println(m + " * " + n + " = " + m * n);
				System.out.printf("%d * %d = %d\n", m, n, m * n);
			}
		}

	}

}
