package ch04_조건문과반복문.예제;

public class P152_ex_ForSumFrom1to100 {

	public static void main(String[] args) {

		int sum = 0;

		int i = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}

}
