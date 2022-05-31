package ch05_참조타입;

public class D0825_2_배열_연습문제1_3 {

	public static void main(String[] args) {
//		* 1차원 배열
//
//		1. 1부터 5까지 배열에 저장하세요.
//		   배열명 : ar
		int[] one = new int[5];
//		int[] ar = new int[] {1,2,3,4,5};
		for (int i = 0; i < one.length; i++) {
			one[i] = i + 1;
			System.out.print(one[i] + " ");
		}
//		2. 30개의 정수를 저장할 수 있는 배열을 선언하고 1~50사이의 랜덤한 수를
//		   배열에 저장하세요.
//		   배열명 : ar
		int[] two = new int[30];
		for (int i = 0; i < two.length; i++) {
			two[i] = (int) (Math.random() * 50 + 1);
		}
		for (int i = 0; i < two.length; i++) {
			System.out.print(two[i] + " ");
		}

//		3. 1~100사이의 랜덤한 수 50개를 배열에 저장하고 배열에 저장된 수 중에서    3의 배수의 개수를 출력하세요.

		int[] three = new int[50];
		int num = 0;
		for (int i = 0; i < three.length; i++) {
			three[i] = (int) (Math.random() * 100 + 1);
			if (three[i] % 3 == 0) {
				num++;
			}
		}
		System.out.println("\n3의 배수의 개수 : " + num);

	}

}
