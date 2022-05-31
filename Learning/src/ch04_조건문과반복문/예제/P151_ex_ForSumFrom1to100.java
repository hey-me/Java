package ch04_조건문과반복문.예제;

public class P151_ex_ForSumFrom1to100 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합 : " + sum);
	}

}
