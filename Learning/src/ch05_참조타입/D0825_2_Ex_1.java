package ch05_참조타입;

public class D0825_2_Ex_1 {

	public static void main(String[] args) {

//		1. 다음 배열에 담긴 모든 값의 합을 계산하여 출력하세요.
//		int[] ar = { 10, 20, 30, 40, 50 };
//		int sum = 0;
//		for (int i = 0; i < ar.length; i++) {
//			sum += ar[i];
//		}
//		System.out.println(sum);

//		2. 배열 ans에 있는 값을 읽어 읽은 값에 개수를 누적하여 누적한 개수만큼 '*'를 출력하도록 하세요.
		int[] ans = { 2, 4, 2, 3, 5, 2, 1, 2, 5, 3, 3, 2, 2, 1, 1, 5, 4, 5 };
//		 - 출력결과
//		   1***
//		   2******
//		   3***
//		   4**
//		   5****
		int[] res = new int[5];
		int index = 0;
		for (int i = 0; i < ans.length; i++) {
//			index = ans[i] - 1;
//			res[index]++;
			res[ans[i] - 1]++;
		}
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(res[i]+" ");
//		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
			for (int j = 1; j <= res[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//

	}

}
